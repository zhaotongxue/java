package files;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Xml {

	public static void main(String[] args) throws  Exception, IOException {
		// TODO Auto-generated method stub
		//创建三个常用的东东
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document d=(Document) db.parse("res/contact.xml");
		NodeList contacts= d.getElementsByTagName("Contact");
		ArrayList<String> al=new ArrayList<String>();
		NodeList childs;
		//NodeList names=d.getElementsByTagName("Name");
		for(int i=0;i<contacts.getLength();i++){
			//获得直接隶属于contact的name标签
//			for(int j=0;j<=1;j++){
//					if(names.item(j).getParentNode().getNodeName()=="Contact"){
//						al.add(names.item(j).getTextContent());
//					}
//			}
			//获取当前contacts的所有标签
			childs=contacts.item(i).getChildNodes();
			//pl(childs.item(1).getNodeName());
			//添加名字
			int nodeItem=1;
			//pl(childs.item(1).getTextContent());
			al.add(childs.item(nodeItem).getTextContent().toString());
			//pl(childs.item(nodeItem).getNodeName());
			while(childs.item(nodeItem).getNodeName()!="PhoneList"){
				//pl(nodeItem.toString());
			//	pl(nodeItem);
				nodeItem++;
			}
			NodeList n=childs.item(nodeItem).getChildNodes();
			for(int j=1;j<n.getLength();j++){
				if(n.item(j).getTextContent()!=""){
				al.add(n.item(j).getTextContent());
				}
			}
		}
		for(String s:al){
			pl(s);
		}
//			for(int j=0;j<childs.getLength();j++){
//				if(childs.item(j).getNodeName()=="PhoneList"){
//				}
//			}
//		}
		//下面这句正确
		//pl(contacts.item(0).getChildNodes().item(1).getTextContent().toString());
		
		/*
		//Element e=d.get
		Element rootElement=d.getDocumentElement();
//		pl(rootElement.toString());
		//pl(rootElement.getNodeValue());
		ArrayList<String> al=new ArrayList<String>();
		NodeList contacts=d.getElementsByTagName("Contact");
		for(int i=0;i<contacts.getLength();i++){
			NodeList nl=contacts.item(i).getChildNodes();
			for(int j=0;j<nl.getLength();j++){
				//pl(nl.item(j).getLocalName().toString());
				pl(nl.item(j).getNodeValue().toString());
				//pl(nl.item(j).getNextSibling().getNodeValue().toString());
			}
			int nodeItem=0;
			//Node node=nl.item(nodeItem);
			//pl(nl.item(nodeItem).getNodeName());
			while(nl.item(nodeItem).getNodeName() !="PhoneList"){
				++nodeItem;
			}
			Node node=nl.item(nodeItem);
			for(int j=0;j<node.getChildNodes().getLength();j++){
				al.add("电话:"+node.getChildNodes().item(j).getTextContent());
			}
		}
			for(String s:al){
				pl(s);
			}
//			for(int j=0;j<nl.getLength();j++){
//				
//			}
//		NodeList names=	d.getElementsByTagName("Name");
//		NodeList phoneNumbers=d.getElementsByTagName("PhoneList");
//		for(int i=0;i<names.getLength();i++){
//			if(names.item(i).getParentNode().getNodeName()=="Contact"){
//				al.add(names.item(i).getTextContent()+"\n");
//				names.item(i).get
//			}
//		}
//		for(String item:al){
//			pl(item);
//		}
 * 
 */
	}
	public static void pl(String output){
		System.out.println(output);
	}
	public static void pl(int i){
		System.out.println(i);
	}
}
