package reflect;

public class NoClassCompile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wo wo=new wo();
			try {
				Class c=Class.forName("Wo");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//c.newInstance();
	}

}
