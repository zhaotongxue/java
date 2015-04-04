package web_develop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class useAPI {
	public static void main(String[] args){
		new Thread(new userIT("Hello,world!"),"zhao").start();
	}
}
class userIT implements Runnable{
	private String transCon;
	public userIT(String s) {
		super();
		// TODO Auto-generated constructor stub
		transCon=s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			URL url=new URL("http://fanyi.youdao.com/openapi.do?keyfrom=zhaotongxue&key=660548536&type=data&doctype=json&version=1.1&q="+transCon);
			URLConnection uc=url.openConnection();
			InputStream is=uc.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			String line="";
			while((line=br.readLine())!=null){
				sb.append(line);
			}
			System.out.println(sb);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
