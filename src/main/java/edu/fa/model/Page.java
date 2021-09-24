package edu.fa.model;

public class Page {
	private String name;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Page(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

	public Page() {
		super();
	}

	@Override
	public String toString() {
		return "Page [name=" + name + ", url=" + url + "]";
	}

}
