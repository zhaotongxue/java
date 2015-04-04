package chatRoom_follow_video;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Linstener(),"go").start();
	}

}
