package com.ppro.interview.dp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Part1Controller.class)
class Part1ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testJSONResultForPart1() throws Exception {
        mockMvc.perform(get("/v1/part1"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"ERROR\": [1000105, 1000109], \"PENDING\": [1000101, 1000111], \"SUCCESS\": [1000100, 1000102, 1000103, 1000104, 1000106, 1000107, 1000108]}", true));
    }
}