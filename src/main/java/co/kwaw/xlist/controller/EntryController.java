package co.kwaw.xlist.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.kwaw.xlist.document.Entry;
import co.kwaw.xlist.service.DataAccessService;
import reactor.core.publisher.Mono;

@RestController
public class EntryController {
	
	@Autowired
	private DataAccessService dataAccessService;
	
	@PostMapping("/entry")
	public Mono<Entry> postEntry(@RequestBody Entry entry) throws MalformedURLException {
		System.out.println(Thread.currentThread().getName());
		
		var entryMono = dataAccessService
				.insertEntry(new Entry(null, "v.xlist." + LocalDateTime.now().toEpochSecond(ZoneOffset.UTC), "kwame",
						new URL("http://goal.com"), Arrays.asList("A Default Title","Simret Restaurant"), Arrays.asList("first"),
						null, null, "Ethiopian restaurant with good buffet options.", LocalDateTime.now()));

		return entryMono;
	}
	
	@GetMapping("/entry")
	public Mono<Entry> getEntry(@RequestParam("id") String id) {
		Mono<Entry> mono = dataAccessService.getEntry(id);
		return mono;
	}
}
