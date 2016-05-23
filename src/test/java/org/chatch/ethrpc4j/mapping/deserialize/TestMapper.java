package org.chatch.ethrpc4j.mapping.deserialize;

import org.chatch.ethrpc4j.mapping.EthRpc4JModule;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMapper extends ObjectMapper {

	private static final long serialVersionUID = 4761661167469974231L;

	public TestMapper() {
		registerModule(new EthRpc4JModule());
	}

}
