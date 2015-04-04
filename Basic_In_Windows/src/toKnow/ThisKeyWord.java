package toKnow;
import java.util.*;
public class ThisKeyWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		System.out.println(t.increment().increment().increment());
		System.out.println(t.increment().increment().increment().i);
	}
}
class Test{
	int i=0;
	Test increment (){
		i++ ;
		return this;
	}
}
