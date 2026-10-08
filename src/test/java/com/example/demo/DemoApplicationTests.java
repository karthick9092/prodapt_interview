package com.example.demo;

import com.example.demo.service.impl.DemoInterface;
import org.apache.coyote.BadRequestException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	DemoInterface demoInterface;

	@Test
	public void removeCharsWithValidInput() throws BadRequestException {
		String s = "eloquent";
		Assert.isTrue(demoInterface.removeChars(s).equals("eloquen"), "Expected result not found");
	}
}
