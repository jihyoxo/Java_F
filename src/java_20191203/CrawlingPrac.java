package java_20191203;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingPrac {
	public static void main(String[] args) {
		String url = "https://sports.news.naver.com/index.nhn";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Elements element = doc.select("#news_category_contents_2_0.main_article_box.division ul li");
//		OR
		Elements element2 = doc.select("#news_category_contents_2_0");
		Elements element = element2.select("ul li");
		
		for (int i = 0; i < element.size(); i++) {
			Element liElement = element.get(i);
			String text = liElement.text();
			System.out.println(text);
		}
		

		/*for (int i = 0; i < element.size(); i++) {
			Element liElement = element.get(i);
			String href = element.select("a").attr("abs:href");
		
			try {
				doc2 = Jsoup.connect(url).get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			Elements ele = doc2.select("#newsEndContents");
			String content = ele.text();
			String title = element.text();
			System.out.println(title+":"+content);
		}*/
		
	}
}

