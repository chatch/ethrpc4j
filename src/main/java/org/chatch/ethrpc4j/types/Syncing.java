package org.chatch.ethrpc4j.types;

public class Syncing {
	private Boolean isSyncing = false;
	private Long startingBlock;
	private Long currentBlock;
	private Long highestBlock;
	private Long knownStates;
	private Long pulledStates;

	public Boolean isSyncing() {
		return isSyncing;
	}

	public void setIsSyncing(Boolean isSyncing) {
		this.isSyncing = isSyncing;
	}

	public Long getStartingBlock() {
		return startingBlock;
	}

	public void setStartingBlock(Long startingBlock) {
		this.startingBlock = startingBlock;
	}

	public Long getCurrentBlock() {
		return currentBlock;
	}

	public void setCurrentBlock(Long currentBlock) {
		this.currentBlock = currentBlock;
	}

	public Long getHighestBlock() {
		return highestBlock;
	}

	public void setHighestBlock(Long highestBlock) {
		this.highestBlock = highestBlock;
	}

	public Long getKnownStates() {
		return knownStates;
	}

	public void setKnownStates(Long knownStates) {
		this.knownStates = knownStates;
	}

	public Long getPulledStates() {
		return pulledStates;
	}

	public void setPulledStates(Long pulledStates) {
		this.pulledStates = pulledStates;
	}

	@Override
	public String toString() {
		return "Syncing [isSyncing=" + isSyncing + ", startingBlock=" + startingBlock + ", currentBlock=" + currentBlock
				+ ", highestBlock=" + highestBlock + ", knownStates=" + knownStates + ", pulledStates=" + pulledStates
				+ "]";
	}

}
