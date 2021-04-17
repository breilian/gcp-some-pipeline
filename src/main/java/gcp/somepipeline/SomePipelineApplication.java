package gcp.somepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SomePipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomePipelineApplication.class, args);
	}

	@GetMapping("/check")
	public String check() {
		return "It works.";
	}

}
