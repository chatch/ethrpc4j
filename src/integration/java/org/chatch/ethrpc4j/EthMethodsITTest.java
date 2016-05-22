package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;

import org.chatch.ethrpc4j.methods.EthMethods;
import org.chatch.ethrpc4j.rpc.HttpRpcProvider;
import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.ethereum.jsonrpc.JsonRpc.BlockResult;
import org.ethereum.jsonrpc.TransactionResultDTO;
import org.ethereum.jsonrpc.TypeConverter;
import org.junit.BeforeClass;
import org.junit.Test;

public class EthMethodsITTest {

	final static String GETH_PATH = "http://localhost:8545";

	static EthMethods eth;

	@BeforeClass
	public static void setUpOnce() throws MalformedURLException {
		RpcProvider provider = new HttpRpcProvider(GETH_PATH);
		EthereumClient client = new EthereumClient(provider);
		eth = client.eth();
	}

	@Test
	public void testGasPrice() throws Throwable {
		String rsp = eth.gasPrice();
		assertThat(rsp, startsWith("0x"));
	}

	@Test
	public void testCoinbase() throws Throwable {
		String rsp = eth.coinbase();
		assertThat(rsp, startsWith("0x"));
	}

	@Test
	public void testGetBlock() throws Throwable {
		final Long BLOCK_NUM = 977370L;
		BlockResult rsp = eth.getBlockByNumber(BLOCK_NUM.toString(), false);
		assertThat(rsp.number, equalTo(TypeConverter.toJsonHex(BLOCK_NUM)));
	}

	@Test
	public void test_GetTransactionByHash() throws Throwable {
		final String TX_HASH = "0x1a7e99b6f1a3e34b234f37fbc1b340f90cc7b5c50e70750870cdbcde14f218d0";
		TransactionResultDTO tx = eth.getTransactionByHash(TX_HASH);
		assertThat(tx.hash, equalTo(TX_HASH));
	}

}
