package org.chatch.ethrpc4j.databind;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EthRpc4jObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 4761661167469974231L;

	private static EthRpc4jObjectMapper instance = null;

	public EthRpc4jObjectMapper() {
		registerModule(new EthRpc4JModule());
	}

	public static EthRpc4jObjectMapper getInstance() {
		if (instance == null)
			instance = new EthRpc4jObjectMapper();
		return instance;
	}

}
