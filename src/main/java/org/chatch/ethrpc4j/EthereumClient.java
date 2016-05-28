package org.chatch.ethrpc4j;

import org.chatch.ethrpc4j.methods.DbMethods;
import org.chatch.ethrpc4j.methods.EthMethods;
import org.chatch.ethrpc4j.methods.NetMethods;
import org.chatch.ethrpc4j.methods.PersonalMethods;
import org.chatch.ethrpc4j.methods.ShhMethods;
import org.chatch.ethrpc4j.methods.Web3Methods;
import org.chatch.ethrpc4j.rpc.HttpRpcProvider;
import org.chatch.ethrpc4j.rpc.RpcProvider;

/**
 * Ethereum JSON RPC Client.
 * 
 * @see <a href="https://github.com/ethereum/wiki/wiki/JSON-RPC">api docs
 *      here</a>.
 */
public class EthereumClient {

	private static final EthereumClient defaultInstance = new EthereumClient(new HttpRpcProvider());

	private EthMethods eth;

	private Web3Methods web3;

	private DbMethods db;

	private ShhMethods shh;

	private PersonalMethods personal;

	private NetMethods net;

	public EthereumClient(RpcProvider provider) {
		this.eth = new EthMethods(provider);
		this.web3 = new Web3Methods(provider);
		this.db = new DbMethods(provider);
		this.shh = new ShhMethods(provider);
		this.personal = new PersonalMethods(provider);
		this.net = new NetMethods(provider);
	}

	public EthMethods eth() {
		return eth;
	}

	public Web3Methods web3() {
		return web3;
	}

	public DbMethods db() {
		return db;
	}

	public ShhMethods shh() {
		return shh;
	}

	public PersonalMethods personal() {
		return personal;
	}

	public NetMethods net() {
		return net;
	}

	public static EthereumClient getDefaultInstance() {
		return defaultInstance;
	}

}
