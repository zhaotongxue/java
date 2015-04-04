package toKnow;

import java.util.*;
public class finalize {
	public void ToOverride(){
		System.out.println("我是finzelize's method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalizeChild c=new finalizeChild ();
		finalize f=new finalize();
		f.ToOverride();
		finalizeChild fC=new finalizeChild();
		fC.ToOverride();
//!		finalizeChild f2fC=new finalize();
	//!	f2fC.ToOverride();
		finalize f2fc=new finalizeChild();
		f2fc.ToOverride();
	}
	
}
class finalizeChild extends finalize{
	@Override
	public void ToOverride() {
		// TODO Auto-generated method stub
	//	super.ToOverride();
		System.out.println("I'm finalize's method");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalizeed;");
	}
}
