package org.chatch.ethrpc4j;

import java.net.MalformedURLException;
import java.net.URL;

import org.ethereum.jsonrpc.JsonRpc;
import org.ethereum.jsonrpc.TransactionReceiptDTO;
import org.ethereum.jsonrpc.TransactionResultDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

/**
 * Ethereum JSON RPC Client.
 * 
 * see api docs at https://github.com/ethereum/wiki/wiki/JSON-RPC
 */
public class EthereumClient implements JsonRpc {

	private static final Logger LOG = LoggerFactory.getLogger(EthereumClient.class);

	JsonRpcHttpClient client;

	public EthereumClient(String serverURL) throws MalformedURLException {
		client = new JsonRpcHttpClient(new URL(serverURL));
	}

	protected String call(String method, Object[] params) {
		String rsp = null;
		try {
			rsp = client.invoke(method, params, String.class);
		} catch (Throwable e) {
			LOG.error(method + " failed", e);
		}
		return rsp;
	}

	@Override
	public String eth_gasPrice() {
		return call("eth_gasPrice", new Object[] {});
	}

	@Override
	public String web3_clientVersion() {
		return call("web3_clientVersion", new Object[] {});
	}

	@Override
	public String web3_sha3(String data) throws Exception {
		return call("web3_sha3", new Object[] {});
	}

	@Override
	public String net_version() {
		return call("net_version", new Object[] {});
	}

	@Override
	public String net_peerCount() {
		return call("net_peerCount", new Object[] {});
	}

	@Override
	public boolean net_listening() {
		return call("net_listening", new Object[] {});
	}

	@Override
	public String eth_protocolVersion() {
		return call("eth_protocolVersion", new Object[] {});
	}

	@Override
	public SyncingResult eth_syncing() {
		return call("eth_syncing", new Object[] {});
	}

