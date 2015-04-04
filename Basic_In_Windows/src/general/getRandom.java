package general;
import java.util.*;
public class getRandom {
	public static int getARandom(int max){
		Random r=new Random();
		return r.nextInt(max);
	}
}
