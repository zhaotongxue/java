package web_develop;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class DatagramSocketClient {
public static void main(String[] args){
	try {
		byte[] buf="向服务器发送的请求已经发送了~".getBytes();
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		InetAddress ia=InetAddress.getByName("localhost");
		DatagramSocket ds=new DatagramSocket(8888,ia);
		ds.send(dp);
		byte[] receivedMess=new byte[100];
		dp=new DatagramPacket(receivedMess, receivedMess.length);
		ds.receive(dp);
		System.out.println("receivedMess:"+Arrays.toString(receivedMess));
		byte[] bData=dp.getData();
		System.out.println("getData:"+Arrays.toString(bData));
		ds.close();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
