package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

public class EthereumClientTest {

	final String GETH_PATH = "http://localhost:8545";

	EthereumClient client;

	@Before
	public void setUp() throws MalformedURLException {
		client = new EthereumClient(GETH_PATH);
	}

	@Test
	public void test_eth_gasPrice() throws Throwable {
		String price = client.eth_gasPrice();
		assertThat(price, startsWith("0x"));
	}

}
