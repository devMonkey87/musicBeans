package mockedData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.Album;
import models.Artist;
import models.Song;
import utilities.Tools;

public class MockJava {
	private HashMap<String, Album[]> mockDiscography;

	public MockJava() {
		mockDiscography = new HashMap<String, Album[]>();

		Album[] madonnaA = new Album[3];
		madonnaA[0] = new Album("Erotica");
		madonnaA[1] = new Album("Madame X");
		madonnaA[2] = new Album("Hard Candy");
		Album[] princeA = new Album[3];
		princeA[0] = new Album("1999");
		princeA[1] = new Album("Greatest");
		princeA[2] = new Album("Vault");
		Album[] georgeA = new Album[3];
		georgeA[0] = new Album("Faith");
		georgeA[1] = new Album("Patience");
		georgeA[2] = new Album("Older");

		this.mockDiscography.put("Madonna", madonnaA);
		this.mockDiscography.put("Prince", princeA);
		this.mockDiscography.put("George M.", georgeA);

	}

	public HashMap<String, Album[]> getMockDiscography() {
		return mockDiscography;
	}

	public void setMockDiscography(HashMap<String, Album[]> mockDiscography) {
		this.mockDiscography = mockDiscography;
	}

	public List<Song> songsRandom() {
		List<Song> tracklist = new ArrayList<Song>();
		String[] parte1 = { "Nature", "Feeling", "First", "Love" };
		String[] parte2 = { "Hurts", "Blue", "Love", "Pumpkin" };
		for (int i = 0; i < parte2.length; i++) {
			int randomValue = Tools.randomFromSequence(parte1.length);
			String string1 = parte1[randomValue];
			String string2 = parte2[randomValue];
			Song song = new Song(string1 + " " + string2);
			tracklist.add(song);
		}
		return tracklist;
	}

	public Album genericAlbum() {

		Album generic = new Album();

		generic.setTitle("To be set");
		generic.setArtist(new Artist("TEST"));
		generic.setGenre("GENERAL");

		return generic;
	}
}