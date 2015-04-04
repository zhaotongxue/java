package practice;

public class InsertOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,45,5,6,-1,0,0,-45,-62,-36,-56,213,56,215,58,56,2,3,3,3,3,3,3,3,654,-9};
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i;j<a.length;j++){
				if(a[min]>=a[j]){
					min=j;
				}
			}
			int q=a[i];
			a[i]=a[min];
			a[min]=q;
		}
		for(int s : a){
			System.out.print(s+",");
		}
	}

}
