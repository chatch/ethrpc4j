package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.chatch.ethrpc4j.methods.NetMethods;
import org.chatch.ethrpc4j.rpc.HttpRpcProvider;
import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class NetMethodsITTest {

	final static String GETH_PATH = "http://localhost:8545";

	static NetMethods net;

	@BeforeClass
	public static void setUpOnce() throws MalformedURLException {
		RpcProvider provider = new HttpRpcProvider(GETH_PATH);
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
	@Ignore // Geth returning null.. not sure why ..
	public void testPeerCount() throws Throwable {
		Long peerCount = net.peerCount();
		// may not have peers yet on test run so 0 is fine
		assertThat(peerCount, greaterThanOrEqualTo(0L));
	}

}
