package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.rpc.RpcProvider;

public class PersonalMethods extends MethodsBase {
	private static final String METHOD_PREFIX = "personal";

	public PersonalMethods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	public String newAccount(String seed) {
		return null;
	}

	public Boolean unlockAccount(String addr, String pass, String duration) {
		return null;
	}

	public String[] lockAccount(String addr) {
		return null;
	}

}
