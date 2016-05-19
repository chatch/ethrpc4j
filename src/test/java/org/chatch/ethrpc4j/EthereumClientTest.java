package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

import java.net.MalformedURLException;

import org.ethereum.jsonrpc.JsonRpc.BlockResult;
import org.junit.Before;
import org.junit.Test;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

/**
 * Unit test the client.
 *
 * @see org.chatch.ethrpc4j.EthereumClientITTest for tests against a running
 *      Ethereum node.
 */
public class EthereumClientTest {

	JsonRpcHttpClient jsonClient;;
	EthereumClient client;

	@Before
	public void setUp() throws MalformedURLException {
		client = new EthereumClient(jsonClient);
		jsonClient = mock(JsonRpcHttpClient.class);
	}

	@Test
	public void test_eth_getBlockByHash() throws Throwable {
		final String HASH = "0x0";
		BlockResult br = client.eth_getBlockByHash(HASH, null);
		assertThat(br.gasLimit, startsWith("0x"));
	}

}
