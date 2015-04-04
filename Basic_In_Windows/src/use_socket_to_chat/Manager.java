package use_socket_to_chat;

import java.io.IOException;
import java.net.Socket;
import java.util.Vector;

public class Manager {
	Socket s;
	private Manager(){}
	private	static  final Manager manager=new Manager();
	public static Manager getManager(){
		return manager;
	}
	Vector<SocketItemer> v=new Vector<SocketItemer>();
	public void add(SocketItemer s){
		v.add(s);
	}
	public void publish(SocketItemer socketItemer,String mess) throws IOException{
		for(int i=0;i<v.size();i++){
			if(v.get(i).equals(socketItemer)==false){
				v.get(i).output(mess);
			}
		}
		System.out.println(mess);
	}
}
