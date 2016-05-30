package org.chatch.ethrpc4j.databind.deserialize;

import static org.chatch.ethrpc4j.databind.Converters.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.chatch.ethrpc4j.databind.EthRpc4jObjectMapper;
import org.chatch.ethrpc4j.types.Block;
import org.chatch.ethrpc4j.types.Transaction;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class BlockDeserializer extends StdDeserializer<Block> {

	private static final long serialVersionUID = 5735633502874017641L;

	private static final EthRpc4jObjectMapper mapper = EthRpc4jObjectMapper.getInstance();

	public BlockDeserializer() {
		super(Block.class);
	}

	@Override
	public Block deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		JsonNode node = p.getCodec().readTree(p);

		Block block = new Block();

		block.setNumber(quantity(node, "number"));
		block.setDifficulty(quantity(node, "difficulty"));
		block.setTotalDifficulty(quantity(node, "totalDifficulty"));
		block.setSize(quantity(node, "size"));
		block.setGasLimit(quantity(node, "gasLimit"));
		block.setGasUsed(quantity(node, "gasUsed"));
		block.setTimestamp(quantity(node, "timestamp"));

		block.setHash(string(node, "hash"));
		block.setParentHash(string(node, "parentHash"));
		block.setNonce(string(node, "nonce"));
		block.setSha3Uncles(string(node, "sha3Uncles"));
		block.setLogsBloom(string(node, "logsBloom"));
		block.setTransactionsRoot(string(node, "transactionsRoot"));
		block.setStateRoot(string(node, "stateRoot"));
		block.setReceiptRoot(string(node, "receiptRoot"));
		block.setMiner(string(node, "miner"));
		block.setExtraData(string(node, "extraData"));

		if (node.has("transactions")) {
			final List<Transaction> txList = new ArrayList<>();
			for (JsonNode tx : node.get("transactions")) {
				txList.add(mapper.treeToValue(tx, Transaction.class));
			}
			block.setTransactions(txList);
		}

		if (node.has("uncles")) {
			final JsonNode uncleNodes = node.get("uncles");
			if (uncleNodes.isArray()) {
				final List<String> unclesList = new ArrayList<>(uncleNodes.size());
				for (JsonNode uncle : uncleNodes) {
					unclesList.add(uncle.asText());
				}
				block.setUncles(unclesList);
			}
		}

		return block;
	}

}
