package utilities;

import java.util.Date;
import java.util.Random;

import models.Album;
import models.AlbumDetail;

public class Tools {

	public static AlbumDetail fromAlbumToDetail(Album album) {

		AlbumDetail detailed = new AlbumDetail();
		detailed.setArtist(album.getArtist());
		detailed.setGenre(album.getGenre());
		detailed.setTitle(album.getTitle());
		detailed.setReleaseDate(new Date());

		return detailed;
	}

	public static int randomFromSequence(int length) {

		Random rd = new Random();

		return rd.nextInt(length);

	}

}
