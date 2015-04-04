package quesions_answers;
import java.util.*;
public class cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner icd=new Scanner(System.in);
		//System.out.println(icd.nextLine());
//			users startuser=new users();
//			startuser.printCheese(startuser.myCheese);
	/*	cheese m=new cheese();
		System.out.println(m.getClass());
		System.exit(0);
		*/	
			users myUser=new users();
			myUser.printCheese(myUser.myCheese);
			Scanner ins;
			System.out.println("请输入座标:");
			ins=new Scanner(System.in);
			String myPoint;
			while((myPoint=ins.nextLine())!=null){
			String points=myPoint;
			String XY[]=points.split(",");
			int x=Integer.parseInt(XY[0]);
			int y=Integer.parseInt(XY[1]);
			//改变数组然后打印
			myUser.myCheese[x][y]='●';
			myUser.printCheese(myUser.myCheese);
			System.out.println("请输入座标:");
			}
	}

}
	class users{
		protected char myCheese[][]=new char[15][15];
		//初始化所有位置
		public users(){
			for(int i=0;i<myCheese.length;i++){
				for(int j=0;j<myCheese[i].length;j++){
					myCheese[i][j]='╬';
				}
			}
		}
		//打印所有位置
		public void printCheese(char abc[][]){
			for(int i=0;i<abc.length;i++){
				for(int j=0;j<abc[i].length;j++){
					System.out.print(abc[i][j]);
				}
				System.out.println("");
			}
		}
	}
