package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://baike.baidu.com/item/jsoup");
        Document document = Jsoup.parse(url, 1000);
        System.out.println(document);
    }
}
