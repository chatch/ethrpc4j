package org.chatch.ethrpc4j.types;

import java.util.ArrayList;
import java.util.List;

/**
 * eth_getFilterChanges returns a list of this type for filters created with
 * eth_newFilter.
 */
public class Log {
	private String type;
	private Long logIndex;
	private Long blockNumber;
	private String blockHash;
	private String transactionHash;
	private Long transactionIndex;
	private String address;
	private String data;
	private List<String> topics = new ArrayList<>();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getLogIndex() {
		return logIndex;
	}

	public void setLogIndex(Long logIndex) {
		this.logIndex = logIndex;
	}

	public Long getBlockNumber() {
		return blockNumber;
	}

	public void setBlockNumber(Long blockNumber) {
		this.blockNumber = blockNumber;
	}

	public String getBlockHash() {
		return blockHash;
	}

	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}

	public String getTransactionHash() {
		return transactionHash;
	}

	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
	}

	public Long getTransactionIndex() {
		return transactionIndex;
	}

	public void setTransactionIndex(Long transactionIndex) {
		this.transactionIndex = transactionIndex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "Log [type=" + type + ", logIndex=" + logIndex + ", blockNumber=" + blockNumber + ", blockHash="
				+ blockHash + ", transactionHash=" + transactionHash + ", transactionIndex=" + transactionIndex
				+ ", address=" + address + ", data=" + data + ", topics=" + topics + "]";
	}

}
