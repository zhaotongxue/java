package ijava;
public class zipAndseri {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			      /*
				BufferedReader in = new BufferedReader(new FileReader("/home/zhaotongxue/文档/new.txt")); 
			      BufferedOutputStream out = new BufferedOutputStream( new GZIPOutputStream( new FileOutputStream("test.gz"))); 
			      int c; 
			      while((c = in.read()) != -1) 
			        out.write(c); 
			      in.close(); 
			      out.close(); 
			      System.out.println("Reading file"); 
			      BufferedReader in2 = 
			        new BufferedReader( 
			          new InputStreamReader( 
			            new GZIPInputStream( 
			              new FileInputStream("test.gz")))); 
			      String s; 
			      while((s = in2.readLine()) != null) 
			        System.out.println(s); 
			File unZipFile=new File("/home/zhaotongxue/文档/new.txt");
			File ZipFile=new File("/home/zhaoongxue/文档/new.gz");
			BufferedReader in=new BufferedReader(new FileReader(unZipFile));
			GZIPOutputStream out=new GZIPOutputStream(new FileOutputStream(ZipFile));
			BufferedOutputStream iout=new BufferedOutputStream(out);
			int coun;
			while((coun=in.read())!=-1){
				iout.write(coun);
			}
			in.close();
			out.close();
			*/
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			
		}

	}

}
