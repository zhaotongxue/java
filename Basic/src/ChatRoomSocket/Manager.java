package ChatRoomSocket;
import java.io.IOException;
import java.util.Vector;

public class Manager {
	//我定义为私有了，看你怎么破~
	private Manager(){}
	//全靠你管理了
	final static Manager manager=new Manager();
	//别人要你
	public static Manager getManager(){
		return manager;
	}
	//你的小朋友们
	Vector<DoThinger> v=new Vector<DoThinger>();
	//又来了一个
	public  void add(DoThinger doThinger){
		v.add(doThinger);
	}
//	public void remove(DoThinger d){
//		for(int i=0;i<v.size();i++){
//			if(v.get(i).equals(d)){
//				v.remove(i);
//			}
//		}
//	}
	public int count(){
		return v.size();
	}
	//叽叽喳喳，自己却听不见
	public void publish(DoThinger doThinger,String s) throws IOException{
		int times=v.size();
		for(int i=0;i<times;i++){
			//if(v.get(i).equals(doThinger)==false){
//			if(v.get(i).equals(doThinger)==false){
				v.get(i).OutPutThings(s+"\n"); }
		System.out.println(s+"\n");
//			if(times>v.size()&&i>0){
//				i--;
//				}
//			}

		
			//}
//			if(!v.get(i).equals(doThinger)&&!v.get(i).equals(null)){
//				v.get(i).OutPutThings(s+"\n");
//			}
//			else if(!v.get(i).equals(doThinger)){
//				//this.remove(v.get(i));
//				v.remove(i);
//			}
	}
}
