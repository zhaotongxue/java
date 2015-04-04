package ChatRoomSocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Listener  extends Thread{
	ServerSocket serverSocket;
//	int id=0;
	int count=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			serverSocket=new ServerSocket(9999);
			while(true){
			Socket socket=serverSocket.accept();
			count++;
			DoThinger ido= new DoThinger(socket);
			System.out.println("已经有客户端连接，当前连接数："+Manager.getManager().count());
		//	if(){
			Manager.getManager().add(ido);
			ido.start();
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			String s=null;
			while((s=br.readLine())!=null){
				System.out.println(s);
				if(s=="connecting"){
					socket.getOutputStream().write("connected".getBytes());
					break;
				}
			}
			//socket.getOutputStream().write("欢迎来到聊天室".getBytes("UTF-8"));
			PrintWriter pw=new PrintWriter(socket.getOutputStream());
			pw.write("欢迎");
			pw.flush();
	//		}

			
		//	id++;
			//socket.getOutputStream().write("欢迎来到聊天室".getBytes("UTF-8"));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
