package fails;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
//<applet code=有图形了 width=400 height=200 ></applet>	
public class 有图形了  extends Applet{
public void paint(Graphics g){
	g.draw3DRect(300, 300, 300, 300, isEnabled());
	g.setColor(Color.red);
	g.setFont(Font.getFont("serif"));
	g.drawString("你好，你个苦逼", 400, 400);
	URL url;
	try {
		url = new URL("/home/zhaotongxue/图片/");
		Image img=getImage(url,"2014-08-10 22:13:03 的屏幕截图.png");
		g.drawImage(img, 200, 200, Color.white, getParent());
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	g.dispose();
}
}
