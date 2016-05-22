package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.rpc.RpcProvider;

public class DbMethods extends MethodsBase {
	private static final String METHOD_PREFIX = "db";

	public DbMethods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	public String putString() {
		return null;
	}

	public String getString() {
		return null;
	}

	public String putHex() {
		return null;
	}

	public String getHex() {
		return null;
	}
}
