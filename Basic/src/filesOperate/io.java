package filesOperate;
import java.util.*;
import java.util.zip.ZipOutputStream;
import java.io.*;
public class io {
	public static void main(String[] args) throws IOException{
	}
	public static void zhushi(){
/*
	raf.writeBytes("zzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	raf.writeInt(1000);
	raf.close();
	OutputStream o=new FileOutputStream(iF);
	String im="赵同学哈哈哈哈哈哈哈啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊\n";
	byte[] ib=im.getBytes();
	o.write(ib);
	im="赵同学是个好孩子\n你说是不是呢？？？\n";
	ib=im.getBytes();
	o.write(ib);
	o.close();
	OutputStream out=new FileOutputStream(iF,true);
	im="我是添加的内容\n";
	ib=im.getBytes();
	out.write(ib);
	    out.close();
	InputStream in=new FileInputStream(iF);
	System.out.println(in.read());
	in.close();
    Writer str=new FileWriter(iF);
    //byte[] a=new byte[100];
    str.write("\r\n我又添加了一些内容");
    str.close();
    OutputStream os=new FileOutputStream(iF,true);
    byte[] strByte=new byte[1024];
    byte[] abc="我想另外可以\r\n".getBytes();
    //os.write(strByte);
    os.write(abc);
    Scanner scanner1=new Scanner(iF);
    InputStream in=new FileInputStream(iF);
    in.read(strByte);
    in.close();
    if(scanner1.next()!=null){
    System.out.println("读取内容是：：：："+scanner1.next());}
    System.out.println("我是strByte的内容："+new String(strByte));
    File iFile=new File(File.separator+"home"+File.separator+"zhaotongxue"+File.separator+"文档"+File.separator+"new.txt");
    //不存在我就创建
    if(!iFile.exists()){
    	iFile.createNewFile();
    	System.out.println("我创建了一个文件");
    }
    //创建文件夹对象，并打印所有的文件路径
    File idir=new File(File.separator+"home"+File.separator+"zhaotongxue"+File.separator+"文档"+File.separator);
    File[] dirList=idir.listFiles();
    System.out.println("当前目录文件：");
    for(int a=0;a<dirList.length;a++){
    	System.out.println(dirList[a]);
    }
    //但是子文件夹呢？？
    listAllFiles(idir);
    //写入操作： 
   OutputStream out=new FileOutputStream(iFile);
    String abc="赵同学\r\n哈哈，呵呵呵呵呵哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦\r\n刘蕾：\r\n放屁，你个傻逼！";
    byte[] ib=abc.getBytes();
    out.write(ib);
    out.close();
    ib="\r\n自恋狂！！！！！！！！！！！！！！！！！！！！".getBytes();
    out=new FileOutputStream(iFile,true);
    out.write(ib);
   out.close(); 
   //读取操作
    File iFile=new File(File.separator+"home"+File.separator+"zhaotongxue"+File.separator+"文档"+File.separator+"new.txt");
    InputStream in=new FileInputStream(iFile);
    System.out.println("长度是："+iFile.length());
    byte[] ibin=new byte[(int)iFile.length()];
    in.read(ibin);
    byte[] ibin=new byte[200];
    int count=0;
    int value=0;
    while((value=in.read())!=(-1)){
    	ibin[count++]=(byte)value;
    }
    in.close();
    System.out.println("读取的内容:"+new String(ibin));
    File iFile=new File(File.separator+"home"+File.separator+"zhaotongxue"+File.separator+"文档"+File.separator+"hello.txt");
    Writer iW=new FileWriter(iFile,true);
    iW.write("你好世界");
    iW.close();
    //创建一个数组
    int[] arr=new int[]{12,13,14,15,16};
    int[] arr2=new int[]{12,13,14,15,16};
    int[] arr3=new int[]{12,13,14,15,16,17};
    //true
    System.out.println(Arrays.equals(arr, arr2));
    //false
    System.out.println(Arrays.equals(arr, arr3));
    int[] copied=Arrays.copyOf(arr, 8);
    int[] copied2=Arrays.copyOf(arr, 2);
    System.out.println(Arrays.toString(copied));
    System.out.println(Arrays.toString(copied2));
    Arrays.fill(copied, 4, 7, 99);
    System.out.println(Arrays.toString(copied));
    String str="I am a nice boy and i love a nice girl now,you know?";
    StringTokenizer ST=new StringTokenizer(str);
    while(ST.hasMoreTokens()){
    	System.out.println(ST.e)
    }
    String inStr=System.in.toString();
    System.out.println(inStr);
    Scanner iScan=new Scanner(System.in);
    System.out.println(iScan.nextLine());
    System.out.println(System.in);
    BufferedReader iReader=new BufferedReader(new FileReader(args[0]));
    while(iReader.readLine()!=null){
    	System.out.println(iReader.readLine().toString());
    }
    iReader.close();
    StringReader iReader=new StringReader("/home/zhaotongxue/文档/new.txt");
    while(iReader.read()!=-1){
    	System.out.println((int)iReader.read());
    }

    DataInputStream iData=new DataInputStream(new StringBufferInputStream(ifile));
    while(true){
    	System.out.println((char)iData.readByte());
    }
    File ifile=new File("/home/zhaotongxue/文档/new.txt");
    DataOutputStream idata=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(ifile)));
    idata.writeBytes("你到底想要干什么？\n不知道，但是我想知道！");
    idata.writeDouble(520.1314);
    idata.close();
    DataInputStream ida=new DataInputStream(new BufferedInputStream(new FileInputStream(ifile)));
    BufferedReader ired=new BufferedReader(new InputStreamReader(ida));
    	System.out.println(ired.readLine());
    	System.out.println("我是分割线");
    	System.out.println(ida.readLine());
    File ifile=new File("/home/zhaotongxue/文档/new.txt");
    FileWriter iWriter=new FileWriter(ifile,true);
   iWriter.write("你只不知道。");
   iWriter.close(); 
//    File ifile=new File("/home/zhaotongxue/文档/new.txt");
    FileReader iReader=new FileReader(ifile);
    byte[] len=new byte[(int)ifile.length()];
    InputStream in=new FileInputStream(ifile);
    in.read(len);
    System.out.println(new String(len));
    in.close();
    }catch(Exception ex){
	System.out.println("错误信息:");
	ex.printStackTrace();
    }
    finally{
    }
public static void listAllFiles(File idir){
	File[] files=idir.listFiles();
	if(files!=null){
		for(int i=0;i<files.length;i++){
	if(files[i].isDirectory()){
		if(files[i]!=null){
				listAllFiles(files[i]);
		}
	}
	else{
		System.out.println("一级目录是："+files[i]);
	}
	}
	}
}
		File ifile=new File("/home/zhaotongxue/文档/new.gz");
		byte[] val=new byte[(int)file2.length()];
		while(iDu.read()!= -1){
			iout.write(iDu.read());
		}		iout.close();
		iDu.close();
			File iF=new File("/home/zhaotongxue/文档"+File.separator+"new.txt");
    File iFdir=new File("E:"+File.separator+"new");
    File ix=new File("E:"+File.separator);
	iF.createNewFile();
	iFdir.mkdir();
	String[] arr=ix.list();
	for(int i=0;i>arr.length;i++){
	System.out.println(arr[i]);
	}
	RandomAccessFile raf=new RandomAccessFile(iF,"rw");
	raf.writeBytes("zzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	raf.writeInt(1000);
	raf.close();
	OutputStream o=new FileOutputStream(iF);
	String im="赵同学哈哈哈哈哈哈哈啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊\n";
	byte[] ib=im.getBytes();
	o.write(ib);
	im="赵同学是个好孩子\n你说是不是呢？？？\n";
	ib=im.getBytes();
	o.write(ib);
	o.close();
	OutputStream out=new FileOutputStream(iF,true);
	im="我是添加的内容\n";
	ib=im.getBytes();
	out.write(ib);
	    out.close();
	InputStream in=new FileInputStream(iF);
	System.out.println(in.read());
	in.close();
    Writer str=new FileWriter(iF);
    //byte[] a=new byte[100];
    str.write("\r\n我又添加了一些内容");
    str.close();
    OutputStream os=new FileOutputStream(iF,true);
    byte[] strByte=new byte[1024];
    byte[] abc="我想另外可以\r\n".getBytes();
    //os.write(strByte);
    os.write(abc);
    Scanner scanner1=new Scanner(iF);
    InputStream in=new FileInputStream(iF);
    in.read(strByte);
    in.close();
    if(scanner1.next()!=null){
    System.out.println("读取内容是：：：："+scanner1.next());}
    System.out.println("我是strByte的内容："+new String(strByte));
    File iFile=new File(File.separator+"home"+File.separator+"zhaotongxue"+File.separator+"文档"+File.separator+"new.txt");
    //不存在我就创建
    if(!iFile.exists()){
    	iFile.createNewFile();
    	System.out.println("我创建了一个文件");
    }
    //创建文件夹对象，并打印所有的文件路径
    File idir=new File(File.separator+"home"+File.separator+"zhaotongxue"+File.separator+"文档"+File.separator);
    File[] dirList=idir.listFiles();
    System.out.println("当前目录文件：");
    for(int a=0;a<dirList.length;a++){
    	System.out.println(dirList[a]);
    }
    //但是子文件夹呢？？
    listAllFiles(idir);
    //写入操作： 
   OutputStream out=new FileOutputStream(iFile);
    String abc="赵同学\r\n哈哈，呵呵呵呵呵哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦哦\r\n刘蕾：\r\n放屁，你个傻逼！";
    byte[] ib=abc.getBytes();
    out.write(ib);
    out.close();
    ib="\r\n自恋狂！！！！！！！！！！！！！！！！！！！！".getBytes();
    out=new FileOutputStream(iFile,true);
    out.write(ib);
   out.close(); 
   //读取操作
    File iFile=new File(File.separator+"home"+File.separator+"zhaotongxue"+File.separator+"文档"+File.separator+"new.txt");
    InputStream in=new FileInputStream(iFile);
    System.out.println("长度是："+iFile.length());
    byte[] ibin=new byte[(int)iFile.length()];
    in.read(ibin);
    byte[] ibin=new byte[200];
    int count=0;
    int value=0;
    while((value=in.read())!=(-1)){
    	ibin[count++]=(byte)value;
    }
    in.close();
    System.out.println("读取的内容:"+new String(ibin));
    File iFile=new File(File.separator+"home"+File.separator+"zhaotongxue"+File.separator+"文档"+File.separator+"hello.txt");
    Writer iW=new FileWriter(iFile,true);
    iW.write("你好世界");
    iW.close();
    //创建一个数组
    int[] arr=new int[]{12,13,14,15,16};
    int[] arr2=new int[]{12,13,14,15,16};
    int[] arr3=new int[]{12,13,14,15,16,17};
    //true
    System.out.println(Arrays.equals(arr, arr2));
    //false
    System.out.println(Arrays.equals(arr, arr3));
    int[] copied=Arrays.copyOf(arr, 8);
    int[] copied2=Arrays.copyOf(arr, 2);
    System.out.println(Arrays.toString(copied));
    System.out.println(Arrays.toString(copied2));
    Arrays.fill(copied, 4, 7, 99);
    System.out.println(Arrays.toString(copied));
    String str="I am a nice boy and i love a nice girl now,you know?";
    StringTokenizer ST=new StringTokenizer(str);
    while(ST.hasMoreTokens()){
    	System.out.println(ST.e)
    }
    String inStr=System.in.toString();
    System.out.println(inStr);
    Scanner iScan=new Scanner(System.in);
    System.out.println(iScan.nextLine());
    System.out.println(System.in);
    BufferedReader iReader=new BufferedReader(new FileReader(args[0]));
    while(iReader.readLine()!=null){
    	System.out.println(iReader.readLine().toString());
    }
    iReader.close();
    StringReader iReader=new StringReader("/home/zhaotongxue/文档/new.txt");
    while(iReader.read()!=-1){
    	System.out.println((int)iReader.read());
    }

    DataInputStream iData=new DataInputStream(new StringBufferInputStream(ifile));
    while(true){
    	System.out.println((char)iData.readByte());
    }
    File ifile=new File("/home/zhaotongxue/文档/new.txt");
    DataOutputStream idata=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(ifile)));
    idata.writeBytes("你到底想要干什么？\n不知道，但是我想知道！");
    idata.writeDouble(520.1314);
    idata.close();
    DataInputStream ida=new DataInputStream(new BufferedInputStream(new FileInputStream(ifile)));
    BufferedReader ired=new BufferedReader(new InputStreamReader(ida));
    	System.out.println(ired.readLine());
    	System.out.println("我是分割线");
    	System.out.println(ida.readLine());
    File ifile=new File("/home/zhaotongxue/文档/new.txt");
    FileWriter iWriter=new FileWriter(ifile,true);
   iWriter.write("你只不知道。");
   iWriter.close(); 
//    File ifile=new File("/home/zhaotongxue/文档/new.txt");
    FileReader iReader=new FileReader(ifile);
    byte[] len=new byte[(int)ifile.length()];
    InputStream in=new FileInputStream(ifile);
    in.read(len);
    System.out.println(new String(len));
    in.close();
    }catch(Exception ex){
	System.out.println("错误信息:");
	ex.printStackTrace();
    }
    finally{
    }
}
public static void listAllFiles(File idir){
	File[] files=idir.listFiles();
	if(files!=null){
		for(int i=0;i<files.length;i++){
	if(files[i].isDirectory()){
		if(files[i]!=null){
				listAllFiles(files[i]);
		}
	}
	else{
		System.out.println("一级目录是："+files[i]);
	}
	}
	}
}
		File ifile=new File("/home/zhaotongxue/文档/new.gz");
		File file2=new File("/home/zhaotongxue/文档/new.txt");
		BufferedReader iDu=new BufferedReader(new FileReader(file2));
		BufferedOutputStream	 iout=new BufferedOutputStream(new ZipOutputStream(new FileOutputStream(ifile)));
		byte[] val=new byte[(int)file2.length()];
		while(iDu.read()!= -1){
			iout.write(iDu.read());
		}
		iout.close();
		iDu.close();
			}
}
*/
	}
}