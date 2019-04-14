package com.demo_1.entity;

public class LearnResouce {
	private int id;
	private String author;
    private String title;
    private String url;
    
    public LearnResouce() {
    	
    }
    
    public LearnResouce(String author,String title,String url) {
    	this.author=author;
    	this.title=title;
    	this.url=url;
    	}

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
