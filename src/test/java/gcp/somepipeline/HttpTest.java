package gcp.somepipeline;

import gcp.somepipeline.entity.object.TopObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpTest {

    public static final String API_SUFFIX = "/api/v1/";
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testObjectsCount() {
        assertThat(this.restTemplate.getForEntity("http://localhost:" + port + API_SUFFIX + "objects",
                TopObject[].class).getBody()).hasSize(3);
    }
}
