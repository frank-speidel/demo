package dev.frankspeidel.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.*;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void main() {
		String[] args = { "abc", "abc", "abc" };
		DemoApplication.main(args);
	}

}
