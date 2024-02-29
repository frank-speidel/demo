package dev.frankspeidel.demo.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DemoController.class)
public class DemoControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void sayHello() throws Exception {
		this.mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(jsonPath("$.<key>").value("<value>"));
	}

	@Test
	public void sayHelloTODO() throws Exception {
		this.mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(jsonPath("$.<key>").value("<value>"));
	}

	@Test
	public void sayHelloTODOTODO() throws Exception {
		this.mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(jsonPath("$.<key>").value("<value>"));
	}

	@Test
	public void sayHelloTODOTODOTODO() throws Exception {
		this.mockMvc.perform(get("/hello"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(jsonPath("$.<key>").value("<value>"));
	}
}
