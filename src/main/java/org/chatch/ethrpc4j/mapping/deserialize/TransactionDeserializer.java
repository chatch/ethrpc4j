package org.chatch.ethrpc4j.mapping.deserialize;

import static org.chatch.ethrpc4j.mapping.Converters.*;

import java.io.IOException;

import org.chatch.ethrpc4j.types.Transaction;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class TransactionDeserializer extends StdDeserializer<Transaction> {

	private static final long serialVersionUID = 8056640231156376310L;

	public TransactionDeserializer() {
		super(Transaction.class);
	}

	@Override
	public Transaction deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode node = p.getCodec().readTree(p);

		Transaction tx = new Transaction();

		tx.setHash(string(node, "hash"));
		tx.setBlockHash(string(node, "blockHash"));
		tx.setTo(string(node, "to"));
		tx.setFrom(string(node, "from"));
		tx.setInput(string(node, "input"));

		tx.setBlockNumber(quantity(node, "blockNumber"));
		tx.setTransactionIndex(quantity(node, "transactionIndex"));
		tx.setNonce(quantity(node, "nonce"));
		tx.setGas(quantity(node, "gas"));
		tx.setGasPrice(quantity(node, "gasPrice"));
		tx.setValue(quantity(node, "value"));

		return tx;
	}

}
