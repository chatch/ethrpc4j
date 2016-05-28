package org.chatch.ethrpc4j.databind.deserialize;

import static org.chatch.ethrpc4j.databind.Converters.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.chatch.ethrpc4j.types.Log;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LogDeserializer extends StdDeserializer<Log> {

	private static final long serialVersionUID = -5751560343256867464L;

	public LogDeserializer() {
		super(Log.class);
	}

	@Override
	public Log deserialize(JsonParser p, DeserializationContext csynct) throws IOException, JsonProcessingException {
		final JsonNode node = p.getCodec().readTree(p);

		final Log log = new Log();

		log.setBlockNumber(quantity(node, "blockNumber"));
		log.setLogIndex(quantity(node, "logIndex"));
		log.setTransactionIndex(quantity(node, "transactionIndex"));

		log.setAddress(string(node, "address"));
		log.setBlockHash(string(node, "blockHash"));
		log.setData(string(node, "data"));
		log.setTransactionHash(string(node, "transactionHash"));

		if (node.has("type"))
			log.setType(string(node, "type"));

		final JsonNode topics = node.get("topics");
		if (topics.isArray()) {
			final List<String> topicsList = new ArrayList<>(topics.size());
			for (JsonNode topic : topics) {
				topicsList.add(topic.asText());
			}
			log.setTopics(topicsList);
		}

		return log;
	}

}
