import java.io.*;
import java.util.*;
public class seriable  implements  Serializable{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String ai="abcdef";
			String ti="    I am a good boy...    ";
			String b=ai.toUpperCase();
			System.out.println("a is:"+ai);
			System.out.println("b is:"+b);
			System.out.println("ti is:+"+ti.trim());
//			tryCl cq=new tryCl(100);
//		tryCl[] ak=new tryCl[100];
//		for(int i=0;i<100;i++){
//			ak[i]=new tryCl(i);
//			//System.out.print(ak[i].aa);
//		}
//		System.out.println("创建完成：");
//		ByteArrayOutputStream a=new ByteArrayOutputStream();
//		ObjectOutputStream o=new ObjectOutputStream(a);
//		for(int i=0;i<100;i++){
//			o.writeObject(ak[i]);
//		}
//		System.out.println("虚礼诶华成功！");
//		ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(a.toByteArray()));
//		for(int i=0;i<ak.length;i++){
//			ak[i]=(tryCl)in.readObject();
//		}
//		System.out.println("成功！");
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{}
	}

}
class tryCl{
	int aa;
	tryCl(int a){
		aa=a;
	}
	int say(int k){
		System.out.println("来玩");
		return k++;
	}
}
