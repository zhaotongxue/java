package toKnow;
import java.util.*;
public class DefaultValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Values v=new Values();
		System.out.println("现在打印char：");
		v.charDefalut();
		v.e();
	}

}
class Values{
	int i;
	long l;
	char c;
	double d;
	float f;
	public Values(){
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("char :"+c);
		System.out.println("double:"+d);
		System.out.println("float:"+f);
	}
	void charDefalut(){
		for(int b=0;b<=200;b++){
			System.out.println(b+":"+(char)b);
		}
	}
	void e(){
		double q= 9e-2;
		System.out.println((int)q);
		System.out.println((double)q);
	}
}
