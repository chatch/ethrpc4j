package org.chatch.ethrpc4j.example;

import java.util.List;

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
		List<String> accounts = eth.accounts();
		for (String hash : accounts) {
			LOG.info("\t" + hash);
		}
		LOG.info("mining: " + eth.mining());
		LOG.info("syncing: " + eth.syncing());

		LOG.info("\nNetwork:\n");

		LOG.info("blockNumber: " + eth.blockNumber());
		LOG.info("gasPrice: " + eth.gasPrice());
		LOG.info("hashrate: " + eth.hashrate());

		LOG.info("\nCompilers:\n");

		List<String> compilers = eth.getCompilers();
		for (String compiler : compilers) {
			LOG.info("" + compiler);
		}

		LOG.info("\nCurrent Block:\n");
		Block block = eth.getBlockByNumber(eth.blockNumber().toString(), false);
		LOG.info("" + block);

	}

}
