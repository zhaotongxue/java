package web_Get_And_Set;
import java.io.IOException;
import java.net.ServerSocket;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Socker {
public static void main(String[] args) throws IOException{
	ServerSocket ss=new ServerSocket(333);
	ss.accept();
	JOptionPane.showMessageDialog(null	, "访问端口");
}
}
