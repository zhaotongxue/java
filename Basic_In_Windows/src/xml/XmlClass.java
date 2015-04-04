package xml;
import general.p;

import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
public class XmlClass {
	public static void main(String[] args) throws ParserConfigurationException,  IOException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		//DocumentBuilder db=dbf.newDocumentBuilder();
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document d;
		try {
			d = (Document) db.parse("res/contact.xml");
			Document rootElement=(Document) d.getDefaultRootElement();
			p.pl(rootElement.toString());
			Element e=(Element) d.getDefaultRootElement();
			p.pl(e.toString());
		} catch (SAXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
