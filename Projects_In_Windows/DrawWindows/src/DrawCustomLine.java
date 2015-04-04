import java.util.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.applet.*;
public class DrawCustomLine extends Applet{
		boolean CanD;
		Point[] calcPoints,p;
		Point staticCenter,startLeftPosition,startRightPosition;
	public static void main(String[] args) {
		Timer ITimer=new Timer();
		IT i=new IT();
		ITimer.schedule(i,500);			
	}
	@Override
	public void paint(Graphics g){
		if(CanD==true){
		super.paint(g);
		staticCenter=new Point(150,150);
		calcPoints = new Point[2];
		staticCenter.x = 300 / 2;
		staticCenter.y = 300 / 2;
		startLeftPosition.x = staticCenter.x - 100;
		startLeftPosition.y = staticCenter.y;
		startRightPosition.x = 300 - startLeftPosition.x;
		startRightPosition.y = 300 - startLeftPosition.y;
		if (startLeftPosition.x <= staticCenter.x + 100)
		{
			if (startLeftPosition.x <= staticCenter.x)
			{
				startLeftPosition.x++;
				startLeftPosition.y++;
				startRightPosition.x = 300 - startLeftPosition.x;
				startRightPosition.y = 300 - startLeftPosition.y;
			}
			else
			{
				startLeftPosition.x++;
				startLeftPosition.y--;
				startRightPosition.x = 300 - startLeftPosition.x;
				startRightPosition.y = 300 - startLeftPosition.y;
			}
		}
		else {
			startLeftPosition.x = staticCenter.x-100;
			startLeftPosition.y = staticCenter.y;
			startRightPosition.x = 300 - startLeftPosition.x;
			startRightPosition.y = 300 - startLeftPosition.y;
		}
		g.drawLine(startLeftPosition.x,startLeftPosition.y,startRightPosition.x,startRightPosition.y);
		CanD=false;
	}
	}
}
class IT extends TimerTask{
		public boolean CanD=true;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			CanD=true;
			System.out.println("aa");
		}
}

