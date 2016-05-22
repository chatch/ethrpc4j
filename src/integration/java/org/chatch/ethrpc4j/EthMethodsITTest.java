package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;

import org.chatch.ethrpc4j.methods.EthMethods;
import org.chatch.ethrpc4j.rpc.HttpRpcProvider;
import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.chatch.ethrpc4j.types.Block;
import org.chatch.ethrpc4j.types.Transaction;
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
		final Long BLOCK_NUM = 935709L;
		Block rsp = eth.getBlockByNumber(BLOCK_NUM.toString(), false);
		System.out.println(rsp);
		assertThat(rsp.getNumber(), equalTo("0xe471d"));
		assertThat(rsp.getHash(), equalTo("0xc8537f462845d63684ebf16eba167b9ce7d48f1bd8392a8ec4d29b97d39bf62d"));
		assertThat(rsp.getParentHash(), equalTo("0x3af12f4705297e10abc436afe703659186cdd1f550f33a36dcbc99c4a0799bd3"));
		assertThat(rsp.getNonce(), equalTo("0x9c744c11b9c6c576"));
	}

	@Test
	public void test_GetTransactionByHash() throws Throwable {
		final String TX_HASH = "0x1a7e99b6f1a3e34b234f37fbc1b340f90cc7b5c50e70750870cdbcde14f218d0";
		Transaction tx = eth.getTransactionByHash(TX_HASH);
		assertThat(tx.hash, equalTo(TX_HASH));
	}

}
