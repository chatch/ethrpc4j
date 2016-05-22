package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.*;
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
	public void testHashrate() throws Throwable {
		String rsp = eth.hashrate();
		assertThat(rsp, startsWith("0x"));
	}

	@Test
	public void testMining() throws Throwable {
		assertThat(eth.mining(), equalTo(false));
	}

	@Test
	public void testAccounts() throws Throwable {
		String[] rsp = eth.accounts();
		assertThat(rsp.length, greaterThan(0));
	}

	@Test
	public void testGetBlock() throws Throwable {
		final Long BLOCK_NUM = 935709L;
		Block rsp = eth.getBlockByNumber(BLOCK_NUM.toString(), false);
		assertThat(rsp.getNumber(), equalTo("0xe471d"));
		assertThat(rsp.getHash(), equalTo("0xc8537f462845d63684ebf16eba167b9ce7d48f1bd8392a8ec4d29b97d39bf62d"));
		assertThat(rsp.getParentHash(), equalTo("0x3af12f4705297e10abc436afe703659186cdd1f550f33a36dcbc99c4a0799bd3"));
		assertThat(rsp.getNonce(), equalTo("0x9c744c11b9c6c576"));
	}

	@Test
	public void test_GetTransactionByHash() throws Throwable {
		final String TX_HASH = "0x1a7e99b6f1a3e34b234f37fbc1b340f90cc7b5c50e70750870cdbcde14f218d0";
		Transaction tx = eth.getTransactionByHash(TX_HASH);
		assertThat(tx.getNonce(), equalTo("0x1003b0"));
		assertThat(tx.getTransactionIndex(), equalTo("0x4"));
		assertThat(tx.getFrom(), equalTo("0x687422eea2cb73b5d3e242ba5456b782919afc85"));
		assertThat(tx.getTo(), equalTo("0x7788944b6dcd32f8a3042b817cfe7c5588382bd3"));
		assertThat(tx.getGas(), equalTo("0x4cb26"));
		assertThat(tx.getGasPrice(), equalTo("0x4a817c800"));
		assertThat(tx.getValue(), equalTo("0xde0b6b3a7640000"));
	}

	@Test
	public void testGetUncleByBlockHash() throws Throwable {
		Block rsp = eth.getUncleByBlockHashAndIndex(
				"0x44d0f987bf61c87d89c7b2952d0e911eaa5afb746a0c63c170849da7db28aa89", "0x0");
		assertThat(rsp.getNumber(), equalTo("0xef511"));
		assertThat(rsp.getHash(), equalTo("0x1aa6b13577fbcd83bf8e41533befd31f393debe49af9f0aa7ffe499a8834b3cf"));
		assertThat(rsp.getParentHash(), equalTo("0xf97a0e7989b209b0875857de2d31227e2b728a017109cceecfc0b2606bb1fb6b"));
		assertThat(rsp.getNonce(), equalTo("0x7c5bcddfa63a6d11"));
	}

}
