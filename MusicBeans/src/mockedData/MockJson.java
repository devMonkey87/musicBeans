package mockedData;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

import models.Album;

public class MockJson {
	
	

	public String te() {
		
		Gson name = new Gson();
		
		String json = name.toJson(new Album("Lol"));
		
		System.out.println(json);
		
		
		return json;
		
		
		
	}
	
	
	

	
	
	
	
	

}
