package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mockedData.MockJava;
import mockedData.MockJson;
import models.Album;
import models.AlbumDetail;
import models.Song;
import utilities.Tools;

public class MusicServiceImpl implements MusicService {

	MockJava mockData = new MockJava();

	@Override
	public List<Album> getAllAlbumsFromArtist(String name) {

		HashMap<String, Album[]> discography = new HashMap<String, Album[]>();

		List<Album> albumList = new ArrayList<Album>();

		switch (name) {

		case "Madonna":

			mockDataHandler(name, albumList);
			break;
		case "George Michael":

			mockDataHandler(name, albumList);
			break;
		case "Prince":
			mockDataHandler(name, albumList);
			break;
		}

		return albumList;
	}

	public void mockDataHandler(String name, List<Album> albumList) {
		HashMap<String, Album[]> discography;
		discography = mockData.getMockDiscography();
		Album[] madnnaAlbumbs = discography.get(name);

		for (Album album : madnnaAlbumbs) {
			albumList.add(album);

		}
	}

	public List<Song> getSongList() {

		List<Song> name = new ArrayList<Song>();

		name = mockData.songsRandom();
		
		return name;
	}

	public String getDetailFromAlbum(Album album) {

		AlbumDetail fromAlbumToDetail = Tools.fromAlbumToDetail(album);
		return fromAlbumToDetail.toString();

	}
	
	public String getJson() {
		
		MockJson json = new MockJson();
		
		return json.te();
	}

}
