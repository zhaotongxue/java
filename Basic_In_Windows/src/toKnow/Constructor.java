package toKnow;
import java.util.*;
public class Constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		ConstructorClass c=new ConstructorClass();
		c.abc();
	}

}
class ConstructorClass{
	int i=0;
	String s="Start";
	public ConstructorClass(){
		this(1,"Started");
		System.out.println("OK~It runs!");
	}
		public ConstructorClass(int a){
			i=a;
			System.out.println("int");
		}
		public ConstructorClass(String str){
			s=str;
			System.out.println("str");
		}
		public ConstructorClass(int a,String str){
			this(a);
			System.out.println("int&str");
		}
		ConstructorClass abc(){
			//! this(a);
			return this;
		}
	 
}
