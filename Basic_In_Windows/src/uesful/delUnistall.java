package uesful;
import java.io.*;
public class delUnistall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		del("C:\\Users\\zhao\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs");
	}
	private static void del(String path){
		File f=new File(path);
		if(f.isDirectory()){
			for(File childFile:f.listFiles()){
			del(childFile.getPath());
			}
		}
		else{
			if(f.getName().contains("卸载")||f.getName().contains("卸載")){
				System.out.println(f.getPath()+"\t"+f.delete());
			}
		}
	}

}
