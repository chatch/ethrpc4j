package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;

import org.chatch.ethrpc4j.methods.Web3Methods;
import org.chatch.ethrpc4j.rpc.HttpRpcProvider;
import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.junit.BeforeClass;
import org.junit.Test;

public class Web3MethodsITTest {

	final static String GETH_PATH = "http://localhost:8545";

	static Web3Methods web3;

	@BeforeClass
	public static void setUpOnce() throws MalformedURLException {
		RpcProvider provider = new HttpRpcProvider(GETH_PATH);
		EthereumClient client = new EthereumClient(provider);
		web3 = client.web3();
	}

	@Test
	public void testClientVersion() throws Throwable {
		String rsp = web3.clientVersion();
		assertThat(rsp, equalTo("Geth/v1.5.0-unstable/linux/go1.5.1"));
	}

	@Test
	public void testSha3() throws Throwable {
		String rsp = web3.sha3("0x68656c6c6f20776f726c64");
		assertThat(rsp, equalTo("0x47173285a8d7341e5e972fc677286384f802f8ef42a5ec5f03bbfa254cb01fad"));
	}

}
