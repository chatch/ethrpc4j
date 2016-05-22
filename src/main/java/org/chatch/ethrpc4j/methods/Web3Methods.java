package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.rpc.RpcProvider;

public class Web3Methods extends MethodsBase {

	private static final String METHOD_PREFIX = "web3";

	public Web3Methods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	public String clientVersion() throws Exception {
		return (String) call("clientVersion", null, String.class);
	}

	public String sha3(String data) throws Exception {
		return (String) call("sha3", new Object[] { data }, String.class);
	}

}
