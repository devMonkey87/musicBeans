package main;

import java.util.List;

import mockedData.MockJava;
import models.Album;
import services.MusicService;
import services.MusicServiceImpl;

public class Main {

	public static void main(String[] args) {

		MusicService musicServ = new MusicServiceImpl();

		List<Album> allAlbumsFromArtist = musicServ.getAllAlbumsFromArtist("Prince");

		int index =1;
		for (Album album : allAlbumsFromArtist) {

			System.out.println("ALBUM NUM :"+index +  album.toString());
			index++;

		}

		musicServ.getSongList();

		MockJava mocker = new MockJava();

		Album genericAlbum = mocker.genericAlbum();

		String detailFromAlbum = musicServ.getDetailFromAlbum(genericAlbum);

		System.out.println(detailFromAlbum);
	}

}
