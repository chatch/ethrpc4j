package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.rpc.RpcProvider;

public class NetMethods extends MethodsBase {

	private static final String METHOD_PREFIX = "net";

	public NetMethods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	public String version() throws Exception {
		return callString("version");
	}

	public Boolean listening() throws Exception {
		return callBoolean("listening");
	}

	public Long peerCount() throws Exception {
		return callQuantity("peerCount");
	}

}
