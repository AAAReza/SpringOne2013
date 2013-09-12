package org.springframework.samples.mvc.simple;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class SimpleControllerTests {

    private MockMvc mockMvc;

    @Before()
    public void setup() {
        mockMvc = standaloneSetup(new SimpleController()).build();
    }

    @Test
    public void simple() throws Exception {
        mockMvc.perform(get("/simple"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(content().string("Hello world!"));
    }

}
