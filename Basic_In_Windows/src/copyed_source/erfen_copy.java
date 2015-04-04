package copyed_source;

import java.text.MessageFormat;

public class erfen_copy {
	static int[] arr={-1,6,9,6,-5,-6,-6,-5,-56,-9,-62,-345,65,-26,3,56,66,95,56,5,56,5,6,565,6,265};
	public static void main(String[] args){
		for(int w : arr){
			System.out.print(w+",");
		}
		System.out.println("接下来排序");
		if(arr[0]>arr[1]){
			exchange(0,1);
		}
		for(int i=2;i<arr.length;i++){
			int left=0;
			int right=i;
			int mid=(left+right)/2;
			do{
				System.out.println(MessageFormat.format("left:{0},right:{1},mid{2}",left,right,mid));
				if(arr[i]>arr[mid]){
					left=mid+1;
				}
				else {
					right=mid-1;
				}
				mid=(left+right)/2;
			}
			while(left<=right);//(!(arr[mid-1]<=arr[mid]&&arr[mid]<=arr[mid+1]));//(right!=mid&&left!=mid);
			for(int q=i;q>left;q--){
				exchange(q,q-1);
			}
		}
		for(int w : arr){
			System.out.print(w+",");
		}
	}
	public static void exchange(int a,int b){
		int c=arr[a];
		arr[a]=arr[b];
		arr[b]=c;
	}
}