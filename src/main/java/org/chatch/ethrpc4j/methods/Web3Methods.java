package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.rpc.RpcProvider;

public class Web3Methods extends MethodsBase {

	private static final String METHOD_PREFIX = "web3";

	public Web3Methods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	public String clientVersion() throws Exception {
		return callString("clientVersion");
	}

	public String sha3(String data) throws Exception {
		return callString("sha3", new Object[] { data });
	}

}
