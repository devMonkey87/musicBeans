package models;

import java.util.Date;
import java.util.List;

public class AlbumDetail extends Album {

	private List<Song> tracklist;
	private Date releaseDate;

	public AlbumDetail() {

	}

	public List<Song> getTracklist() {
		return tracklist;
	}

	public void setTracklist(List<Song> tracklist) {
		this.tracklist = tracklist;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

}
