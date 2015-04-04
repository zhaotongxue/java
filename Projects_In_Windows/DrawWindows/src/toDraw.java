import java.applet.Applet;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;
public class toDraw  extends Applet implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) { }
	BufferedImage Bimg=new BufferedImage(600,600,BufferedImage.TYPE_INT_RGB);
	Graphics g=Bimg.getGraphics();
	Point position;
	Point oldPosition;
	boolean isDraw=false;
	@Override
	public void init() {
		super.init();
		g.setColor(Color.white);
		JMenu menu=new JMenu("文件");
		JMenuItem JMenuSave=new JMenuItem();
		menu.setSize(100,16);
		JMenuSave.setText("保存");
		JMenuSave.setSize(100,13);
		JMenuSave.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
		JFileChooser chooser=new JFileChooser();
		FileNameExtensionFilter filter=new FileNameExtensionFilter("*.jpg","jpg");
		chooser.setFileFilter(filter);
		int result=chooser.showSaveDialog(null);
		if(result==JFileChooser.APPROVE_OPTION){
		File imgFile=chooser.getSelectedFile();	
		try {
			//Image img=getImage(new URL(imgFile.getPath()));
			//getGraphics().drawImage(img, 0, 0, 600, 600, Color.white,);
			ImageIO.write(Bimg, "jpg", imgFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		} } });
		menu.add(JMenuSave);
		JMenuBar menuBar=new JMenuBar();
		menuBar.add(menu);
		add(menuBar);
		//整块儿画布
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		setSize(600,600);
		setBackground(Color.white);
	// TODO Auto-generated method stub
	}
	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		// TODO Auto-generated method stub
		isDraw=true;
		position=getMousePosition();
		oldPosition=position;
		this.paint(getGraphics());
		this.paint(g);
		return super.mouseDown(evt, x, y);
	}
	@Override
	public boolean mouseDrag(Event evt,int x, int y) {
		// TODO Auto-generated method stub
		isDraw=true;
		position=getMousePosition();
		this.paint(getGraphics());
		this.paint(g);
		oldPosition=position;
		return super.mouseDrag(evt, x, y);
	}
	@Override
	public boolean mouseMove(Event evt, int x, int y) {
		return super.mouseMove(evt, x, y);
	}
	public void mouseReleased(MouseEvent e) {
		//停了，不画了
		position=getMousePosition();
		oldPosition=position;
		this.paint(getGraphics());
		this.paint(g);
		isDraw=false;
	}
	public void paint(Graphics gg)	{
		if(isDraw){
			super.paint(gg);
			gg.drawLine(oldPosition.x, oldPosition.y,position.x, position.y);
		}
	}
}