package toKnow;

public class EqualsAndEqualitySign {
public static void main(String[] args) {
	/*
	 * copy form web
	String str1 = new String("str");
    String str2 = new String("str");
    System.out.println("==比较 ："+ (str1 == str2));
    System.out.println("equal比较："+ str1.equals(str2));
    String str3 = "str1";
    String str4 = "str1";
    System.out.println("==比较 ："+ (str3 == str4));
    System.out.println("equal比较："+ str3.equals(str4));
	 */
	/*
	int a=3;
	int b=3;
	System.out.println(a);
	System.out.println(b);
	System.out.println(a==b);
	b=4;
	System.out.println(a);
	System.out.println(b);
	System.out.println(a==b);
	*/
	String str1="abc";
	String str2="abc";
	String str3=new String("abc");
	String str4=new String("abc");
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
	System.out.println(str3==str4);
	System.out.println(str3.equals(str4));
	
	testClass1 tc1=new testClass1(10);
	testClass1 tc2=new testClass1(10);
	System.out.println(tc1==tc2);
	System.out.println(tc1.equals(tc2));
	tc1.i=9;
	System.out.println(tc1==tc2);
	System.out.println(tc1.equals(tc2));
	
}
static class testClass1{
	int i;
	public testClass1(int b){
		i=b;
	}
}
}
