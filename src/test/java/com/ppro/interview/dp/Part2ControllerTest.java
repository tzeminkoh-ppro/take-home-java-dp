package com.ppro.interview.dp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Part2Controller.class)
class Part2ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testJSONResultForPart2() throws Exception {
        mockMvc.perform(get("/v1/part2"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"failed\": [\"1000103\", \"1000104\", \"1000105\", \"1000109\", \"1000111\"], \"ok\": [\"1000106\", \"1000107\", \"1000108\", \"1000110\"], \"waiting\": [\"1000101\", \"1000102\"]}", true));
    }
}