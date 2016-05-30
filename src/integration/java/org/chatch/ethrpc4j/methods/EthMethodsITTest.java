package org.chatch.ethrpc4j.methods;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.List;

import org.chatch.ethrpc4j.EthereumClient;
import org.chatch.ethrpc4j.rpc.HttpRpcProvider;
import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.chatch.ethrpc4j.types.Block;
import org.chatch.ethrpc4j.types.Syncing;
import org.chatch.ethrpc4j.types.Transaction;
import org.junit.BeforeClass;
import org.junit.Test;

public class EthMethodsITTest {

	static final String ACCOUNT_HASH = "0x0c2bcdc298f0d7678328c7a17647b12b853660a3";

	static final String BLOCK_HASH = "0xffff6a5cb82a87066dc520cecdf25aa04c670bcc752756fe032407ebe004b9e5";

	static final Long BLOCK_NUMBER = 51L;

	static EthMethods eth;

	@BeforeClass
	public static void setUpOnce() throws MalformedURLException {
		RpcProvider provider = new HttpRpcProvider();
		EthereumClient client = new EthereumClient(provider);
		eth = client.eth();
	}

	@Test
	public void testGasPrice() throws Throwable {
		assertThat(eth.gasPrice(), greaterThanOrEqualTo(1L));
	}

	@Test
	public void testCoinbase() throws Throwable {
		String rsp = eth.coinbase();
		assertThat(rsp, startsWith("0x"));
	}

	@Test
	public void testHashrate() throws Throwable {
		assertThat(eth.hashrate(), greaterThanOrEqualTo(0L));
	}

	@Test
	public void testMining() throws Throwable {
		assertThat(eth.mining(), equalTo(false));
	}

	@Test
	public void testAccounts() throws Throwable {
		List<String> accounts = eth.accounts();
		assertThat(accounts.size(), equalTo(1));
		assertThat(accounts.get(0), equalTo(ACCOUNT_HASH));
	}

	@Test
	public void testGetBlock() throws Throwable {
		Block rsp = eth.getBlockByNumber(BLOCK_NUMBER.toString(), false);
		assertThat(rsp.getNumber().longValue(), equalTo(BLOCK_NUMBER));
		assertThat(rsp.getHash(), equalTo(BLOCK_HASH));
		assertThat(rsp.getParentHash(), equalTo("0x5ef877a48c9bff81a38d98241414723f6372d4aeccee3bdbefa8fe9b2d2f5234"));
		assertThat(rsp.getNonce(), equalTo("0x105532dafeda5583"));
	}

	@Test
	public void testGetTransactionCount() throws Throwable {
		assertThat(eth.getTransactionCount(ACCOUNT_HASH, "latest"), equalTo(0L));
		assertThat(eth.getTransactionCount(ACCOUNT_HASH, BLOCK_NUMBER), equalTo(0L));
	}

	@Test
	public void testGetBlockTransactionCount() throws Throwable {
		assertThat(eth.getBlockTransactionCountByHash(
				"0xffff6a5cb82a87066dc520cecdf25aa04c670bcc752756fe032407ebe004b9e5"), equalTo(0L));
		assertThat(eth.getBlockTransactionCountByNumber(BLOCK_NUMBER), equalTo(0L));
		assertThat(eth.getBlockTransactionCountByNumber("latest"), equalTo(0L));
	}

	@Test
	public void testGetTransactionByHash() throws Throwable {
		final String TX_HASH = "0x56e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b421";
		Transaction tx = eth.getTransactionByHash(TX_HASH);
		System.out.println(tx);
		assertThat(tx.getNonce(), equalTo(1049520L));
		assertThat(tx.getTransactionIndex(), equalTo(4L));
		assertThat(tx.getFrom(), equalTo("0x687422eea2cb73b5d3e242ba5456b782919afc85"));
		assertThat(tx.getTo(), equalTo("0x7788944b6dcd32f8a3042b817cfe7c5588382bd3"));
		assertThat(tx.getGas(), equalTo(314150L));
		assertThat(tx.getGasPrice(), equalTo(20000000000L));
		assertThat(tx.getValue(), equalTo(1000000000000000000L));
	}

	@Test
	public void testGetUncleByBlockHash() throws Throwable {
		Block rsp = eth.getUncleByBlockHashAndIndex(
				"0x4423edb1f634668eb6e74f25f26fbdc3ef637dd704dbf57b4cfe7d7880e6df48", "0x0");
		assertThat(rsp, not(nullValue()));
		assertThat(rsp.getNumber(), equalTo(2L));
		assertThat(rsp.getHash(), equalTo("0x74b44b5131d03185da25c9e0979924c9aace62355aacd421a71e7404af44fad5"));
		assertThat(rsp.getParentHash(), equalTo("0x2e346523e0a48955068564b4149a0925b4a1ff7da32dc2d41609fbf70199bc75"));
		assertThat(rsp.getNonce(), equalTo("0x65196009dfdefa8e"));
	}

	@Test
	public void testSyncing() throws Throwable {
		Syncing syncing = eth.syncing();
		assertFalse(syncing.isSyncing());
	}

}
