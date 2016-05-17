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
		String price = null;
		try {
			price = client.invoke("eth_gasPrice", new Object[] {}, String.class);
		} catch (Throwable e) {
			LOG.error("eth_gasPrice failed", e);
		}
		return price;
	}

	@Override
	public String web3_clientVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String web3_sha3(String data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String net_version() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String net_peerCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean net_listening() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String eth_protocolVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SyncingResult eth_syncing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_coinbase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eth_mining() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String eth_hashrate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] eth_accounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_blockNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getBalance(String address, String block) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getBalance(String address) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getStorageAt(String address, String storageIdx, String blockId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getTransactionCount(String address, String blockId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getBlockTransactionCountByHash(String blockHash) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getBlockTransactionCountByNumber(String bnOrId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getUncleCountByBlockHash(String blockHash) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getUncleCountByBlockNumber(String bnOrId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getCode(String addr, String bnOrId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_sign(String addr, String data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_sendTransaction(CallArguments transactionArgs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_sendTransaction(String from, String to, String gas, String gasPrice, String value, String data,
			String nonce) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_sendRawTransaction(String rawData) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_call(CallArguments args, String bnOrId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_estimateGas(CallArguments args) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockResult eth_getBlockByHash(String blockHash, Boolean fullTransactionObjects) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockResult eth_getBlockByNumber(String bnOrId, Boolean fullTransactionObjects) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionResultDTO eth_getTransactionByHash(String transactionHash) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionResultDTO eth_getTransactionByBlockHashAndIndex(String blockHash, String index) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionResultDTO eth_getTransactionByBlockNumberAndIndex(String bnOrId, String index) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionReceiptDTO eth_getTransactionReceipt(String transactionHash) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockResult eth_getUncleByBlockHashAndIndex(String blockHash, String uncleIdx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockResult eth_getUncleByBlockNumberAndIndex(String blockId, String uncleIdx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] eth_getCompilers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompilationResult eth_compileLLL(String contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompilationResult eth_compileSolidity(String contract) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompilationResult eth_compileSerpent(String contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_resend() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_pendingTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_newFilter(FilterRequest fr) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_newBlockFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_newPendingTransactionFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eth_uninstallFilter(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] eth_getFilterChanges(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] eth_getFilterLogs(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] eth_getLogs(FilterRequest fr) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_getWork() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_submitWork() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eth_submitHashrate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String db_putString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String db_getString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String db_putHex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String db_getHex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_post() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_version() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_newIdentity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_hasIdentity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_newGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_addToGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_newFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_uninstallFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_getFilterChanges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String shh_getMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean admin_addPeer(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String admin_exportChain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_importChain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_sleepBlocks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_verbosity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_setSolc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_startRPC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_stopRPC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_setGlobalRegistrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_setHashReg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_setUrlHint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_saveInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_register() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_registerUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_startNatSpec() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_stopNatSpec() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_getContractInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_httpGet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_nodeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_peers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String admin_datadir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String net_addPeer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean miner_start() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean miner_stop() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean miner_setEtherbase(String coinBase) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean miner_setExtra(String data) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean miner_setGasPrice(String newMinGasPrice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean miner_startAutoDAG() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean miner_stopAutoDAG() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean miner_makeDAG() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String miner_hashrate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String debug_printBlock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String debug_getBlockRlp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String debug_setHead() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String debug_processBlock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String debug_seedHash() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String debug_dumpBlock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String debug_metrics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String personal_newAccount(String seed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean personal_unlockAccount(String addr, String pass, String duration) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] personal_listAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
