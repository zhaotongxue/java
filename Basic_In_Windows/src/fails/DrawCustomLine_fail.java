package fails;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawCustomLine_fail extends Applet implements ActionListener,MouseListener{
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
	//	addMouseListener(this);
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		//add(this);
		setSize(600,600);
		setBackground(Color.white);
	}

	boolean ifDraw=false;
	@Override
	public void mouseClicked(MouseEvent arg0) { }
	@Override
	public void mouseEntered(MouseEvent arg0) { }
	@Override
	public void mouseExited(MouseEvent arg0) { }
	@Override
	public void mousePressed(MouseEvent arg0) {
		if(arg0.getModifiers()==InputEvent.BUTTON1_MASK){
			System.out.println("mousePressed");
			point=getMousePosition();
			ifDraw=true;
			this.paint(getGraphics());
		}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		if(arg0.getModifiers()==InputEvent.BUTTON1_MASK){
			point=getMousePosition();
			this.paint(getGraphics());
			ifDraw=false;
		}
		
	}

	Point point=null;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean mouseDown(Event arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
//		if(arg0.modifiers==InputEvent.BUTTON1_MASK){
			ifDraw=false;
			point=getMousePosition();
			this.paint(getGraphics());
//		}
		return super.mouseDown(arg0, arg1, arg2);
	}

	@Override
	public boolean mouseDrag(Event arg0, int arg1, int arg2) {
//		if(arg0.modifiers==InputEvent.BUTTON1_MASK){
//		System.out.println("mouseDrag");
			ifDraw=true;
			point=getMousePosition();
			this.paint(getGraphics());
//		}
		return super.mouseDrag(arg0, arg1, arg2);
	}

	@Override
	public boolean mouseEnter(Event arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		return super.mouseEnter(arg0, arg1, arg2);
	}

	@Override
	public boolean mouseMove(Event arg0, int arg1, int arg2) {
		return super.mouseMove(arg0, arg1, arg2);
	}

	@Override
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		if(ifDraw){
			super.paint(arg0);
			arg0.drawLine(point.x-1,point.y-1,point.x+1,point.y+1);
		}
	}
}