	@Override
	public String eth_coinbase() {
		return call("eth_coinbase", new Object[] {});

	@Override
	public boolean eth_mining() {
		return call("eth_mining", new Object[] {});
	}

	@Override
	public String eth_hashrate() {
		return call("eth_hashrate", new Object[] {});
	}

	@Override
	public String[] eth_accounts() {
		return call("eth_accounts", new Object[] {});
	}

	@Override
	public String eth_blockNumber() {
		return call("eth_blockNumber", new Object[] {});
	}

	@Override
	public String eth_getBalance(String address, String block) throws Exception {
		return call("eth_getBalance", new Object[] {});
	}

	@Override
	public String eth_getBalance(String address) throws Exception {
		return call("eth_getBalance", new Object[] {});
	}

	@Override
	public String eth_getStorageAt(String address, String storageIdx, String blockId) throws Exception {
		return call("eth_getStorageAt", new Object[] {});
	}

	@Override
	public String eth_getTransactionCount(String address, String blockId) throws Exception {
		return call("eth_getTransactionCount", new Object[] {});
	}

	@Override
	public String eth_getBlockTransactionCountByHash(String blockHash) throws Exception {
		return call("eth_getBlockTransactionCountByHash", new Object[] {});
	}

	@Override
	public String eth_getBlockTransactionCountByNumber(String bnOrId) throws Exception {
		return call("eth_getBlockTransactionCountByNumber", new Object[] {});
	}

	@Override
	public String eth_getUncleCountByBlockHash(String blockHash) throws Exception {
		return call("eth_getUncleCountByBlockHash", new Object[] {});
	}

	@Override
	public String eth_getUncleCountByBlockNumber(String bnOrId) throws Exception {
		return call("eth_getUncleCountByBlockNumber", new Object[] {});
	}

	@Override
	public String eth_getCode(String addr, String bnOrId) throws Exception {
		return call("eth_getCode", new Object[] {});
	}

	@Override
	public String eth_sign(String addr, String data) throws Exception {
		return call("eth_sign", new Object[] {});
	}

	@Override
	public String eth_sendTransaction(CallArguments transactionArgs) throws Exception {
		return call("eth_sendTransaction", new Object[] {});
	}

	@Override
	public String eth_sendTransaction(String from, String to, String gas, String gasPrice, String value, String data,
			String nonce) throws Exception {
		return call("eth_sendTransaction", new Object[] {});
	}

	@Override
	public String eth_sendRawTransaction(String rawData) throws Exception {
		return call("eth_sendRawTransaction", new Object[] {});
	}

	@Override
	public String eth_call(CallArguments args, String bnOrId) throws Exception {
		return call("eth_call", new Object[] {});
	}

	@Override
	public String eth_estimateGas(CallArguments args) throws Exception {
		return call("eth_estimateGas", new Object[] {});
	}

	@Override
	public BlockResult eth_getBlockByHash(String blockHash, Boolean fullTransactionObjects) throws Exception {
		return call("eth_getBlockByHash", new Object[] {});
	}

	@Override
	public BlockResult eth_getBlockByNumber(String bnOrId, Boolean fullTransactionObjects) throws Exception {
		return call("eth_getBlockByNumber", new Object[] {});
	}

	@Override
	public TransactionResultDTO eth_getTransactionByHash(String transactionHash) throws Exception {
		return call("eth_getTransactionByHash", new Object[] {});
	}

	@Override
	public TransactionResultDTO eth_getTransactionByBlockHashAndIndex(String blockHash, String index) throws Exception {
		return call("eth_getTransactionByBlockHashAndIndex", new Object[] {});
	}

	@Override
	public TransactionResultDTO eth_getTransactionByBlockNumberAndIndex(String bnOrId, String index) throws Exception {
		return call("eth_getTransactionByBlockNumberAndIndex", new Object[] {});
	}

	@Override
	public TransactionReceiptDTO eth_getTransactionReceipt(String transactionHash) throws Exception {
		return call("eth_getTransactionReceipt", new Object[] {});
	}

	@Override
	public BlockResult eth_getUncleByBlockHashAndIndex(String blockHash, String uncleIdx) throws Exception {
		return call("eth_getUncleByBlockHashAndIndex", new Object[] {});
	}

	@Override
	public BlockResult eth_getUncleByBlockNumberAndIndex(String blockId, String uncleIdx) throws Exception {
		return call("eth_getUncleByBlockNumberAndIndex", new Object[] {});
	}

	@Override
	public String[] eth_getCompilers() {
		return call("eth_getCompilers", new Object[] {});
	}

	@Override
	public CompilationResult eth_compileLLL(String contract) {
		return call("eth_compileLLL", new Object[] {});
	}

	@Override
	public CompilationResult eth_compileSolidity(String contract) throws Exception {
		return call("eth_compileSolidity", new Object[] {});
	}

	@Override
	public CompilationResult eth_compileSerpent(String contract) {
		return call("eth_compileSerpent", new Object[] {});
	}

	@Override
	public String eth_resend() {
		return call("eth_resend", new Object[] {});
	}

	@Override
	public String eth_pendingTransactions() {
		return call("eth_pendingTransactions", new Object[] {});
	}

	@Override
	public String eth_newFilter(FilterRequest fr) throws Exception {
		return call("eth_newFilter", new Object[] {});
	}

	@Override
	public String eth_newBlockFilter() {
		return call("eth_newBlockFilter", new Object[] {});
	}

	@Override
	public String eth_newPendingTransactionFilter() {
		return call("eth_newPendingTransactionFilter", new Object[] {});
	}

	@Override
	public boolean eth_uninstallFilter(String id) {
		return call("eth_uninstallFilter", new Object[] {});
	}

	@Override
	public Object[] eth_getFilterChanges(String id) {
		return call("eth_getFilterChanges", new Object[] {});
	}

	@Override
	public Object[] eth_getFilterLogs(String id) {
		return call("eth_getFilterLogs", new Object[] {});
	}

	@Override
	public Object[] eth_getLogs(FilterRequest fr) throws Exception {
		return call("eth_getLogs", new Object[] {});
	}

	@Override
	public String eth_getWork() {
		return call("eth_getWork", new Object[] {});
	}

	@Override
	public String eth_submitWork() {
		return call("eth_submitWork", new Object[] {});
	}

	@Override
	public String eth_submitHashrate() {
		return call("eth_submitHashrate", new Object[] {});
	}

	@Override
	public String db_putString() {
		return call("db_putString", new Object[] {});
	}

	@Override
	public String db_getString() {
		return call("db_getString", new Object[] {});
	}

	@Override
	public String db_putHex() {
		return call("db_putHex", new Object[] {});
	}

	@Override
	public String db_getHex() {
		return call("db_getHex", new Object[] {});
	}

	@Override
	public String shh_post() {
		return call("shh_post", new Object[] {});
	}

	@Override
	public String shh_version() {
		return call("shh_version", new Object[] {});
	}

	@Override
	public String shh_newIdentity() {
		return call("shh_newIdentity", new Object[] {});
	}

	@Override
	public String shh_hasIdentity() {
		return call("shh_hasIdentity", new Object[] {});
	}

	@Override
	public String shh_newGroup() {
		return call("shh_newGroup", new Object[] {});
	}

	@Override
	public String shh_addToGroup() {
		return call("shh_addToGroup", new Object[] {});
	}

	@Override
	public String shh_newFilter() {
		return call("shh_newFilter", new Object[] {});
	}

	@Override
	public String shh_uninstallFilter() {
		return call("shh_uninstallFilter", new Object[] {});
	}

	@Override
	public String shh_getFilterChanges() {
		return call("shh_getFilterChanges", new Object[] {});
	}

	@Override
	public String shh_getMessages() {
		return call("shh_getMessages", new Object[] {});
	}

	@Override
	public boolean admin_addPeer(String s) {
		return call("admin_addPeer", new Object[] {});
	}

	@Override
	public String admin_exportChain() {
		return call("admin_exportChain", new Object[] {});
	}

	@Override
	public String admin_importChain() {
		return call("admin_importChain", new Object[] {});
	}

	@Override
	public String admin_sleepBlocks() {
		return call("admin_sleepBlocks", new Object[] {});
	}

	@Override
	public String admin_verbosity() {
		return call("admin_verbosity", new Object[] {});
	}

	@Override
	public String admin_setSolc() {
		return call("admin_setSolc", new Object[] {});
	}

	@Override
	public String admin_startRPC() {
		return call("admin_startRPC", new Object[] {});
	}

	@Override
	public String admin_stopRPC() {
		return call("admin_stopRPC", new Object[] {});
	}

	@Override
	public String admin_setGlobalRegistrar() {
		return call("admin_setGlobalRegistrar", new Object[] {});
	}

	@Override
	public String admin_setHashReg() {
		return call("admin_setHashReg", new Object[] {});
	}

	@Override
	public String admin_setUrlHint() {
		return call("admin_setUrlHint", new Object[] {});
	}

	@Override
	public String admin_saveInfo() {
		return call("admin_saveInfo", new Object[] {});
	}

	@Override
	public String admin_register() {
		return call("admin_register", new Object[] {});
	}

	@Override
	public String admin_registerUrl() {
		return call("admin_registerUrl", new Object[] {});
	}

	@Override
	public String admin_startNatSpec() {
		return call("admin_startNatSpec", new Object[] {});
	}

	@Override
	public String admin_stopNatSpec() {
		return call("admin_stopNatSpec", new Object[] {});
	}

	@Override
	public String admin_getContractInfo() {
		return call("admin_getContractInfo", new Object[] {});
	}

	@Override
	public String admin_httpGet() {
		return call("admin_httpGet", new Object[] {});
	}

	@Override
	public String admin_nodeInfo() {
		return call("admin_nodeInfo", new Object[] {});
	}

	@Override
	public String admin_peers() {
		return call("admin_peers", new Object[] {});
	}

	@Override
	public String admin_datadir() {
		return call("admin_datadir", new Object[] {});
	}

	@Override
	public String net_addPeer() {
		return call("net_addPeer", new Object[] {});
	}

	@Override
	public boolean miner_start() {
		return call("miner_start", new Object[] {});
	}

	@Override
	public boolean miner_stop() {
		return call("miner_stop", new Object[] {});
	}

	@Override
	public boolean miner_setEtherbase(String coinBase) throws Exception {
		return call("miner_setEtherbase", new Object[] {});
	}

	@Override
	public boolean miner_setExtra(String data) throws Exception {
		return call("miner_setExtra", new Object[] {});
	}

	@Override
	public boolean miner_setGasPrice(String newMinGasPrice) {
		return call("miner_setGasPrice", new Object[] {});
	}

	@Override
	public boolean miner_startAutoDAG() {
		return call("miner_startAutoDAG", new Object[] {});
	}

	@Override
	public boolean miner_stopAutoDAG() {
		return call("miner_stopAutoDAG", new Object[] {});
	}

	@Override
	public boolean miner_makeDAG() {
		return call("miner_makeDAG", new Object[] {});
	}

	@Override
	public String miner_hashrate() {
		return call("miner_hashrate", new Object[] {});
	}

	@Override
	public String debug_printBlock() {
		return call("debug_printBlock", new Object[] {});
	}

	@Override
	public String debug_getBlockRlp() {
		return call("debug_getBlockRlp", new Object[] {});
	}

	@Override
	public String debug_setHead() {
		return call("debug_setHead", new Object[] {});
	}

	@Override
	public String debug_processBlock() {
		return call("debug_processBlock", new Object[] {});
	}

	@Override
	public String debug_seedHash() {
		return call("debug_seedHash", new Object[] {});
	}

	@Override
	public String debug_dumpBlock() {
		return call("debug_dumpBlock", new Object[] {});
	}

	@Override
	public String debug_metrics() {
		return call("debug_metrics", new Object[] {});
	}

	@Override
	public String personal_newAccount(String seed) {
		return call("personal_newAccount", new Object[] {});
	}

	@Override
	public boolean personal_unlockAccount(String addr, String pass, String duration) {
		return call("personal_unlockAccount", new Object[] {});
	}

	@Override
	public String[] personal_listAccounts() {
		return call("personal_listAccounts", new Object[] {});
	}

}
