package files;
import java.io.*;
public class CreatAndDeleleAndRename {
public static  void main(String[] args)	{
//	File folder=new File("path");
//	folder.mkdir();
//	folder=new File("path/1/2");
//	System.out.println(folder.mkdir());
//	folder.mkdirs();
//	File folder=new File("soga/1");
	//System.out.println(folder.mkdirs());
	//folder.renameTo(new File("soga"));
//	File d=new File("abc/2");
//	d.mkdir();
//	if(!folder.exists()){
//	folder.mkdir();
//	
//	}
//	System.out.println(folder.renameTo(d));
//	if(d.exists()){
//		System.out.print("中");
//		try{
//			folder.renameTo(d);
//		}
//		catch( Exception ex){
//			System.out.println(ex.getMessage());
//		}
	//System.out.print(folder.renameTo(d));
//	}
	printFiles("src",0);
}
public static void printFiles(String path,int tab){
	File f=new File(path);
	for(int q=0;q<tab;q++){
		System.out.print("|--");
	}
	if(f.exists()){
		if(f.isDirectory()){
			for(File file : f.listFiles()){
					printFiles(file.getPath(),tab++);
			}
		}
		else{
			System.out.println(f.getPath());
		}
	}
	else{
		
	}
}
}
