package org.chatch.ethrpc4j.rpc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.chatch.ethrpc4j.mapping.EthRpc4jObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

public class HttpRpcProvider implements RpcProvider {

	private static final Logger LOG = LoggerFactory.getLogger(HttpRpcProvider.class);

	private static final String DEFAULT_PATH = "http://localhost:8545";

	private JsonRpcHttpClient client;

	public HttpRpcProvider() throws MalformedURLException {
		this(DEFAULT_PATH);
	}

	public HttpRpcProvider(String serverURL) throws MalformedURLException {
		this(serverURL, new EthRpc4jObjectMapper());
	}

	public HttpRpcProvider(String serverURL, ObjectMapper mapper) throws MalformedURLException {
		this.client = new JsonRpcHttpClient(mapper, new URL(serverURL), new HashMap<>());
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
