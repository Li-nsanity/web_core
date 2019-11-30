package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupDemo2 {
    public static void main(String[] args) {
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<!-- \n" +
                "\t1.填写xml文档的根元素\n" +
                "\t2.引入xsi前缀.  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "\t3.引入xsd文件命名空间.  xsi:schemaLocation=\"http://www.itcast.cn/xml  student.xsd\"\n" +
                "\t4.为每一个xsd约束声明一个前缀,作为标识  xmlns=\"http://www.itcast.cn/xml\" \n" +
                "\t\n" +
                "\t\n" +
                " -->\n" +
                " <students   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                " \t\t\t xmlns=\"http://www.itcast.cn/xml\" \n" +
                " \t\t   xsi:schemaLocation=\"http://www.itcast.cn/xml  student.xsd\"\n" +
                " \t\t    >\n" +
                " \t<student number=\"heima_0001\">\n" +
                " \t\t<name>tom</name>\n" +
                " \t\t<age>18</age>\n" +
                " \t\t<sex>male</sex>\n" +
                " \t</student>\n" +
                "\t\t \n" +
                " </students>";
        Document doc = Jsoup.parse(str);
        Elements name = doc.getElementsByTag("name");
        Element element = name.get(0);
        String text = element.text();
        System.out.println(text);
    }
}
