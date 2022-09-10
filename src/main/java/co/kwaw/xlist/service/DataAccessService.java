package co.kwaw.xlist.service;

import co.kwaw.xlist.document.Entry;
import reactor.core.publisher.Mono;

public interface DataAccessService {
	Mono<Entry> insertEntry(Entry entry);

	Mono<Entry> getEntry(String id);
}
