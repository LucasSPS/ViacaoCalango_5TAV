package com.viacaoCalango.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ViacaoCalangoApplicationTests {

	@Test
	public void contextLoads() {
            int result=5;
            
            assertEquals(result, 2);
	}

}
