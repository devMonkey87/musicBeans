package models;

import java.util.List;

public class Artist extends Person {

	private List<Album> discography;
	private String discoLabel;

	public Artist(String string) {

		this.setName(string);
	}

	public List<Album> getDiscography() {
		return discography;
	}

	public void setDiscography(List<Album> discography) {
		this.discography = discography;
	}

	public String getDiscoLabel() {
		return discoLabel;
	}

	public void setDiscoLabel(String discoLabel) {
		this.discoLabel = discoLabel;
	}

	@Override
	public String toString() {
		return "Artist [discography=" + discography + ", discoLabel=" + discoLabel + ", getName()=" + getName() + "]";
	}

}
