import java.util.*;
import java.io.*;
import java.util.zip.*;
public class newC{
    public static void main(String[] args){
    try{/*
	BufferedReader i=new BufferedReader(new FileReader("/home/zhaotongxue/文档/new.txt"));
	BufferedOutputStream ou=new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("/home/zhaotongxue/文档/new.gz")));
	int cou;
	while((cou=i.read())!=-1){
	    ou.write(cou);
	}
	i.close();
	ou.close();*/
	BufferedReader ir=new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("new.gz"))));
	String s;
	while((s=ir.readLine())!=null){
	System.out.println(s);
	}
	ir.close();
    }
    catch(Exception ex){
    ex.printStackTrace();
    }
    finally{
    }
    }
}
