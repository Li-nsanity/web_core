package xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsoupDemo5 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = JsoupDemo5.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        JXDocument jxDocument = new JXDocument(document);
        List<Object> list = jxDocument.sel("//student//name");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("----------------");
        List<JXNode> jxNodes = jxDocument.selN("//student//sex");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
            System.out.println(jxNode.isText());
        }
        System.out.println("----------------");
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@id=02]");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
            System.out.println(jxNode.isText());
        }

    }
}
