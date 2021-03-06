package org.chatch.ethrpc4j.methods;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.chatch.ethrpc4j.EthereumClient;
import org.chatch.ethrpc4j.rpc.HttpRpcProvider;
import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.junit.BeforeClass;
import org.junit.Test;

public class NetMethodsITTest {

	static NetMethods net;

	@BeforeClass
	public static void setUpOnce() throws MalformedURLException {
		RpcProvider provider = new HttpRpcProvider();
		EthereumClient client = new EthereumClient(provider);
		net = client.net();
	}

	@Test
	public void testVersion() throws Exception {
		String version = net.version();
		assertThat(version, equalTo("2"));
	}

	@Test
	public void testListening() throws Throwable {
		Boolean listening = net.listening();
		assertThat(listening, not(nullValue()));
	}

	@Test
	public void testPeerCount() throws Throwable {
		Long peerCount = net.peerCount();
		assertThat(peerCount, greaterThanOrEqualTo(0L));
	}

}
