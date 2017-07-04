package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	MyService myService;

	@Test
	public void test() {

		
		assertEquals("THIS IS A TEST MESSAGE", myService.createMessage());
	}

	@TestConfiguration
	public static class DemoApplicationTestConfiguration {

		@Primary
		@Bean
		public MyService dummy() {
			return new MyService() {

				@Override
				public String createMessage() {
					return "THIS IS A TEST MESSAGE";
				}
			};
		}
	}
}
