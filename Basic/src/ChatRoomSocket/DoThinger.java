package ChatRoomSocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class DoThinger  extends Thread{
	Socket socket;
	//int id=0;
	public DoThinger(Socket socket) throws SocketException{
		this.socket=socket;
//		this.socket.setSoTimeout(100000);
	//	this.id=id;
	}
	public void OutPutThings(String s) throws IOException{
		//System.out.println(s);
//		PrintWriter pw=new PrintWriter(socket.getOutputStream());
//		pw.write(s);
//		pw.flush();
//		if(!socket.isConnected()){
//			Manager.getManager().remove(this);
//		}
//		else{
			socket.getOutputStream().write(s.getBytes("UTF-8"));
			
//		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			
			String s=null;
			//StringBuilder sb=new StringBuilder();
			//System.out.println("已经添加完毕，等待写出");
			//byte[] b=new byte[1024];
//			char[] chars=new char[512];
			//			br.read(chars);
			while(true){
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				while((s=br.readLine())!=null){
					//	sb.append(s);
					if(s=="connecting"){
						//Manager.getManager().publish(this,"");
						socket.getOutputStream().write("connected".getBytes());
					}
					Manager.getManager().publish(this,s);//,id);
				}
			}
			//			String mess="";
//			for(int i=0;i<chars.length;i++){
//				mess+=chars[i];
//			}

			//Manager.getManager().remove(this);
			//br.close();
			//socket.close();
			//System.out.println("有用户退出");
//			this;.OutPutThings(sb.toString());
//			Manager.getManager().publish(this, sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			Manager.getManager().remove(this);
			e.printStackTrace();
		}
	}

}
