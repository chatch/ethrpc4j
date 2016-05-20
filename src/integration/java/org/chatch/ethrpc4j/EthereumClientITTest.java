package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;

import org.ethereum.jsonrpc.JsonRpc.BlockResult;
import org.ethereum.jsonrpc.TransactionResultDTO;
import org.ethereum.jsonrpc.TypeConverter;
import org.junit.Before;
import org.junit.Test;

/**
 * Run integration tests again testnet. Some known test data and hashes are used
 * in the tests.
 */
public class EthereumClientITTest {

	final String GETH_PATH = "http://localhost:8545";

	EthereumClient client;

	@Before
	public void setUp() throws MalformedURLException {
		client = new EthereumClient(GETH_PATH);
	}

	@Test
	public void test_eth_gasPrice() throws Throwable {
		String rsp = client.eth_gasPrice();
		assertThat(rsp, startsWith("0x"));
	}

	@Test
	public void test_eth_coinbase() throws Throwable {
		String rsp = client.eth_coinbase();
		assertThat(rsp, startsWith("0x"));
	}

	@Test
	public void test_eth_getBlock() throws Throwable {
		final Long BLOCK_NUM = 977370L;
		BlockResult rsp = client.eth_getBlockByNumber(BLOCK_NUM.toString(), false);
		assertThat(rsp.number, equalTo(TypeConverter.toJsonHex(BLOCK_NUM)));
	}

	@Test
	public void test_eth_getTransactionByHash() throws Throwable {
		final String TX_HASH = "0x1a7e99b6f1a3e34b234f37fbc1b340f90cc7b5c50e70750870cdbcde14f218d0";
		TransactionResultDTO tx = client.eth_getTransactionByHash(TX_HASH);
		assertThat(tx.hash, equalTo(TX_HASH));
	}

}
