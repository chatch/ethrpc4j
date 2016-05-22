package org.chatch.ethrpc4j.types;

public class Transaction {

	public String hash;
	public String nonce;
	public String blockHash;
	public String blockNumber;
	public String transactionIndex;

	public String from;
	public String to;
	public String gas;
	public String gasPrice;
	public String value;
	public String input;

	public String getHash() {
		return hash;
	}

	public String getNonce() {
		return nonce;
	}

	public String getBlockHash() {
		return blockHash;
	}

	public String getBlockNumber() {
		return blockNumber;
	}

	public String getTransactionIndex() {
		return transactionIndex;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getGas() {
		return gas;
	}

	public String getGasPrice() {
		return gasPrice;
	}

	public String getValue() {
		return value;
	}

	public String getInput() {
		return input;
	}

	@Override
	public String toString() {
		return "Transaction [hash=" + hash + ", nonce=" + nonce + ", blockHash=" + blockHash + ", blockNumber="
				+ blockNumber + ", transactionIndex=" + transactionIndex + ", from=" + from + ", to=" + to + ", gas="
				+ gas + ", gasPrice=" + gasPrice + ", value=" + value + ", input=" + input + "]";
	}

}
