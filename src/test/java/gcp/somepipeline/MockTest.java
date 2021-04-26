package gcp.somepipeline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MockTest {

    @Autowired
    private MockMvc mockMvc;

    public static final String API_SUFFIX = "/api/";

    @Test
    void testObjectsCount() throws Exception {
        mockMvc.perform(get("http://localhost:" + "8080" + API_SUFFIX + "topObjects/1001/actions")).andExpect(status().isOk())
                .andExpect(jsonPath("$._embedded.objectActions", hasSize(2)));
    }
}
