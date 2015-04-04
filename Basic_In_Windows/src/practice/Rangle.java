package practice;
import java.util.*;
//import com.sun.glass.ui.Application;
public class Rangle {
	int num=1,ber,startLeft,startRight,startTop,startBottom;
	int staticX=0,staticY=0;
	int[][] arr;
	public static void main(String[] args) {
		Rangle r=new Rangle();
		r.printAll();
	}
	public void printAll(){
		System.out.println("请输入一个大于0的整数：");
		Scanner s=new Scanner(System.in);
		int square=s.nextInt();
		System.out.println("square is:"+square);
		if(square<=0){
			System.out.println("soga....gun");
			return;
		}
			//System.out.println("nihao");
		arr=new int[square][square];
		ber=square*square;
		startLeft=0;
		startTop=0;
		startBottom=square-1;
		startRight=square-1;
		System.out.println("ber is:"+ber);
		System.out.println("square is:"+square);
		setRangle(staticX,staticY,startLeft,startRight,startTop,startBottom);
		for(int i=0;i<arr.length;i++){
			for(int c=0;c<arr[i].length;c++){
				System.out.print(arr[i][c]+"\t");
			}
			System.out.println();
		}
	}
	public void setRangle(int x,int y,int top,int bottom,int  left,int right){
//		if(num==ber){
//			arr[y][x]=num;
//			return;
//		}
		while(num<=ber){
			if(x<right&&y==top&&arr[y][x]==0){
				arr[y][x]=num;
				num++;
				x++;
			}
			else{
				if(y<bottom&&x==right){
					arr[y][x]=num;
					num++;
					y++;
				}
				else{
					if(y==bottom&&x>left){
					arr[y][x]=num;
					num++;
					x--;
					}
					else{
						if(x==left&&y>top&&arr[y][x]==0){
							arr[y][x]=num;
							num++;
							y--;
						}
						else{
							if(startTop<startBottom){
									staticX++;
									staticY++;
									startTop++;
									startBottom--;
									startLeft++;
									startRight--;
									if(startTop==startBottom&&startLeft==startRight){
										arr[startTop][startLeft]=num;
										num++;
									}
//									num++;
									setRangle(staticX,staticY,startTop, startBottom, startLeft,startRight);
							}
						}
					}
				}
			}
		}
	}
}