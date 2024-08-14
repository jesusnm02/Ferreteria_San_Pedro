package Connection;

import java.util.Hashtable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GetXML {
    public static Hashtable getDate(String path) {
        Hashtable data = new Hashtable();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(path);
            document.getDocumentElement().normalize();
            Element root = document.getDocumentElement();
            System.out.println("Root Element: " + root.getNodeName());
            
            //leo las etiquetas jdbc
            NodeList jdbList = document.getElementsByTagName("jbdc");
            
            for(int i = 0; i < jdbList.getLength(); i++) {
                Node jdbcNode = jdbList.item(i);
                
                if(jdbcNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element jdbcElement =(Element) jdbcNode;
                    String usr = jdbcElement.getElementsByTagName("usr").item(0).getTextContent();
                    String pwd = jdbcElement.getElementsByTagName("pwd").item(0).getTextContent();
                    String url = jdbcElement.getElementsByTagName("url").item(0).getTextContent();
                    String driver = jdbcElement.getElementsByTagName("driver").item(0).getTextContent();
                    
                    data.put("usr", usr);
                    data.put("pwd", pwd);
                    data.put("url", url);
                    data.put("driver", driver);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return data;
    }
}
