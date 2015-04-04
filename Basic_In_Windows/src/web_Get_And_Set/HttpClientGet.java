package web_Get_And_Set;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientGet {
	public static void main(String[] args){
		new Thread(new getSth(),"soga").start();
	}
}
class getSth implements Runnable{
	HttpClient httpClient=HttpClients.createDefault();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		HttpGet hg=new HttpGet("http://www.zhihu.com");
		try {
			HttpResponse hr=httpClient.execute(hg);
			HttpEntity he=hr.getEntity();
			String lines=	EntityUtils.toString(he,"utf-8");
			System.out.println(lines);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}