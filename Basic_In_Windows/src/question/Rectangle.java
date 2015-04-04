package question;

import java.util.Scanner;

public class Rectangle {
	static	int start =1;
	static int SIZE=4;
	static	int STARTX=0,STARTY=0;
	static int[][] arr=new int[SIZE][SIZE];
	int times=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//			Scanner sc=new Scanner(System.in);
		//			System.out.println("输个数：");
		//			int size=sc.nextInt();
		//				for(int c=0;c<size;c++,start++){
		//					if(arr[i][c]==0){
		//						arr[i][c]=start;
		//					}
		//				}
		MyIterator(4, 0, 0);
		for(int[] ar : arr){
			for(int a : ar){
				System.out.print(a+"\t");
			}
			System.out.println();
		}
	}
	static int leftx,rightx,topy,bottomy;
	public static void TheSecondMethod(int size){
		leftx=size-2;
		rightx=size-2;
	}
	public static void MyIterator(int mySize,int x,int y){
		for(int i=0;i<mySize*mySize;i++,start++){
			//相对来说对上面一行
			if(x<mySize){
				arr[y][y]=start;
				x++;
			}
			// * * * *之后的
			else if(x==mySize&&y<mySize){
				y++;
				arr[y-1][x-1]=start;
			}
			//y
			if(y==mySize){
				x--;
				arr[y-1][x]=start;
			}
			if(x==0){
				if(arr[y][x]==0){
					y--;
					arr[y][x]=start;
				}
				else{
					boolean b=false;
					for(int x1=0;x1<SIZE;x1++){
						for(int y1=0;y1<SIZE;y1++){
							if(arr[x1][y1]==0){
								b=true;
								break;
							}
						}
					}
					if(b){
						//递归一下
						MyIterator(mySize-2, x+1, y+1);
					}
				}
			}
			//					//times=size*(i-size);
			//					if(times<size*size){
			//						arr[i-size][size-1]=i;
			//					}
			//					else{
			//						if()
			//						
			//					}
		}
	}
}