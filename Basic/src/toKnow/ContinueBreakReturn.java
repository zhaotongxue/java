package toKnow;

public class ContinueBreakReturn {
public static void main(String[] args) {
	ContinueClass cc=new ContinueClass();
	BreakClass bc=new BreakClass();
	ReturnClass rc=new ReturnClass();
	System.out.println("_____________________________________________________");
	cc.multiFor();
	bc.multiFor();
	rc.multiFor();
//	System.out.println("break;");
//!	break;
//	System.out.println("continue;");
//!	continue;
	System.out.println("return;");
	return;
//!	System.out.println("return;") 	;
}
}
class ContinueClass{
	public ContinueClass() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<5;i++){
			if(i==2){
				continue;
				}
			System.out.println("continue:"+i);
		}
	}
	void multiFor(){
		for(int j=0;j<5;j++){
		for(int i=0;i<5;i++){
			if(i==2&&j==2){
				continue;
				}
			System.out.println("continue:"+i);
		}
		System.out.println("外圈循环continue:"+j);
	}
	}
}
class BreakClass{
	public BreakClass() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<5;i++){
			if(i==2){
				break;
				}
			System.out.println("break:"+i);
		}
	}
	void multiFor(){
		for(int j=0;j<5;j++){
		for(int i=0;i<5;i++){
			if(i==2&&j==2){
				break;
				}
			System.out.println("break:"+i);
		}
		System.out.println("外圈循环break："+j);
	}
	}
}
class ReturnClass{
	public ReturnClass() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<5;i++){
			if(i==2){
				return;
				}
			System.out.println("Return:"+i);
		}
	}
	void multiFor(){
		for(int j=0;j<5;j++){
		for(int i=0;i<5;i++){
			if(i==2&&j==2){
				return;
				}
			System.out.println("Return:"+i);
		}
		System.out.println("外圈循环return"+j);
	}
	}
}
