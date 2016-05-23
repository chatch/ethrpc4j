package org.chatch.ethrpc4j.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utils {
	static final String FILES_PATH = "src/test/resources";
	static final ObjectMapper MAPPER = new ObjectMapper();

	/**
	 * Get json response from file named 'name' in FILES_PATH/jsonrsp.
	 */
	public static String jsonRsp(String name) {
		return readFile(String.format("%s/jsonrsp/%s.json", FILES_PATH, name));
	}

	/**
	 * Get json string of the 'result' from json response file 'name'.
	 */
	public static String jsonRspResult(String name) {
		String rsp = jsonRsp(name);
		String resultStr;
		try {
			JsonNode node = MAPPER.reader().readTree(rsp).get("result");
			resultStr = MAPPER.writer().writeValueAsString(node);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return resultStr;
	}

	static String readFile(String path) {
		String contents = null;
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			contents = new String(encoded, Charset.forName("UTF-8"));
		} catch (IOException e) {
			System.err.println(String.format("Failed to read %s: %s", path, e.getMessage()));
		}
		return contents;
	}
}
