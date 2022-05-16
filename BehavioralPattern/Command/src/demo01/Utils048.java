package demo01;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Utils048 {
    public static String getName() {
        try {
            DocumentBuilderFactory dBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dBuilderFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("Command\\src\\config.xml"));
            NodeList nodeList = doc.getElementsByTagName("brandName");
            Node nodeName = nodeList.item(0).getFirstChild();
            String brandName = nodeName.getNodeValue().trim().replace("Class", "Command");
            String name = brandName;
            return name;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getActor() throws Exception {
        return Class.forName(getName()).newInstance();
    }

}
