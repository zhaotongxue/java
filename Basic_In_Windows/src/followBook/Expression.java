package followBook;
import java.util.regex.*;
import java.util.Arrays;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	simple();
//		splitMethod("\\W+");
//		splitMethod("a\\w+");
//		splitMethod("l\\w+");
//		replaceMethod("h\\W+");
//		mail("zhaotongxue98@gmail.com");
//		mail("zhaotongxue98#gmail.com");
//		mail("zhaotongxue98@gmailcom.");
//		mail("0000000@gmail.com");
		patternAndMatch();
	}
	public static void simple(){
		//True
		System.out.println("-1234".matches("-?\\d+"));
		//True
		System.out.println("-".matches("-?"));
		//False
		System.out.println("102".matches("-?"));
		//True
		System.out.println("103".matches("\\d+"));
		//False
		System.out.println("102".matches("(-|\\+)?\\d"));
		//True
		System.out.println("102".matches("(-|\\+)?\\d+"));
	}
	public static void splitMethod(String ex){
		String a="This is a good language,apple has swift,ms has many langugae,google has go,etc.";
		System.out.println(Arrays.toString(a.split(ex)));
	}
	public static void replaceMethod(String ex){
		String a="This is a good language,apple has swift,ms has many langugae,google has go,etc.";
		System.out.println(a.replace(ex, "makes"));
	}
	public static void mail(String s){
		System.out.println(s.matches("[a-zA-Z0-9]\\w+@\\w+\\.\\w+"));
	}
	public static void patternAndMatch(){
		Matcher m=Pattern.compile("a\\w+").matcher("This is a good language,apple has swift,ms has many langugae,google has go,etc.");
		while(m.find()){
				System.out.println("group:"+m.group());
				System.out.printf("start: %d end: %d",m.start(),m.end()-1);
		}
		
	}
}
class StringOperator{
	public StringOperator(){
		String im="I'm a good boy that i love programming so much";
		Matcher m=Pattern.compile("\\w+").matcher(im);
	}
}
