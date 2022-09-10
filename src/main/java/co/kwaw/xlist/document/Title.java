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
    private URL url;
    private List<String> names;
    private List<String> tags;
    private List<String> entries;
    
	public Title(String id, String version, String owner, URL url, List<String> names, List<String> tags,
			List<String> entries) {
		this.id = id;
		this.version = version;
		this.owner = owner;
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

	public URL getUrl() {
		return url;
	}

	public List<String> getNames() {
		return names;
	}

	public List<String> getTags() {
		return tags;
	}

	public List<String> getEntries() {
		return entries;
	}
	
	
}
