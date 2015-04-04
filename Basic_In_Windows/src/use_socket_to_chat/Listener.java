package use_socket_to_chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Listener extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ServerSocket ss;
		try {
			ss=new  ServerSocket(2501);
			while(true){
				Socket s=ss.accept();
				SocketItemer si=new SocketItemer(s);
				si.start();
				//启动后加入到所有socket管理
				Manager.getManager().add(si);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
