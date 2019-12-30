package services.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import jsonMockupBigObject.WebApp;
import models.Song;
import services.MusicServiceImpl;

public class GenericTest {
	
	MusicServiceImpl iMusicServiceImpl = new MusicServiceImpl();

	
	
	@Test
	public void generateSongList() {
		
	
	List<Song> songList = iMusicServiceImpl.getSongList();
	
	//assertTrue(songList.size()>0);

	

}
	
	

@Test
public void readJsonFromFile() throws IOException {
	final Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
	final InputStream is = GenericTest.class.getClassLoader().getResourceAsStream("files/json.txt");
	final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
	final WebApp webApp = gson.fromJson(bufferedReader, WebApp.class);
	assertNotNull(webApp.getServlet());
//	assertEquals(2, webApp.getVacaciones().size());

	bufferedReader.close();
}

@Test
public void readSimpleJsonFromFile() throws IOException {
	final Gson gson = new Gson();
	final InputStream is = GenericTest.class.getClassLoader().getResourceAsStream("files/BasicJsonSong.txt");
	final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
	
	
	final Song[] song =  gson.fromJson(bufferedReader, Song[].class);
	
	assertNotNull(song);

	bufferedReader.close();
}
	
}
