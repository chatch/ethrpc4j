package org.chatch.ethrpc4j.mapping;

import static org.chatch.ethrpc4j.mapping.Converters.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MappingUtilsTest {

	@Test
	public void testHexToQuantity() {
		assertThat(hexToQuantity("0x0"), equalTo(0L));
		assertThat(hexToQuantity("0xe471d"), equalTo(935709L));
	}

	@Test
	public void testStringToBytes() {
		final byte[] EXPECTED = new byte[] { -56, 83, 127 };
		assertThat(stringToBytes("c8537f"), equalTo(EXPECTED));
	}

}