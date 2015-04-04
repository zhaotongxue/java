package question;

public class HowMuchSumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumCount=0;
		int[] arr={4,3,2,1};
		for(int num1=0;num1<arr.length;num1++){
			for(int num1_1=num1+1;num1_1<arr.length;num1_1++){
				for(int num2=0;num2<arr.length;num2++){
					for(int num2_2=num2+1;num2_2<arr.length;num2_2++){
						if(num1!=num1_1&&num1!=num2&&num1!=num2_2&&num1_1!=num2&&num1_1!=num2_2&&num2!=num2_2){
							if(arr[num1]+arr[num1_1]==arr[num2]+arr[num2_2]){
								sumCount++;
							}
						}
					}
				}
	}
}
		System.out.println(sumCount);
	}

}
