import java.util.*;
import java.text.*;
import java.time.*;
public class CollectionsTry {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] arr={"MyName","赵同学","赵同学98","赵同学1998"};
			//ArrayList:效率高，查询好，但是插入删除操作不是很好
		    ArrayList myAL=new ArrayList();
		    myAL.add("哈哈哈哈");
		    System.out.println("现在打印ArrayList的结果：");
		    for(int i=0;i<myAL.size()-1;i++){
		    	System.out.println(myAL.get(i));
		    }
		    //HashSet
		    HashSet hs=new HashSet(Arrays.asList(arr));
		    	System.out.println("Set输出结果：");
		    	System.out.println(hs);
		    	//Map
		    	System.out.println("Map输出结果：");
		    	Map im=new HashMap();
		    	im.put(1,"赵业伟");
		    	im.put(2,"放屁");
		    	im.put(100,"你猜猜看");
		    	System.out.println(im.toString());
		    	System.out.println("我是分割线——————————————————————");
		    	System.out.println("size():"+im.size());
		    	System.out.println("Value is:"+im.values());
		    	System.out.println(im);
		    	for(int i=0;i<im.size()-1;i++){
		    		System.out.println(im.get(100));
		    	}
		    	Calendar iCan=Calendar.getInstance();
		    	System.out.println(iCan.DAY_OF_WEEK_IN_MONTH);
		    	System.out.println(iCan.getTime());
		    	Collection c=Collections.unmodifiableCollection(hs);
		    	Map m=Collections.unmodifiableMap(im);
		    	List ilist=Collections.synchronizedList(myAL);
		    	Set s=Collections.synchronizedSet(hs);
		    	System.out.println("打印结果，Collection，m，ilist，s");
		    	wr(c);
		    	wr(m);
		    	wr(ilist);
		    	wr(s);
	}
	public static void wr(Object s){
		System.out.println(s);
	}
}
