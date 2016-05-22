package org.chatch.ethrpc4j.methods;

import org.ethereum.jsonrpc.JsonRpc.BlockResult;
import org.ethereum.jsonrpc.JsonRpc.CallArguments;
import org.ethereum.jsonrpc.JsonRpc.CompilationResult;
import org.ethereum.jsonrpc.JsonRpc.FilterRequest;
import org.ethereum.jsonrpc.JsonRpc.SyncingResult;
import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.ethereum.jsonrpc.TransactionReceiptDTO;
import org.ethereum.jsonrpc.TransactionResultDTO;

public class EthMethods extends MethodsBase {

	private static final String METHOD_PREFIX = "eth";

	public EthMethods(RpcProvider provider) {
		super(METHOD_PREFIX, provider);
	}

	public String protocolVersion() throws Exception {
		return (String) call("protocolVersion", null, String.class);
	}

	public SyncingResult syncing() {
		return null;
	}

	public String coinbase() {
		return null;
	}

	public Boolean mining() {
		return null;
	}

	public String hashrate() {
		return null;
	}

	public String gasPrice() {
		return null;
	}

	public String[] accounts() {
		return null;
	}

	public String blockNumber() {
		return null;
	}

	public String getBalance(String address, String block) throws Exception {
		return null;
	}

	public String getBalance(String address) throws Exception {
		return null;
	}

	public String getStorageAt(String address, String storageIdx, String blockId) throws Exception {
		return null;
	}

	public String getTransactionCount(String address, String blockId) throws Exception {
		return null;
	}

	public String getBlockTransactionCountByHash(String blockHash) throws Exception {
		return null;
	}

	public String getBlockTransactionCountByNumber(String bnOrId) throws Exception {
		return null;
	}

	public String getUncleCountByBlockHash(String blockHash) throws Exception {
		return null;
	}

	public String getUncleCountByBlockNumber(String bnOrId) throws Exception {
		return null;
	}

	public String getCode(String addr, String bnOrId) throws Exception {
		return null;
	}

	public String sign(String addr, String data) throws Exception {
		return null;
	}

	public String sendTransaction(CallArguments transactionArgs) throws Exception {
		return null;
	}

	// TODO: Remove, obsolete with this params
	public String sendTransaction(String from, String to, String gas, String gasPrice, String value, String data,
			String nonce) throws Exception {
		return null;
	}

	public String sendRawTransaction(String rawData) throws Exception {
		return null;
	}

	public String call(CallArguments args, String bnOrId) throws Exception {
		return null;
	}

	public String estimateGas(CallArguments args) throws Exception {
		return null;
	}

	public BlockResult getBlockByHash(String blockHash, Boolean fullTransactionObjects) throws Exception {
		return null;
	}

	public BlockResult getBlockByNumber(String bnOrId, Boolean fullTransactionObjects) throws Exception {
		return null;
	}

	public TransactionResultDTO getTransactionByHash(String transactionHash) throws Exception {
		return null;
	}

	public TransactionResultDTO getTransactionByBlockHashAndIndex(String blockHash, String index) throws Exception {
		return null;
	}

	public TransactionResultDTO getTransactionByBlockNumberAndIndex(String bnOrId, String index) throws Exception {
		return null;
	}

	public TransactionReceiptDTO getTransactionReceipt(String transactionHash) throws Exception {
		return null;
	}

	public BlockResult getUncleByBlockHashAndIndex(String blockHash, String uncleIdx) throws Exception {
		return null;
	}

	public BlockResult getUncleByBlockNumberAndIndex(String blockId, String uncleIdx) throws Exception {
		return null;
	}

	public String[] getCompilers() {
		return null;
	}

	public CompilationResult compileLLL(String contract) {
		return null;
	}

	public CompilationResult compileSolidity(String contract) throws Exception {
		return null;
	}

	public CompilationResult compileSerpent(String contract) {
		return null;
	}

	public String resend() {
		return null;
	}

	public String pendingTransactions() {
		return null;
	}

	public String newFilter(FilterRequest fr) throws Exception {
		return null;
	}

	// String newFilter(String fromBlock, String toBlock, String address,
	// String[] topics) throws Exception { return null; }

	public String newBlockFilter() {
		return null;
	}

	public String newPendingTransactionFilter() {
		return null;
	}

	public Boolean uninstallFilter(String id) {
		return null;
	}

	public Object[] getFilterChanges(String id) {
		return null;
	}

	public Object[] getFilterLogs(String id) {
		return null;
	}

	public Object[] getLogs(FilterRequest fr) throws Exception {
		return null;
	}

	public String getWork() {
		return null;
	}

	public String submitWork() {
		return null;
	}

	public String submitHashrate() {
		return null;
	}

}
