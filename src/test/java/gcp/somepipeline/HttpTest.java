package gcp.somepipeline;

import gcp.somepipeline.entity.TopObject;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.LinkedList;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpTest {

    public static final String API_SUFFIX = "/api/";
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testObjectsCount() {
        String url = "http://localhost:" + port + API_SUFFIX + "topObjects";
        ResponseEntity<CollectionModel<TopObject>> exchange = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<>() {
        });

        LinkedList<TopObject> topObjects = new LinkedList<>(exchange.getBody().getContent());

        Assertions.assertThat(topObjects.size()).isEqualTo(3);
    }
}
