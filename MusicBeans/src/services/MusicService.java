package services;

import java.util.List;

import models.Album;
import models.Song;

public interface MusicService {

	public List<Album> getAllAlbumsFromArtist(String name);

	public List<Song> getSongList();

	public String getDetailFromAlbum(Album album);
	
	public String getJson();

}
