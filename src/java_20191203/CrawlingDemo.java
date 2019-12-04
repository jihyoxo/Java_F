package java_20191203;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
		String url = "http://www.imbc.com/";
		//HTML 문서 전체를 관리하기 위한 객체
		Document doc = null; 				//jsoup꺼 사용하기.
		
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements element = doc.select(".con-wrap.notice-wrap"); 	// doc안에  있는 class
		Elements titleElements = element.select("h3");					// class 안에 있는 h3
		String noticeTitle = titleElements.text();							// h3에 있는 text 
		System.out.println(noticeTitle);										// text 내용 프린트
		
		Elements liElements = element.select(".notice-list ul li");					
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}
	}
}
