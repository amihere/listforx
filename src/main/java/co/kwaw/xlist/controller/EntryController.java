package co.kwaw.xlist.controller;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.kwaw.xlist.document.Entry;
import co.kwaw.xlist.service.impl.DataAccessServiceImpl;
import reactor.core.publisher.Mono;

@RestController
public class EntryController {

	@Autowired
	private DataAccessServiceImpl dataAccessService;

	@PostMapping("/entry")
	public Mono<Entry> postEntry(@RequestBody Entry entry) throws MalformedURLException {
		System.out.println(Thread.currentThread().getName());

		var entryMono = dataAccessService.insertEntry(entry);

		return entryMono;
	}

	@GetMapping("/entry")
	public Mono<Entry> getEntry(@RequestParam("id") String id) {
		Mono<Entry> mono = dataAccessService.getEntry(id);
		return mono;
	}
}
