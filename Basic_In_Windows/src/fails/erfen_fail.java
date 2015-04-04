package fails;
public class erfen_fail{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,6,2,9,-6,9,12,36,99,55,-99,-621,-35,-61,-56,-56,859,95};
		if(a[0]>a[1]){
			int c=a[0];
			a[0]=a[1];
			a[1]=c;
		}
		for(int i=2;i<a.length;i++){
			int left=0;
			int right=i;
			int mid=(left+right)/2;
			do{
				System.out.print("mid:"+mid+",");
				System.out.print("left:"+left+",");
				System.out.print("right:"+right+",");
				System.out.println();
				if(a[i]>=a[mid]){
					left=mid;
					mid=(left+right)/2;
				}
				else if(a[i]<=a[mid]){
					right=mid;
					mid=(left+right)/2;
				}
			}
			while(Math.abs(right-left)!=1);
			int c=a[mid];
			a[mid]=a[i];
			a[i]=c;
		}
		for(int c : a){
			System.out.print(c+",");
		}
	}
}
