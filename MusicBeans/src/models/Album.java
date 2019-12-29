package models;

public class Album {

	private String title;
	private String genre;
	private Artist artist;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Album(String genre, Artist artist) {
		super();
		this.genre = genre;
		this.artist = artist;
	}

	public Album(String title) {
		super();
		this.title = title;
	}

	public Album() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Album [title=" + title + ", genre=" + genre + ", artist=" + artist + "]";
	}

}
