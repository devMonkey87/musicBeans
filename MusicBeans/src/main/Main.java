package main;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;

import mockedData.MockJava;
import models.Album;
import services.MusicService;
import services.MusicServiceImpl;
import utilities.UtilesLog;

public class Main {
	
	//Se ha de guardar el .properties en una carpeta resources para que lo ubique
	
	static String log4jConfPath = "src/app/resources/log4j.properties";

	public static void main(String[] args) {
		
		PropertyConfigurator.configure(log4jConfPath);


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

		
		UtilesLog.registrarInfo(Main.class, UtilesLog.TipoLog.DEBUG, detailFromAlbum);
		
		String json111 = musicServ.getJson();
		

	}
	

}
