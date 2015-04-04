package practice;
import java.util.*;
public class 违例 {
public static void main(String[] args){
		try{
	throw new Exception("f()的违例");
}catch(Exception ex){
	System.out.println(ex.getMessage());
	//打印出错的位置私以为应该是8
	//ex.printStackTrace();
	//打印throw的位置私以为应该是14
	ex.fillInStackTrace();
}
		f();
}
public static void f(){
	try{
	throw new Exception("f()的违例");
}catch(Exception ex){
	System.out.println(ex.getMessage());
	//打印出错的位置私以为应该是8
	//ex.printStackTrace();
	//打印throw的位置私以为应该是14
	ex.fillInStackTrace();
}
}
}
