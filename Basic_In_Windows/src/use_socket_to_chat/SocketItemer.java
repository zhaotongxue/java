package use_socket_to_chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 对socket进行处理
 */
public class SocketItemer extends Thread {
	Socket s;
	public SocketItemer(Socket s){
		super();
		this.s=s;
	}
	//相别的客户端发送信息
	public void output(String str) throws IOException{
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream(),"GBK"));
		//bw.write(str);
		s.getOutputStream().write(str.getBytes("GBK"));
		//s.getOutputStream().close();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			super.run();
			//读取当前的Socket信息
			BufferedReader br;
			try {
				//md
				//byte[] b;
				br = new BufferedReader(new InputStreamReader(s.getInputStream(),"GBK"));
				//char[] c=new char[]();
				//s.getInputStream().read(new byte[]);
//				StringBuilder sb=new StringBuilder();
//				for(int i=0;i<b.length;i++){
//					sb.append((char)b[i]);
//				}
				String line;
				while((line=br.readLine())!=null){
					Manager.getManager().publish(this,line);
				}
				//String lineStr=sb.toString();
				//br.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
