package test;

import org.junit.Test;

import ssm.blog.util.CryptographyUtil;

public class TestMd5 {
	@Test
	public void testPass(){
		System.out.println(CryptographyUtil.md5("123456", "javacoder"));
	}
}
