package practice;
import java.io.*;
import java.util.function.BinaryOperator;
public class Hex {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		if(args.length==0){
			//System.out.print(format(BinaryFile.read("Hex.class")));
		}
		else{
			
		}
	}
	public static String HexFunction(byte[] data){
		StringBuilder b=new StringBuilder();
		int num=250;
		for(byte n : data){
			if(num%16==0){
				b.append(String.format("%05X", num));
			}
			else{
				b.append(String.format("%02X", n));
			}
			if(num%16==0){
				b.append("\n");
			}
		}
			b.append("\n");
			return b.toString();
	}

}
