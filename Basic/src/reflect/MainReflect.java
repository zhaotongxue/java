package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author zhaotongxue
 * @version 1.1
 *
 */
public class MainReflect {
	public static void main(String[] args) {
		
	}
	public static void printConstrator(Object object ){
		Class c=object.getClass();
		Constructor[] a=c.getDeclaredConstructors();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i].getName());
		}
		Method[] m=c.getMethods();
			System.out.println("方法：");
		for(Method mi : m){
			System.out.println(mi.getName());
		}
	}
}
