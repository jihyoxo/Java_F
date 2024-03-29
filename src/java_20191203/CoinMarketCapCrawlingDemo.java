package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		String url = 
				"https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20130429&end=20191203";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements elements = doc.select(
				".cmc-table__table-wrapper-outer table tbody tr");
		System.out.println("Date\t\t\tOpen\t\tHigh\t\tLow\t\tClose\t\tVolume\t\tMarket Cap");
		
		try{	
			fw = new FileWriter("c:\\dev\\io\\2019\\12\\crawling.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);
			pw.println("Date\t\t\tOpen\t\tHigh\t\tLow\t\tClose\t\tVolume\t\tMarket Cap");
	
			//c:\dev\io\2019\12\crawling.txt => 저장하기
			for (int i = 0; i < elements.size(); i++) {
				Element trElement = elements.get(i);
				String date = trElement.child(0).text();
				String open = trElement.child(1).text();
				String high = trElement.child(2).text();
				String low = trElement.child(3).text();
				String close = trElement.child(4).text();
				String volume = trElement.child(5).text();
				String cap = trElement.child(6).text();
				
//				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", 
//						date, open, high, low, close, volume, cap);
				String format = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", 
						date, open, high, low, close, volume, cap);
				System.out.print(format);
				pw.print(format);
			} 
			
		}catch (IOException e) {
				e.printStackTrace();
		}finally {
				if(pw != null) pw.close();
		}		
	}
}
