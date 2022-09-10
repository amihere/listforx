package co.kwaw.xlist.document;

import java.net.URL;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Title {
    @Id
    private String id;
    private String version;
    private String owner;
    private String protocol; // way of reading data, sorting, prioritizing fields
    private URL url;
    private List<String> names;
    private List<String> tags;
    private List<Entry> entries;
    
	public Title(String id, String version, String owner, String protocol, URL url, List<String> names, List<String> tags,
			List<Entry> entries) {
		this.id = id;
		this.version = version;
		this.owner = owner;
		this.protocol = protocol;
		this.url = url;
		this.names = names;
		this.tags = tags;
		this.entries = entries;
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
	
	public String getProtocol() {
		return protocol;
	}

	public URL getUrl() {
		return url;
	}

	public List<String> getNames() {
		return names;
	}

	public List<String> getTags() {
		return tags;
	}

	public List<Entry> getEntries() {
		return entries;
	}
	
	
}
