package co.kwaw.xlist.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import co.kwaw.xlist.document.Entry;

public interface EntryMongoRepository extends ReactiveMongoRepository<Entry, String> {
}
