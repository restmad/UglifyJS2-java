package com.xk72.uglifyjs2;

import javax.script.ScriptException;

import org.junit.Assert;
import org.junit.Test;

public class BasicTests {

	@Test
	public void testBasicCompress() throws ScriptException {
		String result = new UglifyJS2().compress("(function() { var karl = \"abc\"; return karl; })();");
		Assert.assertEquals("(function(){var karl=\"abc\";return karl})();", result);
	}

	@Test
	public void testBasicMangle() throws ScriptException {
		String result = new UglifyJS2().compress("(function() { var karl = \"abc\"; return karl; })();", true);
		Assert.assertEquals("(function(){var n=\"abc\";return n})();", result);
	}
	
}