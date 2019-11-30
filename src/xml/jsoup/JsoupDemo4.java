package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo4 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo4.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements element1 = document.select("name");
        System.out.println(element1);
        Elements element2 = document.select("sex");
        System.out.println(element2);
    }
}
