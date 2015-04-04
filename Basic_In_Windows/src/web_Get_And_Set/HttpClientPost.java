package web_Get_And_Set;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


public class HttpClientPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new tran(),"so").start();
	}
	static class tran implements Runnable{
		//HttpClient创建用来执行get，post
		HttpClient hc=HttpClients.createDefault();
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//keyfrom=ssssssqqqqqq&key=468050560&type=data&doctype=<doctype>&version=1.1&q=要翻译的文本
			//新建HttpPost创建请求地址
			HttpPost hp=new HttpPost("http://fanyi.youdao.com/openapi.do");
			//创建参数列表，增加参数
			List<BasicNameValuePair> parameters=new ArrayList<BasicNameValuePair>();
			parameters.add(new BasicNameValuePair("keyfrom","ssssssqqqqqq"));
			parameters.add(new BasicNameValuePair("key","468050560"));
			parameters.add(new BasicNameValuePair("type","data"));
			parameters.add(new BasicNameValuePair("doctype","xml"));
			parameters.add(new BasicNameValuePair("version","1.1"));
			parameters.add(new BasicNameValuePair("q","Hello,world!"));
			try {
				//创建请求的其他信息
				hp.setEntity(new UrlEncodedFormEntity(parameters, "utf-8"));
				//使用HttpClient打开hp，返回HttpResponse，调用HttpResponse的getEntity返回HttpEneity对象
				HttpEntity hr=hc.execute(hp).getEntity();
				//使用EneityUtils的toString方法将相应实体获取
				String s=EntityUtils.toString(hr, "utf-8");
				System.out.println(s);
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
