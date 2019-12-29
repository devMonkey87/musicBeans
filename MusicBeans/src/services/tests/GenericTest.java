package services.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import models.Song;
import services.MusicServiceImpl;

public class GenericTest {
	
	MusicServiceImpl iMusicServiceImpl = new MusicServiceImpl();

	
	
	@Test
	public void generateSongList() {
		
	
	List<Song> songList = iMusicServiceImpl.getSongList();
	
	assertTrue(songList.size()>0);

	

}
	
}
