package models;

public class Song {

	private int duration;
	private String title;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Song(String title) {
		super();
		this.title = title;
	}

}
