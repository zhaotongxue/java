package chatRoom_follow_video;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ChatSocket extends Thread{
	Socket socket;
	public ChatSocket(Socket socket) {
		super();
		// TODO Auto-generated constructor stub
		this.socket=socket;
	}
	public void outPut(String s){
				try {
					socket.getOutputStream().write(s.getBytes("gbk"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
			//BufferedWriter bw;
			while(true){
//	bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//	bw.write("nice to meet you!");
//				this.outPut("你好");
//				Thread.sleep(1000);
				try {
					BufferedReader br=new BufferedReader(
							new InputStreamReader(
									socket.getInputStream(),"gbk"));
					//socket.getInputStream().read();
					String line;
					while((line=br.readLine().trim())!=null){
						ChatManager.getChatManger().publish(this, line);
					}
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
