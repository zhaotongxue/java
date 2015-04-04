package toKnow;
import java.util.*;
import java.math.*;
public class OperatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int BasicNum=2;
		/*prefix ++ is greater than suffix++ and +
		System.out.println(3*BasicNum+++BasicNum);
		 * 
		 */
		/*
		System.out.println((3*BasicNum)+ ++BasicNum);
		*/
		BasicNum=5;
		//21
		/*
		 * prefix ++ is not return the value to BasicNum,It's just a value;
		 */
		System.out.println(3*BasicNum+++BasicNum);
		BasicNum=5;
		//24
		System.out.println(3*BasicNum+ ++BasicNum);
		System.out.println(BasicNum);
		System.out.println((3*BasicNum)+--BasicNum);
		System.out.println(BasicNum);
	}

}
/* @output:
 *9
 *3
 *11
 *2
 */