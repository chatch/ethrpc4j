package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.mapping.Converters;
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

	protected Long callQuantity(String methodName, Object[] params) throws Exception {
		String strRsp = (String) call(methodName, params, String.class);
		return Converters.hexToQuantity(strRsp);
	}

	protected Long callQuantity(String methodName) throws Exception {
		return callQuantity(methodName, null);
	}

	protected Boolean callBoolean(String methodName, Object[] params) throws Exception {
		return (Boolean) call(methodName, params, Boolean.class);
	}

	protected Boolean callBoolean(String methodName) throws Exception {
		return callBoolean(methodName, null);
	}

	protected String callString(String methodName) throws Exception {
		return callString(methodName, null);
	}

	protected String callString(String methodName, Object[] params) throws Exception {
		return (String) call(methodName, params, String.class);
	}

	private String prefixedName(String methodName) {
		return methodPrefix + "_" + methodName;
	}

}
