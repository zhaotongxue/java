import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Dw{
public static void main(String[] args)	{
	mouseCatch im=new mouseCatch();
	itDraw it=new itDraw();
	it.addMouseListener(im);
}
}
class mouseCatch implements MouseListener{
	//鼠标进入后
	boolean Entered=false;
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		Entered=true;	
		myDraw id=new myDraw();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		Entered=false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	if(Entered==true)	{
		myDraw iD=new myDraw();
	}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
} 
//绘图类
class itDraw extends Applet{
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Graphics gg=g.create();
		gg.drawRect(0, 0, 500, 500);
		gg.dispose();
	}
}
class myDraw  extends Applet{
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Image iconimg=createImage(16,16);
		Graphics gg=g.create();
		gg.drawString("赵业伟你好啊", 100, 100);
		gg.drawLine(100, 100, 600, 200);
		Font thisFont=new Font(Font.MONOSPACED,Font.ITALIC,40);
		gg.setFont(thisFont);
		gg.setColor(Color.yellow);
		gg.drawString("赵业伟你好啊", 200,200);
		gg.drawLine(200, 200, 600, 200);
		gg.setColor(Color.green);
		gg.drawLine(100, 100, 200, 200);
		gg.dispose();
		g.drawString("g画的图片，在这里哦~", 10, 10);
	}
}