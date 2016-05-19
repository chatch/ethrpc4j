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

	@Override
	public String eth_gasPrice() {
		return call_String("eth_gasPrice", new Object[] {});
	}

	@Override
	public String web3_clientVersion() {
		return call_String("web3_clientVersion", new Object[] {});
	}

	@Override
	public String web3_sha3(String data) throws Exception {
		return call_String("web3_sha3", new Object[] {});
	}

	@Override
	public String net_version() {
		return call_String("net_version", new Object[] {});
	}

	@Override
	public String net_peerCount() {
		return call_String("net_peerCount", new Object[] {});
	}

	@Override
	public boolean net_listening() {
		return call_Boolean("net_listening", new Object[] {});
	}

	@Override
	public String eth_protocolVersion() {
		return call_String("eth_protocolVersion", new Object[] {});
	}

	@Override
	public SyncingResult eth_syncing() {
		return (SyncingResult) call("eth_syncing", new Object[] {}, SyncingResult.class);
	}

	@Override
	public String eth_coinbase() {
		return call_String("eth_coinbase", new Object[] {});
	}

	@Override
	public boolean eth_mining() {
		return call_Boolean("eth_mining", new Object[] {});
	}

	@Override
	public String eth_hashrate() {
		return call_String("eth_hashrate", new Object[] {});
	}

	@Override
	public String[] eth_accounts() {
		return (String[]) call("eth_accounts", new Object[] {}, String[].class);
	}

	@Override
	public String eth_blockNumber() {
		return call_String("eth_blockNumber", new Object[] {});
	}

	@Override
	public String eth_getBalance(String address, String block) throws Exception {
		return call_String("eth_getBalance", new Object[] {});
	}

	@Override
	public String eth_getBalance(String address) throws Exception {
		return call_String("eth_getBalance", new Object[] {});
	}

	@Override
	public String eth_getStorageAt(String address, String storageIdx, String blockId) throws Exception {
		return call_String("eth_getStorageAt", new Object[] {});
	}

	@Override
	public String eth_getTransactionCount(String address, String blockId) throws Exception {
		return call_String("eth_getTransactionCount", new Object[] {});
	}

	@Override
	public String eth_getBlockTransactionCountByHash(String blockHash) throws Exception {
		return call_String("eth_getBlockTransactionCountByHash", new Object[] {});
	}

	@Override
	public String eth_getBlockTransactionCountByNumber(String bnOrId) throws Exception {
		return call_String("eth_getBlockTransactionCountByNumber", new Object[] {});
	}

	@Override
	public String eth_getUncleCountByBlockHash(String blockHash) throws Exception {
		return call_String("eth_getUncleCountByBlockHash", new Object[] {});
	}

	@Override
	public String eth_getUncleCountByBlockNumber(String bnOrId) throws Exception {
		return call_String("eth_getUncleCountByBlockNumber", new Object[] {});
	}

	@Override
	public String eth_getCode(String addr, String bnOrId) throws Exception {
		return call_String("eth_getCode", new Object[] {});
	}

	@Override
	public String eth_sign(String addr, String data) throws Exception {
		return call_String("eth_sign", new Object[] {});
	}

	@Override
	public String eth_sendTransaction(CallArguments transactionArgs) throws Exception {
		return call_String("eth_sendTransaction", new Object[] {});
	}

	@Override
	public String eth_sendTransaction(String from, String to, String gas, String gasPrice, String value, String data,
			String nonce) throws Exception {
		return call_String("eth_sendTransaction", new Object[] {});
	}

	@Override
	public String eth_sendRawTransaction(String rawData) throws Exception {
		return call_String("eth_sendRawTransaction", new Object[] {});
	}

	@Override
	public String eth_call(CallArguments args, String bnOrId) throws Exception {
		return call_String("eth_call", new Object[] {});
	}

	@Override
	public String eth_estimateGas(CallArguments args) throws Exception {
		return call_String("eth_estimateGas", new Object[] {});
	}

	@Override
	public BlockResult eth_getBlockByHash(String blockHash, Boolean fullTransactionObjects) throws Exception {
		return (BlockResult) call("eth_getBlockByHash", new Object[] {}, BlockResult.class);
	}

	@Override
	public BlockResult eth_getBlockByNumber(String bnOrId, Boolean fullTransactionObjects) throws Exception {
		return (BlockResult) call("eth_getBlockByNumber", new Object[] {}, BlockResult.class);
	}

	@Override
	public TransactionResultDTO eth_getTransactionByHash(String transactionHash) throws Exception {
		return (TransactionResultDTO) call("eth_getTransactionByHash", new Object[] {}, TransactionResultDTO.class);
	}

	@Override
	public TransactionResultDTO eth_getTransactionByBlockHashAndIndex(String blockHash, String index) throws Exception {
		return (TransactionResultDTO) call("eth_getTransactionByBlockHashAndIndex", new Object[] {},
				TransactionResultDTO.class);
	}

	@Override
	public TransactionResultDTO eth_getTransactionByBlockNumberAndIndex(String bnOrId, String index) throws Exception {
		return (TransactionResultDTO) call("eth_getTransactionByBlockNumberAndIndex", new Object[] {},
				TransactionResultDTO.class);
	}

	@Override
	public TransactionReceiptDTO eth_getTransactionReceipt(String transactionHash) throws Exception {
		return (TransactionReceiptDTO) call("eth_getTransactionReceipt", new Object[] {}, TransactionReceiptDTO.class);
	}

	@Override
	public BlockResult eth_getUncleByBlockHashAndIndex(String blockHash, String uncleIdx) throws Exception {
		return (BlockResult) call("eth_getUncleByBlockHashAndIndex", new Object[] {}, BlockResult.class);
	}

	@Override
	public BlockResult eth_getUncleByBlockNumberAndIndex(String blockId, String uncleIdx) throws Exception {
		return (BlockResult) call("eth_getUncleByBlockNumberAndIndex", new Object[] {}, BlockResult.class);
	}

	@Override
	public String[] eth_getCompilers() {
		return (String[]) call("eth_getCompilers", new Object[] {}, String[].class);
	}

	@Override
	public CompilationResult eth_compileLLL(String contract) {
		return (CompilationResult) call("eth_compileLLL", new Object[] {}, CompilationResult.class);
	}

	@Override
	public CompilationResult eth_compileSolidity(String contract) throws Exception {
		return (CompilationResult) call("eth_compileSolidity", new Object[] {}, CompilationResult.class);
	}

	@Override
	public CompilationResult eth_compileSerpent(String contract) {
		return (CompilationResult) call("eth_compileSerpent", new Object[] {}, CompilationResult.class);
	}

	@Override
	public String eth_resend() {
		return call_String("eth_resend", new Object[] {});
	}

	@Override
	public String eth_pendingTransactions() {
		return call_String("eth_pendingTransactions", new Object[] {});
	}

	@Override
	public String eth_newFilter(FilterRequest fr) throws Exception {
		return call_String("eth_newFilter", new Object[] {});
	}

	@Override
	public String eth_newBlockFilter() {
		return call_String("eth_newBlockFilter", new Object[] {});
	}

	@Override
	public String eth_newPendingTransactionFilter() {
		return call_String("eth_newPendingTransactionFilter", new Object[] {});
	}

	@Override
	public boolean eth_uninstallFilter(String id) {
		return call_Boolean("eth_uninstallFilter", new Object[] {});
	}

	@Override
	public Object[] eth_getFilterChanges(String id) {
		return (Object[]) call("eth_getFilterChanges", new Object[] {}, Object[].class);
	}

	@Override
	public Object[] eth_getFilterLogs(String id) {
		return (Object[]) call("eth_getFilterLogs", new Object[] {}, Object[].class);
	}

	@Override
	public Object[] eth_getLogs(FilterRequest fr) throws Exception {
		return (Object[]) call("eth_getLogs", new Object[] {}, Object[].class);
	}

	@Override
	public String eth_getWork() {
		return call_String("eth_getWork", new Object[] {});
	}

	@Override
	public String eth_submitWork() {
		return call_String("eth_submitWork", new Object[] {});
	}

	@Override
	public String eth_submitHashrate() {
		return call_String("eth_submitHashrate", new Object[] {});
	}

	@Override
	public String db_putString() {
		return call_String("db_putString", new Object[] {});
	}

	@Override
	public String db_getString() {
		return call_String("db_getString", new Object[] {});
	}

	@Override
	public String db_putHex() {
		return call_String("db_putHex", new Object[] {});
	}

	@Override
	public String db_getHex() {
		return call_String("db_getHex", new Object[] {});
	}

	@Override
	public String shh_post() {
		return call_String("shh_post", new Object[] {});
	}

	@Override
	public String shh_version() {
		return call_String("shh_version", new Object[] {});
	}

	@Override
	public String shh_newIdentity() {
		return call_String("shh_newIdentity", new Object[] {});
	}

	@Override
	public String shh_hasIdentity() {
		return call_String("shh_hasIdentity", new Object[] {});
	}

	@Override
	public String shh_newGroup() {
		return call_String("shh_newGroup", new Object[] {});
	}

	@Override
	public String shh_addToGroup() {
		return call_String("shh_addToGroup", new Object[] {});
	}

	@Override
	public String shh_newFilter() {
		return call_String("shh_newFilter", new Object[] {});
	}

	@Override
	public String shh_uninstallFilter() {
		return call_String("shh_uninstallFilter", new Object[] {});
	}

	@Override
	public String shh_getFilterChanges() {
		return call_String("shh_getFilterChanges", new Object[] {});
	}

	@Override
	public String shh_getMessages() {
		return call_String("shh_getMessages", new Object[] {});
	}

	@Override
	public boolean admin_addPeer(String s) {
		return call_Boolean("admin_addPeer", new Object[] {});
	}

	@Override
	public String admin_exportChain() {
		return call_String("admin_exportChain", new Object[] {});
	}

	@Override
	public String admin_importChain() {
		return call_String("admin_importChain", new Object[] {});
	}

	@Override
	public String admin_sleepBlocks() {
		return call_String("admin_sleepBlocks", new Object[] {});
	}

	@Override
	public String admin_verbosity() {
		return call_String("admin_verbosity", new Object[] {});
	}

	@Override
	public String admin_setSolc() {
		return call_String("admin_setSolc", new Object[] {});
	}

	@Override
	public String admin_startRPC() {
		return call_String("admin_startRPC", new Object[] {});
	}

	@Override
	public String admin_stopRPC() {
		return call_String("admin_stopRPC", new Object[] {});
	}

	@Override
	public String admin_setGlobalRegistrar() {
		return call_String("admin_setGlobalRegistrar", new Object[] {});
	}

	@Override
	public String admin_setHashReg() {
		return call_String("admin_setHashReg", new Object[] {});
	}

	@Override
	public String admin_setUrlHint() {
		return call_String("admin_setUrlHint", new Object[] {});
	}

	@Override
	public String admin_saveInfo() {
		return call_String("admin_saveInfo", new Object[] {});
	}

	@Override
	public String admin_register() {
		return call_String("admin_register", new Object[] {});
	}

	@Override
	public String admin_registerUrl() {
		return call_String("admin_registerUrl", new Object[] {});
	}

	@Override
	public String admin_startNatSpec() {
		return call_String("admin_startNatSpec", new Object[] {});
	}

	@Override
	public String admin_stopNatSpec() {
		return call_String("admin_stopNatSpec", new Object[] {});
	}

	@Override
	public String admin_getContractInfo() {
		return call_String("admin_getContractInfo", new Object[] {});
	}

	@Override
	public String admin_httpGet() {
		return call_String("admin_httpGet", new Object[] {});
	}

	@Override
	public String admin_nodeInfo() {
		return call_String("admin_nodeInfo", new Object[] {});
	}

	@Override
	public String admin_peers() {
		return call_String("admin_peers", new Object[] {});
	}

	@Override
	public String admin_datadir() {
		return call_String("admin_datadir", new Object[] {});
	}

	@Override
	public String net_addPeer() {
		return call_String("net_addPeer", new Object[] {});
	}

	@Override
	public boolean miner_start() {
		return call_Boolean("miner_start", new Object[] {});
	}

	@Override
	public boolean miner_stop() {
		return call_Boolean("miner_stop", new Object[] {});
	}

	@Override
	public boolean miner_setEtherbase(String coinBase) throws Exception {
		return call_Boolean("miner_setEtherbase", new Object[] {});
	}

	@Override
	public boolean miner_setExtra(String data) throws Exception {
		return call_Boolean("miner_setExtra", new Object[] {});
	}

	@Override
	public boolean miner_setGasPrice(String newMinGasPrice) {
		return call_Boolean("miner_setGasPrice", new Object[] {});
	}

	@Override
	public boolean miner_startAutoDAG() {
		return call_Boolean("miner_startAutoDAG", new Object[] {});
	}

	@Override
	public boolean miner_stopAutoDAG() {
		return call_Boolean("miner_stopAutoDAG", new Object[] {});
	}

	@Override
	public boolean miner_makeDAG() {
		return call_Boolean("miner_makeDAG", new Object[] {});
	}

	@Override
	public String miner_hashrate() {
		return call_String("miner_hashrate", new Object[] {});
	}

	@Override
	public String debug_printBlock() {
		return call_String("debug_printBlock", new Object[] {});
	}

	@Override
	public String debug_getBlockRlp() {
		return call_String("debug_getBlockRlp", new Object[] {});
	}

	@Override
	public String debug_setHead() {
		return call_String("debug_setHead", new Object[] {});
	}

	@Override
	public String debug_processBlock() {
		return call_String("debug_processBlock", new Object[] {});
	}

	@Override
	public String debug_seedHash() {
		return call_String("debug_seedHash", new Object[] {});
	}

	@Override
	public String debug_dumpBlock() {
		return call_String("debug_dumpBlock", new Object[] {});
	}

	@Override
	public String debug_metrics() {
		return call_String("debug_metrics", new Object[] {});
	}

	@Override
	public String personal_newAccount(String seed) {
		return call_String("personal_newAccount", new Object[] {});
	}

	@Override
	public boolean personal_unlockAccount(String addr, String pass, String duration) {
		return call_Boolean("personal_unlockAccount", new Object[] {});
	}

	@Override
	public String[] personal_listAccounts() {
		return (String[]) call("personal_listAccounts", new Object[] {}, String[].class);
	}

	/* JSON-RPC call routines */

	protected String call_String(String method, Object[] params) {
		return (String) call(method, params, String.class);
	}

	protected Boolean call_Boolean(String method, Object[] params) {
		return (Boolean) call(method, params, Boolean.class);
	}

	protected Object call(String method, Object[] params, Class<?> responseClass) {
		Object rsp = null;
		try {
			rsp = client.invoke(method, params, responseClass);
		} catch (Throwable e) {
			LOG.error(method + " failed", e);
		}
		return rsp;
	}

}
