package filesOperate;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class me implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		Thread t=new Thread(new me());
		t.start();
		//通过缓冲流字节流复制文件
	/*	File f=new File("res/see.mp3");
		FileInputStream fis=new FileInputStream(f);
		BufferedInputStream bis=new BufferedInputStream(fis);
		File f2=new File("res/copy_see.mp3");
		FileOutputStream fos=new FileOutputStream(f2,true);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		byte[] b=new byte[1023];
		int n=1;
		while(fis.read(b)!=-1){
			//fos.write(b);
			bos.write(b);
			n++;
		}
		System.out.print(n);
		bis.close();
		bos.close();
		fos.close();
		fis.close();
		*/
		
		
		
		
		//通过字节读写复制文件
	/*	File a=new File("res/a.jpg");
		File b=new File("res/b.jpg");
		b.createNewFile();
		FileInputStream fis=new FileInputStream(a);
		FileOutputStream fos=new FileOutputStream(b);
		byte[] bn=new byte[128];
		while(fis.read(bn)!=-1){
			fos.write(bn);
		}
		System.out.print("haole");
		fis.close();
		fos.close();
		*/
		
		
		
		
		//通过字节读写文件
		/*File f=new File("iso.txt");
		FileOutputStream fos=new FileOutputStream(f.getAbsolutePath(), true);
		fos.write("哈哈哈哈 ".getBytes("utf-8"));
		fos.close();
		FileInputStream fis=new FileInputStream(f);
		byte[] b=new byte[31];
	//	fis.read(b);
		fis.read(b);
		fis.close();
		System.out.print(new String(b));
		*/
		
		//通过一般方法读写文件
//		// TODO Auto-generated method stub
//		File f=new File("iso.txt");
////		f.createNewFile();
//		try {
//			FileInputStream fis=new FileInputStream(f);
//			InputStreamReader isr=new InputStreamReader(fis, "utf-8");
//			BufferedReader br=new BufferedReader(isr);
//			
//			while(br.readLine()!=null){
//			System.out.println(br.readLine().toString());
//			}
//			br.close();
//			isr.close();
//			fis.close();
//			
//			//写文件
//			FileOutputStream fos=new FileOutputStream(f,true);
//			OutputStreamWriter osr=new OutputStreamWriter(fos, "utf-8");
//			
//			BufferedWriter bw=new BufferedWriter(osr);
//			char[] c="我是谁？".toCharArray();
//			for(char ci : c){
//			osr.append(ci);
//			}
//			bw.close();
//			osr.close();
//			fos.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

}
