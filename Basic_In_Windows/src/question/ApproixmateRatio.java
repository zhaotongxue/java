package question;

import java.text.MessageFormat;

public class ApproixmateRatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=21,num2=7,limit=5;
//		int cha=abs(num1-num2);
		while(!(num1<=limit&&num2<=limit)){
			//不能用math。。。。。
//			for(int i=limit;i>1;i--){
//				
//			}
			num2=num2/(num1/limit)+(num2%limit>=num2/limit/2 ? 1:0);
			num1=num1/(num1/limit)+(num1%limit>=num1/limit/2 ? 1:0);
		}
		System.out.println(MessageFormat.format("{0}:{1}", num1,num2));
		
	}
//	protected static int abs(int num){
//		if(num<0){
//			return -num;
//		}
//		else return num;
//	}

}
