package practice;
public class Order {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//orderOne
		System.out.println("OrderOne:");
		print(new orderOne().orderOne());
		System.out.println("OrderTwo:");
		print(new orderTwo().Order());
	}
	public static void print(int[] arr){
		for (int i : arr) {
			System.out.print(i+",\t");
		}
			System.out.print("\n");
	}
}
class orderSuper{
	private int[] arr={-1,-1,45,64,3,25,4,1,2,6,48,1,546,45,1,0,26,36,1,11,22,33,45,-11,-51,-60,-1,6};
	int[] getArr(){
		return arr;
	}
}
class orderOne extends orderSuper{
	public int[] orderOne(){
		int[] arr=super.getArr();
		Order.print(arr);
		for(int i=0;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j-1]>arr[j]){
					int e=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=e;
				}
			}
		}
		return arr;
	}
}

class orderTwo extends orderSuper{
	public int[] Order(){
		int[] arr=super.getArr();
		int[] copyArr=new int[arr.length];
		int biger=0,smaller=0,index=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i] > arr[j] ){ 
					index++ ;
				}
				}
				copyArr[index]=arr[i];
				index=0;
			}
		for(int i=0;i<arr.length-1;i++){
			if(copyArr[i]>copyArr[i+1]){
				copyArr[i+1]=copyArr[i];
			}
		}
			return copyArr;
	}
}
class orderThree{
	
}