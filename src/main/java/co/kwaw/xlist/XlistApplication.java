package co.kwaw.xlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.mongodb.reactivestreams.client.MongoClient;

import co.kwaw.xlist.document.Entry;
import co.kwaw.xlist.service.DataAccessService;
import co.kwaw.xlist.service.impl.DataAccessServiceImpl;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class XlistApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(XlistApplication.class, args);
	}

	@Autowired
    MongoClient mongoClient;

	@Bean
    public DataAccessService dataAccessService() {
		return new DataAccessServiceImpl();
	}
	
    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(mongoClient, "xlist");
    }

    @Bean
    public WebClient webClient() {
    	return  WebClient
    			.builder()
    			.baseUrl("http://localhost:8081")
    			.build();
    }
    
    @Autowired
    ReactiveMongoTemplate tmp;
    
    @Override
    public void run(String... args) throws Exception {
    	
    	// Create a list of ethiopian restaurants.
    	
    	Mono<Entry> insertion = tmp.insert(new Entry(null, "2022.v", "dat-owner", null, null, null, null, null, null, null));
    	
    	insertion.subscribe(entry -> {
    		System.out.println(entry.getDocument());
    	});
    }
}
