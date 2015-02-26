package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpOperatorPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url=new URL("http://fanyi.youdao.com/openapi.do");
			HttpURLConnection hURLc;
			hURLc = (HttpURLConnection) url.openConnection();
			hURLc.setDoInput(true);
			hURLc.setDoOutput(true);
			hURLc.addRequestProperty("encoding", "utf-8");
			hURLc.setRequestMethod("POST");
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(hURLc.getOutputStream()));
			bw.write("keyfrom=zhaotongxue&key=660548536&type=data&doctype=xml&version=1.1&q=How well you are!");
			bw.flush();
			BufferedReader br=new BufferedReader(new InputStreamReader(hURLc.getInputStream()));
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
