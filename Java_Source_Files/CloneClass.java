
import java.lang.*;
import java.util.Vector;
public class CloneClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
bcd ibcd=new bcd(100);
System.out.println("ibcd.c="+ibcd.c);
ibcd.Increment();
System.out.println("ibcd.c="+ibcd.c);
bcd q=(bcd)ibcd.Clone();
System.out.println("q.c="+q.c);
q.Increment();
System.out.println("q.c="+q.c);
System.out.println("ibcd.c="+ibcd.c);
//Vector
Vector myVec=new Vector();
for(int i=0;i<10;i++){
	myVec.addElement(new bcd(i));
}
System.out.println("未复制之前的数组是："+myVec);
Vector ClonedVec=(Vector)myVec.clone();
System.out.println("复制之后未改变之前："+ClonedVec);
for(int a=0;a<ClonedVec.size();a++){
	((bcd)ClonedVec.elementAt(a)).Increment();
}
System.out.println("复制之后改变的克隆的Vec："+ClonedVec);
System.out.println("复制之后改变的未克隆的Vec："+myVec);
for(int a=0;a<ClonedVec.size();a++){
	ClonedVec.setElementAt(((bcd)ClonedVec.elementAt(a)).Clone(),a);
}
System.out.println("复制之后改变的克隆的Vec："+ClonedVec);
System.out.println("复制之后改变的未克隆的Vec："+myVec);
	}
}
class abc1 implements Cloneable{
	int c;
	 abc1(int a){
		c=a;
	}
	int Increment(){
		return	c++;
	}
}
class abc{
	int c;
	 abc(int a){
		c=a;
	}
	int Increment(){
return 		c++;
	}
}
class bcd implements Cloneable{
	int c;
	bcd(int a){
		c=a;
	}
	int Increment(){
		return c++;
	}
	public Object Clone(){
		Object Obj=null;
		try{
			Obj=super.clone();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		finally{
			return Obj;
		}
	}
}