package org.chatch.ethrpc4j.rpc;

import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

public class HttpRpcProvider implements RpcProvider {

	private static final Logger LOG = LoggerFactory.getLogger(HttpRpcProvider.class);

	private static final String DEFAULT_PATH = "http://localhost:8545";

	private JsonRpcHttpClient client;

	public HttpRpcProvider() throws MalformedURLException {
		this(DEFAULT_PATH);
	}

	public HttpRpcProvider(String serverURL) throws MalformedURLException {
		this.client = new JsonRpcHttpClient(new URL(serverURL));
	}

	public HttpRpcProvider(JsonRpcHttpClient jsonRpcClient) throws MalformedURLException {
		this.client = jsonRpcClient;
	}

	@Override
	public Object call(String methodName, Object[] params, Class<?> responseClass) {
		Object rsp = null;
		try {
			rsp = client.invoke(methodName, params, responseClass);
		} catch (Throwable e) {
			LOG.error(methodName + " failed", e);
		}
		return rsp;
	}

	protected String call_String(String method, Object[] params) {
		return (String) call(method, params, String.class);
	}

	protected Boolean call_Boolean(String method, Object[] params) {
		return (Boolean) call(method, params, Boolean.class);
	}

}
