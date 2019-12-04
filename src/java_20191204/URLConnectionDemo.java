package java_20191204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
	public static void main(String[] args) 
			throws IOException {
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=031&aid=0000517696");
		URLConnection urlCon = url.openConnection();
		
		String cacheControl = urlCon.getHeaderField("cache-control");
		String contentType = urlCon.getHeaderField("content-type");
		String date = urlCon.getHeaderField("date");
		System.out.printf("cache-control : %s%n", cacheControl);
		System.out.printf("content-type : %s%n", contentType);
		System.out.printf("datel : %s%n", date);
		
		InputStream in = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null){
			System.out.println(readLine);
		}
	}
}
