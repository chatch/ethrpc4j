package org.chatch.ethrpc4j.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EthRpc4jObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 4761661167469974231L;

	public EthRpc4jObjectMapper() {
		registerModule(new EthRpc4JModule());
	}

}
