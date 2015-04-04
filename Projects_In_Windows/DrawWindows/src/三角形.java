import java.math.*;
public class 三角形 {
			private double zhouChang;
			private double mianJi; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		三角形 Triangle=new 三角形();
		System.out.println("周长："+ Triangle.ZhouChang(3, 4, 5));
		System.out.println("面积："+ Triangle.MianJi(3,4,5));
	}
	public double ZhouChang(double aa,double bb,double cc){
		if(aa+bb>cc&&bb+cc>aa&&aa+cc>bb&&aa-bb<cc&&aa-cc<bb&&bb-cc<aa){
			zhouChang=aa+bb+cc;
		}
		return zhouChang;
	}
	public double MianJi(double aa,double bb,double cc){
		if(aa+bb>cc&&bb+cc>aa&&aa+cc>bb&&aa-bb<cc&&aa-cc<bb&&bb-cc<aa){
			double p=(aa+bb+cc)/2;
			mianJi=Math.sqrt(p*(p-aa)*(p-bb)*(p-cc));
		}
		return mianJi;
	}

}
