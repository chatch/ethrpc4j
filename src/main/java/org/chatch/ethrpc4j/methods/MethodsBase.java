package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.rpc.RpcProvider;

public abstract class MethodsBase {

	private String methodPrefix;
	private RpcProvider provider;

	public MethodsBase(String methodPrefix, RpcProvider provider) {
		this.methodPrefix = methodPrefix;
		this.provider = provider;
	}

	protected Object call(String methodName, Object[] params, Class<?> responseClass) throws Exception {
		return provider.call(prefixedName(methodName), params, responseClass);
	}

	private String prefixedName(String methodName) {
		return methodPrefix + "_" + methodName;
	}

}
