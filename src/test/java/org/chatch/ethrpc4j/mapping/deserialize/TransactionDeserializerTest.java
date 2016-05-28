package org.chatch.ethrpc4j.mapping.deserialize;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.IOException;

import org.chatch.ethrpc4j.mapping.EthRpc4jObjectMapper;
import org.chatch.ethrpc4j.test.Utils;
import org.chatch.ethrpc4j.types.Transaction;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class TransactionDeserializerTest {

	final static EthRpc4jObjectMapper mapper = new EthRpc4jObjectMapper();

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		String json = Utils.jsonRspResult("tx");
		System.out.println(json);

		Transaction tx = mapper.readValue(json, Transaction.class);
		assertThat(tx, not(nullValue()));

		assertThat(tx.getHash(), equalTo("0x1a7e99b6f1a3e34b234f37fbc1b340f90cc7b5c50e70750870cdbcde14f218d0"));
		assertThat(tx.getBlockHash(), equalTo("0x723ce763ee6300fa55bd61746b72310ff8ac92eaabb9bc1470de6042779c3d3b"));
		assertThat(tx.getTo(), equalTo("0x7788944b6dcd32f8a3042b817cfe7c5588382bd3"));
		assertThat(tx.getFrom(), equalTo("0x687422eea2cb73b5d3e242ba5456b782919afc85"));
		assertThat(tx.getInput(), equalTo("0x"));

		assertThat(tx.getBlockNumber(), equalTo(977396L));
		assertThat(tx.getTransactionIndex(), equalTo(4L));
		assertThat(tx.getNonce(), equalTo(1049520L));
		assertThat(tx.getGas(), equalTo(314150L));
		assertThat(tx.getGasPrice(), equalTo(20000000000L));
		assertThat(tx.getValue(), equalTo(1000000000000000000L));
	}
}
