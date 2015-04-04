package chatRoom_follow_video;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Linstener  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ServerSocket ss;
		try {
			ss = new ServerSocket(333);
			while(true){
				Socket s=ss.accept();
				ChatSocket cs=new ChatSocket(s);
				cs.start();
				ChatManager.getChatManger().add(cs);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
