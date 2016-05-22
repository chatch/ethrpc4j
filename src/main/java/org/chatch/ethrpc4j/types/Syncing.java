package org.chatch.ethrpc4j.types;

public class Syncing {
	public String startingBlock;
	public String currentBlock;
	public String highestBlock;

	public String getStartingBlock() {
		return startingBlock;
	}

	public String getCurrentBlock() {
		return currentBlock;
	}

	public String getHighestBlock() {
		return highestBlock;
	}

	@Override
	public String toString() {
		return "Syncing [startingBlock=" + startingBlock + ", currentBlock=" + currentBlock + ", highestBlock="
				+ highestBlock + "]";
	}

}
