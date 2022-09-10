package co.kwaw.xlist.document;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Entry {
    @Id
    private String id;
    private String version;
    private String owner;
    private URL url;
    private List<String> titles;
    private List<String> tags;
    private Map<String, String> internal;
    private String previousId;
    private String nextId;
    private String document;
    private LocalDateTime dateCreated;
    
	public Entry() {}
	
	public Entry(String id, String version, String owner, URL url, List<String> titles, List<String> tags,
			String previousId, String nextId, String document, LocalDateTime dateCreated) {
		this.id = id;
		this.version = version;
		this.owner = owner;
		this.url = url;
		this.titles = titles;
		this.tags = tags;
		this.previousId = previousId;
		this.nextId = nextId;
		this.document = document;
		this.dateCreated = dateCreated;
	}

	public String getId() {
		return id;
	}
	public String getVersion() {
		return version;
	}
	public String getOwner() {
		return owner;
	}
	public URL getUrl() {
		return url;
	}
	public List<String> getTitles() {
		return titles;
	}
	public List<String> getTags() {
		return tags;
	}
	public String getPreviousId() {
		return previousId;
	}
	public String getNextId() {
		return nextId;
	}
	public String getDocument() {
		return document;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public Map<String, String> getInternal() {
		return internal;
	}
}
