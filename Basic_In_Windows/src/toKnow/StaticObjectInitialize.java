package toKnow;
import java.util.*;
public class StaticObjectInitialize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class2 c=new class2();
		class3 c3=new class3();
		class3 c3_1=new class3();
	}
	static class5 c5=new class5();
}
class initializeObject{
	public initializeObject(){
		System.out.println("initializeObject is working");
	}
	void Say(String str){
		System.out.println(str);
	}
}
class class2{
	static initializeObject i=new initializeObject();
	public class2(){
		System.out.println("class2初始化");
		i.Say("静态对象方法调用 ");
	}
}
class class3{
	public class3(){
		System.out.println("class3初始化。");
		o.Say("class3初始化完成后地方法:ooooooooooo");
		System.out.println("class3:"+this);
		System.out.println("o:"+o);
	}
static	initializeObject o=new  initializeObject();
}
class class4{
	public class4(){
		System.out.println("class4初始化。。。");
	}
}
class class5{
	class4 c4=new class4();
	public class5(){
		System.out.println("class5初始化。。。");
	}
}