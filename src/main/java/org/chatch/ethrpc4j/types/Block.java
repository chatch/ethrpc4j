package org.chatch.ethrpc4j.types;

import java.util.Arrays;

/**
 * Ethereum Block.
 * 
 * @see <a href=
 *      "https://github.com/ethereum/go-ethereum/blob/master/core/types/block.go">block.go</a>
 */
public class Block {

	// TODO: change to actual types from strings:
	// see block.go - a number of numbers here are actually 64bit big.Ints (Long
	// in Java)
	private String number;
	private String hash;
	private String parentHash;
	private String nonce;
	private String sha3Uncles;
	private String logsBloom;
	private String transactionsRoot;
	private String stateRoot;
	private String receiptRoot;
	private String miner;
	private String difficulty;
	private String totalDifficulty;
	private String extraData;
	private String size;
	private String gasLimit;
	private String gasUsed;
	private String timestamp;
	private Object[] transactions;
	private String[] uncles;

	public String getNumber() {
		return number;
	}

	public String getHash() {
		return hash;
	}

	public String getParentHash() {
		return parentHash;
	}

	public String getNonce() {
		return nonce;
	}

	public String getSha3Uncles() {
		return sha3Uncles;
	}

	public String getLogsBloom() {
		return logsBloom;
	}

	public String getTransactionsRoot() {
		return transactionsRoot;
	}

	public String getStateRoot() {
		return stateRoot;
	}

	public String getReceiptRoot() {
		return receiptRoot;
	}

	public String getMiner() {
		return miner;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public String getTotalDifficulty() {
		return totalDifficulty;
	}

	public String getExtraData() {
		return extraData;
	}

	public String getSize() {
		return size;
	}

	public String getGasLimit() {
		return gasLimit;
	}

	public String getGasUsed() {
		return gasUsed;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public Object[] getTransactions() {
		return transactions;
	}

	public String[] getUncles() {
		return uncles;
	}

	@Override
	public String toString() {
		return "Block [number=" + number + ", hash=" + hash + ", parentHash=" + parentHash + ", nonce=" + nonce
				+ ", sha3Uncles=" + sha3Uncles + ", logsBloom=" + logsBloom + ", transactionsRoot=" + transactionsRoot
				+ ", stateRoot=" + stateRoot + ", receiptRoot=" + receiptRoot + ", miner=" + miner + ", difficulty="
				+ difficulty + ", totalDifficulty=" + totalDifficulty + ", extraData=" + extraData + ", size=" + size
				+ ", gasLimit=" + gasLimit + ", gasUsed=" + gasUsed + ", timestamp=" + timestamp + ", transactions="
				+ Arrays.toString(transactions) + ", uncles=" + Arrays.toString(uncles) + "]";
	}

}
