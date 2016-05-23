package org.chatch.ethrpc4j.mapping;

import static org.chatch.ethrpc4j.mapping.MappingUtils.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MappingUtilsTest {

	@Test
	public void testHexToQuantity() {
		assertThat(hexToQuantity("0x0"), equalTo(0L));
		assertThat(hexToQuantity("0xe471d"), equalTo(935709L));
	}

}
