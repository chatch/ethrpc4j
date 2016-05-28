package org.chatch.ethrpc4j.databind.deserialize;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.chatch.ethrpc4j.databind.EthRpc4jObjectMapper;
import org.chatch.ethrpc4j.test.Utils;
import org.chatch.ethrpc4j.types.Log;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;

public class LogDeserializerTest {

	final static EthRpc4jObjectMapper mapper = new EthRpc4jObjectMapper();

	@Test
	public void testLog() throws JsonParseException, JsonMappingException, IOException {
		String json = Utils.jsonRspResult("getfilterchanges_logs");
		System.out.println(json);

		List<Log> logs = mapper.readValue(json, new TypeReference<List<Log>>() {
		});
		assertThat(logs.size(), equalTo(1));

		Log log = logs.get(0);

		assertThat(log.getAddress(), equalTo("0x16c5785ac562ff41e2dcfdf829c5a142f1fccd7d"));
		assertThat(log.getBlockHash(), equalTo("0x8216c5785ac562ff41e2dcfdf5785ac562ff41e2dcfdf829c5a142f1fccd7d"));
		assertThat(log.getTransactionHash(),
				equalTo("0xdf829c5a142f1fccd7d8216c5785ac562ff41e2dcfdf5785ac562ff41e2dcf"));
		assertThat(log.getData(), equalTo("0x0000000000000000000000000000000000000000000000000000000000000000"));

		assertThat(log.getLogIndex(), equalTo(1L));
		assertThat(log.getBlockNumber(), equalTo(436L));
		assertThat(log.getTransactionIndex(), equalTo(0L));

		assertThat(log.getTopics().size(), equalTo(1));
		assertThat(log.getTopics().get(0),
				equalTo("0x59ebeb90bc63057b6515673c3ecf9438e5058bca0f92585014eced636878c9a5"));
	}
}
