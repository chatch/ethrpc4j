package org.chatch.ethrpc4j.methods;

import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.chatch.ethrpc4j.types.Block;
import org.chatch.ethrpc4j.types.Syncing;
import org.chatch.ethrpc4j.types.Transaction;

public class EthMethods extends MethodsBase {

	private static final String METHOD_PREFIX = "eth";

	public EthMethods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	public String protocolVersion() throws Exception {
		return (String) call("protocolVersion", null, String.class);
	}

	public Syncing syncing() throws Exception {
		return (Syncing) call("syncing", null, Syncing.class);
	}

	public String coinbase() throws Exception {
		return (String) call("coinbase", null, String.class);
	}

	public Boolean mining() throws Exception {
		return (Boolean) call("mining", null, Boolean.class);
	}

	public String hashrate() throws Exception {
		return (String) call("hashrate", null, String.class);
	}

	public String gasPrice() throws Exception {
		return (String) call("gasPrice", null, String.class);
	}

	public String[] accounts() throws Exception {
		return (String[]) call("accounts", null, String[].class);
	}

	public String blockNumber() throws Exception {
		return (String) call("blockNumber", null, String.class);
	}

	public String getBalance(String address, String block) throws Exception {
		return (String) call("getBalance", new Object[] { address, block }, String.class);
	}

	public String getBalance(String address) throws Exception {
		return (String) call("getBalance", new Object[] { address }, String.class);
	}

	public String getStorageAt(String address, String storageIdx, String blockId) throws Exception {
		return (String) call("getStorageAt", new Object[] { address, storageIdx, blockId }, String.class);
	}

	public String getTransactionCount(String address, String blockId) throws Exception {
		return (String) call("getTransactionCount", new Object[] { address, blockId }, String.class);
	}

	public String getBlockTransactionCountByHash(String blockHash) throws Exception {
		return (String) call("getBlockTransactionCountByHash", new Object[] { blockHash }, String.class);
	}

	public String getBlockTransactionCountByNumber(String bnOrId) throws Exception {
		return (String) call("getBlockTransactionCountByNumber", new Object[] { bnOrId }, String.class);
	}

	public String getUncleCountByBlockHash(String blockHash) throws Exception {
		return (String) call("getUncleCountByBlockHash", new Object[] { blockHash }, String.class);
	}

	public String getUncleCountByBlockNumber(String bnOrId) throws Exception {
		return (String) call("getUncleCountByBlockNumber", new Object[] { bnOrId }, String.class);
	}

	public String getCode(String addr, String bnOrId) throws Exception {
		return (String) call("getCode", new Object[] { addr, bnOrId }, String.class);
	}

	public String sign(String addr, String data) throws Exception {
		return (String) call("sign", new Object[] { addr, data }, String.class);
	}

	public String sendTransaction(String from, String to, String gas, String gasPrice, String value, String data,
			String nonce) throws Exception {
		return (String) call("sendTransaction", new Object[] { from, to, gas, gasPrice, value, data, nonce },
				String.class);
	}

	public String sendRawTransaction(String rawData) throws Exception {
		return (String) call("sendRawTransaction", new Object[] { rawData }, String.class);
	}

	public String call(String from, String to, String gas, String gasPrice, String value, String data)
			throws Exception {
		return (String) call("call", new Object[] { from, to, gas, gasPrice, value, data }, String.class);
	}

	public String estimateGas(String from, String to, String gas, String gasPrice, String value, String data)
			throws Exception {
		return (String) call("estimateGas", new Object[] { from, to, gas, gasPrice, value, data }, String.class);
	}

	public Block getBlockByHash(String blockHash, Boolean fullTransactionObjects) throws Exception {
		return (Block) call("getBlockByHash", new Object[] { blockHash, fullTransactionObjects }, Block.class);
	}

	public Block getBlockByNumber(String bnOrId, Boolean fullTransactionObjects) throws Exception {
		return (Block) call("getBlockByNumber", new Object[] { bnOrId, fullTransactionObjects }, Block.class);
	}

	public Transaction getTransactionByHash(String transactionHash) throws Exception {
		return (Transaction) call("getTransactionByHash", new Object[] { transactionHash }, Transaction.class);
	}

	public Transaction getTransactionByBlockHashAndIndex(String blockHash, String index) throws Exception {
		return (Transaction) call("getTransactionByBlockHashAndIndex", new Object[] { blockHash, index },
				Transaction.class);
	}

	public Transaction getTransactionByBlockNumberAndIndex(String bnOrId, String index) throws Exception {
		return (Transaction) call("getTransactionByBlockNumberAndIndex", new Object[] { bnOrId, index },
				Transaction.class);
	}

	public Transaction getTransactionReceipt(String transactionHash) throws Exception {
		return (Transaction) call("getTransactionReceipt", new Object[] { transactionHash }, Transaction.class);
	}

	public Block getUncleByBlockHashAndIndex(String blockHash, String uncleIdx) throws Exception {
		return (Block) call("getUncleByBlockHashAndIndex", new Object[] { blockHash, uncleIdx }, Block.class);
	}

	public Block getUncleByBlockNumberAndIndex(String blockId, String uncleIdx) throws Exception {
		return (Block) call("getUncleByBlockNumberAndIndex", new Object[] { blockId, uncleIdx }, Block.class);
	}

	public String[] getCompilers() throws Exception {
		return (String[]) call("getCompilers", null, String[].class);
	}

	public byte[] compileLLL(String contract) throws Exception {
		return (byte[]) call("compileLLL", new Object[] { contract }, byte[].class);
	}

	public byte[] compileSolidity(String contract) throws Exception {
		return (byte[]) call("compileSolidity", new Object[] { contract }, byte[].class);
	}

	public byte[] compileSerpent(String contract) throws Exception {
		return (byte[]) call("compileSerpent", new Object[] { contract }, byte[].class);
	}

	public String resend() throws Exception {
		return (String) call("resend", null, String.class);
	}

	public String pendingTransactions() throws Exception {
		return (String) call("pendingTransactions", null, String.class);
	}

	public String newFilter(String fromBlock, String toBlock, String address, String[] topics) throws Exception {
		return (String) call("newFilter", new Object[] { fromBlock, toBlock, address, topics }, String.class);
	}

	public String newBlockFilter() throws Exception {
		return (String) call("newBlockFilter", null, String.class);
	}

	public String newPendingTransactionFilter() throws Exception {
		return (String) call("newPendingTransactionFilter", null, String.class);
	}

	public Boolean uninstallFilter(String id) throws Exception {
		return (Boolean) call("uninstallFilter", new Object[] { id }, Boolean.class);
	}

	public Object[] getFilterChanges(String id) throws Exception {
		return (Object[]) call("getFilterChanges", new Object[] { id }, Object[].class);
	}

	public Object[] getFilterLogs(String id) throws Exception {
		return (Object[]) call("getFilterLogs", new Object[] { id }, Object[].class);
	}

	public Object[] getLogs(String fromBlock, String toBlock, String address, String[] topics) throws Exception {
		return (Object[]) call("getLogs", new Object[] { fromBlock, toBlock, address, topics }, Object[].class);
	}

	public String getWork() throws Exception {
		return (String) call("getWork", null, String.class);
	}

	public String submitWork() throws Exception {
		return (String) call("submitWork", null, String.class);
	}

	public String submitHashrate() throws Exception {
		return (String) call("submitHashrate", null, String.class);
	}

}
