package com.jUnit.junit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static  org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JunitTests {

	@Test
	public void myTestMethod() {
		assertEquals(2,2) ;
		System.out.println("run est success");
	}

}
