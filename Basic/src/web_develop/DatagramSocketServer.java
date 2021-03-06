package web_develop;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class DatagramSocketServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket(8888);
		//接收信息 
		byte[] buf=new byte[330];
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		System.out.println("buf是"+Arrays.toString(buf));
		byte[] bData=dp.getData();
		System.out.println("getData:"+Arrays.toString(bData));
		//响应数据
		DatagramPacket responseDP=new DatagramPacket("响应报文体".getBytes(),"响应报文体".getBytes().length,ds.getInetAddress(),ds.getPort());
		ds.send(responseDP);
		ds.close();
	}

}
