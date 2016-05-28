package org.chatch.ethrpc4j.mapping.deserialize;

import static org.chatch.ethrpc4j.mapping.Converters.*;

import java.io.IOException;

import org.chatch.ethrpc4j.types.Syncing;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class SyncingDeserializer extends StdDeserializer<Syncing> {

	private static final long serialVersionUID = 8056640231156376310L;

	public SyncingDeserializer() {
		super(Syncing.class);
	}

	@Override
	public Syncing deserialize(JsonParser p, DeserializationContext csynct)
			throws IOException, JsonProcessingException {
		JsonNode node = p.getCodec().readTree(p);

		Syncing sync = new Syncing();

		if (node.isBoolean()) {
			sync.setIsSyncing(node.asBoolean());
		} else {
			sync.setIsSyncing(true);
			sync.setStartingBlock(quantity(node, "startingBlock"));
			sync.setCurrentBlock(quantity(node, "currentBlock"));
			sync.setHighestBlock(quantity(node, "highestBlock"));
			sync.setKnownStates(quantity(node, "knownStates"));
			sync.setPulledStates(quantity(node, "pulledStates"));
		}

		return sync;
	}

}
