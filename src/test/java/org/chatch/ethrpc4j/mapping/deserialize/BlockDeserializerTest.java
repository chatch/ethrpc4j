package org.chatch.ethrpc4j.mapping.deserialize;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.IOException;

import org.chatch.ethrpc4j.test.Utils;
import org.chatch.ethrpc4j.types.Block;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class BlockDeserializerTest {

	final static TestMapper mapper = new TestMapper();

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		String json = Utils.jsonRspResult("block");
		System.out.println(json);

		Block block = mapper.readValue(json, Block.class);
		assertThat(block, not(nullValue()));

		assertThat(block.getNumber(), equalTo(935709L));
		assertThat(block.getDifficulty(), equalTo(745828364L));
		assertThat(block.getTotalDifficulty(), equalTo(57706275288431L));
		assertThat(block.getSize(), equalTo(886L));
		assertThat(block.getGasLimit(), equalTo(4713085L));
		assertThat(block.getGasUsed(), equalTo(63000L));
		assertThat(block.getTimestamp(), equalTo(1463153123L));

		assertThat(block.getHash(), equalTo("0xc8537f462845d63684ebf16eba167b9ce7d48f1bd8392a8ec4d29b97d39bf62d"));
		assertThat(block.getParentHash(),
				equalTo("0x3af12f4705297e10abc436afe703659186cdd1f550f33a36dcbc99c4a0799bd3"));
		assertThat(block.getNonce(), equalTo("0x9c744c11b9c6c576"));
		assertThat(block.getSha3Uncles(),
				equalTo("0x1dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347"));
		assertThat(block.getLogsBloom(), equalTo(
				"0x00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
		assertThat(block.getTransactionsRoot(),
				equalTo("0xdad34026eade29823ff79af9abfd5cbf0168f47d33a43c91014e2ff490e99fa8"));
		assertThat(block.getStateRoot(), equalTo("0x42a7bb86e42dfaeba5a1ce2402ded0fb76b838da5a0e799c6a00ad22f0582426"));
		assertThat(block.getReceiptRoot(),
				equalTo("0x2642c5b6853219edf77348c34f184b4ebabda73b0535f12ef572ecbd22ad4d69"));
		assertThat(block.getMiner(), equalTo("0xdf712c685be75739eb44cb6665f92129e45864e4"));
		assertThat(block.getExtraData(), equalTo("0xd783010500844765746887676f312e352e31856c696e7578"));
	}

}
