import java.util.*;
import java.io.*;
public class IOClass {
	public static void main(String args[]) throws IOException {
		File iFile=new File("/home/zhaotongxue/文档/new.txt");
		BufferedReader ire=new BufferedReader(new FileReader(iFile));
		Vector myVec=new Vector();
		while(ire.readLine()!=null){
			myVec.add(ire.readLine());
			System.out.println(ire.readLine());
		}
		System.out.println("新的—————————————————————————————————— ");
		System.out.println(myVec.toString());
	}
}
