package example.hibernate.entity;

import java.time.LocalDate;

public class Article {
	
	private int artId;
	private String headLine;
	private LocalDate publishedOn;
	public Article() {
		// TODO Auto-generated constructor stub
	}
	public Article(int artId, String headLine, LocalDate publishedOn) {
		super();
		this.artId = artId;
		this.headLine = headLine;
		this.publishedOn = publishedOn;
	}
	public int getArtId() {
		return artId;
	}
	public void setArtId(int artId) {
		this.artId = artId;
	}
	public String getHeadLine() {
		return headLine;
	}
	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}
	public LocalDate getPublishedOn() {
		return publishedOn;
	}
	public void setPublishedOn(LocalDate publishedOn) {
		this.publishedOn = publishedOn;
	}
	@Override
	public String toString() {
		return "Article [artId=" + artId + ", headLine=" + headLine + ", publishedOn=" + publishedOn + "]";
	}

}
