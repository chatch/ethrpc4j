package org.chatch.ethrpc4j.example;

import org.chatch.ethrpc4j.EthereumClient;
import org.chatch.ethrpc4j.methods.EthMethods;
import org.chatch.ethrpc4j.types.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleUsage {
	private static final Logger LOG = LoggerFactory.getLogger(SampleUsage.class);

	public static void main(String[] args) throws Exception {
		final EthereumClient client = EthereumClient.getDefaultInstance();
		final EthMethods eth = client.eth();

		LOG.info("\nClient:\n");

		LOG.info("clientVersion: " + client.web3().clientVersion());
		LOG.info("protocolVersion: " + eth.protocolVersion());
		LOG.info("accounts: ");
		String[] accounts = eth.accounts();
		for (int i = 0; i < accounts.length; i++) {
			LOG.info("\t" + accounts[i]);
		}
		LOG.info("mining: " + eth.mining());
		LOG.info("syncing: " + eth.syncing());

		LOG.info("\nNetwork:\n");

		LOG.info("blockNumber: " + eth.blockNumber());
		LOG.info("gasPrice: " + eth.gasPrice());
		LOG.info("hashrate: " + eth.hashrate());

		LOG.info("\nCompilers:\n");

		String[] compilers = eth.getCompilers();
		for (int i = 0; i < compilers.length; i++) {
			LOG.info("" + compilers[i]);
		}

		LOG.info("\nCurrent Block:\n");
		Block block = eth.getBlockByNumber(eth.blockNumber().toString(), false);
		LOG.info("" + block);

	}

}
