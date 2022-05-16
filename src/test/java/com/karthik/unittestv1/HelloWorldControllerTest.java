package com.karthik.unittestv1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloWorldController.class)
class HelloWorldControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    void helloWorld_basic() throws Exception {
        //call API
        RequestBuilder requestBuilder= MockMvcRequestBuilders
                .get("/api/v1/hello-world")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult mvcResult = mockMvc
                .perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"))
                .andReturn();
        assertEquals("Hello World",mvcResult.getResponse().getContentAsString());
        //verify response
    }
}