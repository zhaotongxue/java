package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;


public class Generic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array=new ArrayList<String>();
		array.add("456789456456465");
		System.out.println(array.size());
//		array.add(123);
		Class<? extends ArrayList> c=array.getClass();
		try {
			Method m=c.getMethod("add",Object.class);
			m.invoke(array, 123);
			System.out.println(array.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
