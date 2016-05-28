package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.rpc.RpcProvider;

/**
 * DB RPC methods.
 * 
 * NOTE: this is a deprecated api @see
 * <a href="https://github.com/ethereum/wiki/wiki/JSON-RPC">api docs</a>.
 */
public class DbMethods extends MethodsBase {
	private static final String METHOD_PREFIX = "db";

	public DbMethods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	@Deprecated
	public Boolean putString(String dbName, String key, String value) throws Exception {
		return callBoolean("putString", new Object[] { dbName, key, value });
	}

	@Deprecated
	public String getString(String dbName, String key) throws Exception {
		return callString("getString", new Object[] { dbName, key });
	}

	@Deprecated
	public Boolean putHex(String dbName, String key, byte[] data) throws Exception {
		return callBoolean("putHex", new Object[] { dbName, key, data });
	}

	@Deprecated
	public byte[] getHex(String dbName, String key) throws Exception {
		return (byte[]) call("getHex", new Object[] { dbName, key }, String.class);
	}

}
