package filesOperate;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlOperate {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		try {
			db=dbf.newDocumentBuilder();
			Document d=db.parse("res/contact.xml");
			NodeList MyNodeList=d.getElementsByTagName("Contact");
			ArrayList<String> al=new ArrayList<String>();
			for(int i=0;i<MyNodeList.getLength();i++){
				NodeList contactNodeList=MyNodeList.item(i).getChildNodes();
				al.add(contactNodeList.item(1).getTextContent());
				int num=1;
				//System.out.println(contactNodeList.item(1).getNodeName());
				while(contactNodeList.item(num).getNodeName()!="PhoneList"){
					++num;
				}
				NodeList phones=contactNodeList.item(num).getChildNodes();
				for(int phonesNum=1;phonesNum<phones.getLength();phonesNum++){
					al.add(phones.item(phonesNum).getTextContent());
				}
			}
			for(String s:al){
				System.out.println(s);
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		/*
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		db = dbf.newDocumentBuilder();
		Document d=db.parse("res/contact.xml");
		System.out.println("a");
		//NodeList al=d.getElementsByTagName("Contact");
		NodeList e=d.getElementsByTagName("Contact");
		//NodeList n=e.getElementsByTagName("Name");
		//NodeList n=e.getChildNodes();
		ArrayList<String> al=new ArrayList<String>();
		//遍历所有Contact
		for(int i=0;i<e.getLength();i++){
			//获得每个Contact下的Name
			NodeList nameList=e.getElementsByTagName("Name");
			//如果Name读父节点是Contact，就添加
			for(int j=0;j<nameList.getLength();j++){
				if(nameList.item(j).getParentNode().getNodeName()=="Contact"){
					al.add(nameList.item(j).getTextContent());
				}
			}
			
//				if(n.item(i).getParentNode().getNodeName()=="Contact"){
//					al.add(n.item(i).getTextContent());
//					}
				int num=1;
				while(n.item(num).getNodeName()!="PhoneList"){
					num++;
				}
				NodeList phoneNL=n.item(num).getChildNodes();
				for(int j=1;j<phoneNL.getLength();j++){
					al.add(phoneNL.item(j).getTextContent());
				}
			}
		for(String s:al){
			System.out.println(s);
		}
	}
	
}
*/
