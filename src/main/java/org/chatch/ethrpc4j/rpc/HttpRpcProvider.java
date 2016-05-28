package org.chatch.ethrpc4j.rpc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.chatch.ethrpc4j.databind.EthRpc4jObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

public class HttpRpcProvider implements RpcProvider {

	private static final Logger LOG = LoggerFactory.getLogger(HttpRpcProvider.class);

	private static final String DEFAULT_PATH = "http://localhost:8545";
	private static final URL DEFAULT_URL;
	static {
		try {
			DEFAULT_URL = new URL(DEFAULT_PATH);
		} catch (MalformedURLException e) {
			throw new IllegalStateException("default URL malformed: " + DEFAULT_PATH);
		}
	}

	private JsonRpcHttpClient client;

	public HttpRpcProvider() {
		this(DEFAULT_URL);
	}

	public HttpRpcProvider(URL serverURL) {
		this(serverURL, new EthRpc4jObjectMapper());
	}

	public HttpRpcProvider(URL serverURL, ObjectMapper mapper) {
		this.client = new JsonRpcHttpClient(mapper, serverURL, new HashMap<String,String>());
	}

	public HttpRpcProvider(JsonRpcHttpClient client) {
		this.client = client;
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

}
