package co.kwaw.xlist.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import co.kwaw.xlist.document.Entry;
import co.kwaw.xlist.service.DataAccessService;
import reactor.core.publisher.Mono;


public class DataAccessServiceImpl implements DataAccessService {
	
	@Autowired
    public ReactiveMongoTemplate mongoTemplate;
	
	@Override
	public Mono<Entry> insertEntry(Entry entry) {
		System.out.println(Thread.currentThread().getName());
		Mono<Entry> insertion = mongoTemplate.insert(entry);
		return insertion;
	}
	
	@Override
	public Mono<Entry> getEntry(String id) {
//		Thread.sleep(5000);
		Mono<Entry> read = mongoTemplate.findById(id, Entry.class);
		return read;
	}
	
	// Display lists (title plus entries)
	
	// how protocol would affect reading the list
	
	// Query for particular lists .. search framwork (index names and query at once) 
	
	// Search autocomplete for names... 
	
	
	
}
