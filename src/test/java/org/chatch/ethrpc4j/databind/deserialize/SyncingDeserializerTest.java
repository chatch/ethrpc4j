package org.chatch.ethrpc4j.databind.deserialize;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.IOException;

import org.chatch.ethrpc4j.databind.EthRpc4jObjectMapper;
import org.chatch.ethrpc4j.test.Utils;
import org.chatch.ethrpc4j.types.Syncing;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class SyncingDeserializerTest {

	final static EthRpc4jObjectMapper mapper = new EthRpc4jObjectMapper();

	@Test
	public void testNotSyncing() throws JsonParseException, JsonMappingException, IOException {
		String json = Utils.jsonRspResult("syncing_boolean");
		System.out.println(json);

		Syncing sync = mapper.readValue(json, Syncing.class);
		assertFalse(sync.isSyncing());
		assertThat(sync.getCurrentBlock(), nullValue());
	}

	@Test
	public void testSyncing() throws JsonParseException, JsonMappingException, IOException {
		String json = Utils.jsonRspResult("syncing_status");
		System.out.println(json);

		Syncing sync = mapper.readValue(json, Syncing.class);
		assertTrue(sync.isSyncing());
		assertThat(sync.getCurrentBlock(), greaterThanOrEqualTo(1L));
	}
}
