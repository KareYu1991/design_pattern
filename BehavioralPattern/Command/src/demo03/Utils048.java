package demo03;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Utils048 {
    public static String getName(String key) {
        try {
            DocumentBuilderFactory dBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dBuilderFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("Command\\src\\demo03\\config.xml"));
            NodeList nodeList = doc.getElementsByTagName(key);
            Node nodeName = nodeList.item(0).getFirstChild();
            return "demo03."+nodeName.getNodeValue();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getActor(String key) throws Exception {
        // 默认调用无参构造方法
        return Class.forName(getName(key)).newInstance();
    }

    public void test() {
        try {
            //创建 DOM 解析器的工厂
            DocumentBuilderFactory dBuilderFactory = DocumentBuilderFactory.newInstance();
            //得到 DOM 解析器对象
            DocumentBuilder builder = dBuilderFactory.newDocumentBuilder();
            //把要解析的 XML 文档转化为输入流,调用parse()得到代表整个文档的 Document 对象
            Document doc = builder.parse(new File("Command\\src\\demo03\\config.xml"));
            //得到keys子节点集合
            NodeList nodeList = doc.getElementsByTagName("keys");
            // 获取keys子节点中第一个子节点的属性值集合
            NamedNodeMap attributes = nodeList.item(0).getAttributes();
            // 获取到属性值
            attributes.item(0).getNodeValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
