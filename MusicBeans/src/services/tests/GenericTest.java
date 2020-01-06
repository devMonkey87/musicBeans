package services.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import Exceptions.OwnException;
import models.Album;
import models.Song;
import services.MusicServiceImpl;

public class GenericTest {

	MusicServiceImpl iMusicServiceImpl = new MusicServiceImpl();

	@Test
	public void readSimpleJsonFromFile() throws IOException {
		final Gson gson = new Gson();
		final InputStream is = GenericTest.class.getClassLoader().getResourceAsStream("files/BasicJsonSong.txt");
		final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));

		final Song[] song = gson.fromJson(bufferedReader, Song[].class);

		assertNotNull(song);

		bufferedReader.close();
	}

	@Test
	public void testingExceptions() throws OwnException {

		int value = 0;
		List<Album> allAlbumsFromArtist = iMusicServiceImpl.getAllAlbumsFromArtist("Prince");

		int realSize = allAlbumsFromArtist.size();

			for (int i = 0; i <= realSize + 2; i++) {

				System.out.println("leyendo elemento..." + allAlbumsFromArtist.get(i).getTitle());

				if (i == 2) {

					throw new OwnException("Valor erróneo", new Throwable());
				}

			}


		assertEquals(10, value);

	}

}
