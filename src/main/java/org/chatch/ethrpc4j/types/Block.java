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
	private Long number;
	private String hash;
	private String parentHash;
	private String nonce;
	private String sha3Uncles;
	private String logsBloom;
	private String transactionsRoot;
	private String stateRoot;
	private String receiptRoot;
	private String miner;
	private Long difficulty;
	private Long totalDifficulty;
	private String extraData;
	private Long size;
	private Long gasLimit;
	private Long gasUsed;
	private Long timestamp;
	private Object[] transactions;
	private String[] uncles;

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getParentHash() {
		return parentHash;
	}

	public void setParentHash(String parentHash) {
		this.parentHash = parentHash;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getSha3Uncles() {
		return sha3Uncles;
	}

	public void setSha3Uncles(String sha3Uncles) {
		this.sha3Uncles = sha3Uncles;
	}

	public String getLogsBloom() {
		return logsBloom;
	}

	public void setLogsBloom(String logsBloom) {
		this.logsBloom = logsBloom;
	}

	public String getTransactionsRoot() {
		return transactionsRoot;
	}

	public void setTransactionsRoot(String transactionsRoot) {
		this.transactionsRoot = transactionsRoot;
	}

	public String getStateRoot() {
		return stateRoot;
	}

	public void setStateRoot(String stateRoot) {
		this.stateRoot = stateRoot;
	}

	public String getReceiptRoot() {
		return receiptRoot;
	}

	public void setReceiptRoot(String receiptRoot) {
		this.receiptRoot = receiptRoot;
	}

	public String getMiner() {
		return miner;
	}

	public void setMiner(String miner) {
		this.miner = miner;
	}

	public Long getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Long difficulty) {
		this.difficulty = difficulty;
	}

	public Long getTotalDifficulty() {
		return totalDifficulty;
	}

	public void setTotalDifficulty(Long totalDifficulty) {
		this.totalDifficulty = totalDifficulty;
	}

	public String getExtraData() {
		return extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getGasLimit() {
		return gasLimit;
	}

	public void setGasLimit(Long gasLimit) {
		this.gasLimit = gasLimit;
	}

	public Long getGasUsed() {
		return gasUsed;
	}

	public void setGasUsed(Long gasUsed) {
		this.gasUsed = gasUsed;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Object[] getTransactions() {
		return transactions;
	}

	public void setTransactions(Object[] transactions) {
		this.transactions = transactions;
	}

	public String[] getUncles() {
		return uncles;
	}

	public void setUncles(String[] uncles) {
		this.uncles = uncles;
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
