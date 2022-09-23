package com.ppro.interview.dp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Part3Controller.class)
class Part3ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testJSONResultForPart3() throws Exception {
        mockMvc.perform(get("/v1/part3"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"matched\": [1000105, 1000106, 1000107, 1000108, 1000109], \"mismatched\": [1000103, 1000104], \"missing\": [1000100, 1000110]}", true));
    }
}