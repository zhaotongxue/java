import java.math.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 
import java.text.*; 
import java.applet.Applet;
public class MyAlarmClock extends Applet implements MouseListener
{ 
 Panel panel; 
 boolean clicked=false;
 public void init() { 
  setBackground(Color.green); 
  setLayout(null); 
  panel=new Panel(); 
  panel.setLayout(null); 
  Button bt1=new Button("确定"); 
  bt1.setBounds(100,100,40,20); 
  bt1.addMouseListener(this);
  panel.add(bt1); 
  add(panel); 
  panel.setBounds(10,10,200,200); 
  panel.setBackground(Color.white); 
  setSize(800,600); 
 } 
 public void mouseClicked(MouseEvent e)
 {
  clicked=true;
  Graphics g=getGraphics();
  update(g);

 }
 
 //由于继承自接口，所以全部抽象方法都要覆盖，以下方法没用但又不可缺少
 public void mouseEntered(MouseEvent e){ }
 public void mouseExited(MouseEvent e){ }
 public void mousePressed(MouseEvent e){ }
 public void mouseReleased(MouseEvent e){ }
 
 public void paint(Graphics g){ 
  if(clicked)
  {
   g.setColor(Color.blue); 
   g.drawOval(340,240,100,100); 
  }
 } 
}