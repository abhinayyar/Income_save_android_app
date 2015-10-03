package income.save;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;

public class direct_connection extends Activity
{
	public static final String urlstring="http://10.0.2.2:8080/servlet/";

	public static String sendRequest(String urlString) throws IOException{
		try {
			System.out.println(urlString);
			URL url = new URL(urlString);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			InputStream is = connection.getInputStream();
			int i = 0;
			StringBuilder data = new StringBuilder("");
			while((i=is.read())!=-1)
			{
				data.append((char)i);
			}
			String response = data.toString().trim();			
			System.out.println("::::: "+response);
			return response;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} 
	}

}


