import java.util.*;
public class 集合 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Collection myC=new ArrayList();
		for(int i=0;i<10;i++){
			myC.add(i);
		}
		Iterator it=myC.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
		q iq=new q();
		q.abc();
	}

}
class q{
	public static String abc(){
		System.out.println("静态方法");
		return null;
	}
	public String ac(){
		System.out.println("实例方法");
		return null;
	}
	public q(){
		System.out.println("构造方法");
	}
}