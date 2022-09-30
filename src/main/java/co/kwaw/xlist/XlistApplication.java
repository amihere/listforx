package co.kwaw.xlist;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.mongodb.reactivestreams.client.MongoClient;

@SpringBootApplication
public class XlistApplication implements CommandLineRunner {
	private final Log logger = LogFactory.getLog(XlistApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(XlistApplication.class, args);
	}

	@Autowired
	MongoClient mongoClient;

	@Bean
	public ReactiveMongoTemplate reactiveMongoTemplate() {
		return new ReactiveMongoTemplate(mongoClient, "xlist");
	}

	@Bean
	public WebClient webClient() {
		return WebClient.builder().baseUrl("http://localhost:8081").build();
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Ready");
	}
}
