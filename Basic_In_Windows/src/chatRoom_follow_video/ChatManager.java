package chatRoom_follow_video;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

import javax.swing.JOptionPane;

public class ChatManager {
	private ChatManager(){
		
	}
	private static ChatManager manager=new ChatManager();
	public static final ChatManager getChatManger(){
		return manager;
	}
	Vector<ChatSocket> v=new Vector<ChatSocket>();
	public void add(ChatSocket cs){
		v.add(cs);
	}
	public void publish(ChatSocket cs,String mess) throws UnsupportedEncodingException, IOException{
		for(int i=0;i<v.size();i++){
		if(!cs.equals(v.get(i))){
			v.get(i).outPut(mess);
		}
		}
	}
}