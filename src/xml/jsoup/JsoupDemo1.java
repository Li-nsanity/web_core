package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Jsoup快速入门
 */
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //1根据XML文档
        //1.1获取XML路径
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements name = document.getElementsByTag("name");
        System.out.println(name.size());
        Element element = name.get(0);
        String str = element.text();
        System.out.println(str);
    }
}
