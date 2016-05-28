package org.chatch.ethrpc4j;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.chatch.ethrpc4j.mapping.Converters;
import org.chatch.ethrpc4j.methods.DbMethods;
import org.chatch.ethrpc4j.rpc.HttpRpcProvider;
import org.chatch.ethrpc4j.rpc.RpcProvider;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DbMethodsITTest {

	final static String GETH_PATH = "http://localhost:8545";

	final static String DB_NAME = "db";

	static DbMethods db;

	@BeforeClass
	public static void setUpOnce() throws java.net.MalformedURLException {
		RpcProvider provider = new HttpRpcProvider(GETH_PATH);
		EthereumClient client = new EthereumClient(provider);
		db = client.db();
	}

	@Test
	@Ignore // don't know how to setup db or if db exists?
	public void testHex() throws Exception {
		final String KEY = "akey";
		final byte[] DATA = Converters.stringToBytes("00aaff");
		Boolean putHexRsp = db.putHex(DB_NAME, KEY, DATA);
		assertTrue(putHexRsp);
		assertThat(db.getHex(DB_NAME, KEY), equalTo(DATA));
	}

	@Test
	@Ignore // don't know how to setup db or if db exists?
	public void testString() throws Exception {
		final String KEY = "akey";
		final String VALUE = "astring";
		Boolean putStringRsp = db.putString(DB_NAME, KEY, VALUE);
		assertTrue(putStringRsp);
		assertThat(db.getString(DB_NAME, KEY), equalTo(VALUE));
	}

}
