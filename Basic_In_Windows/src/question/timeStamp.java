package question;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class timeStamp {
	static long num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num=DayCalc();
		TimerTask tt=new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				num++;
				System.out.println("现在的时间戳是："+num);
			}
		};
		Timer t=new Timer();
		t.schedule(tt, 0, 1000);
		}
	@SuppressWarnings("deprecation")
	public static long DayCalc(){
		Calendar cal=Calendar.getInstance();
		//SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date time=cal.getTime();
		//df.format(time);
		//System.out.print(time.getYear());
		int  leap=0,aleap=0;
		//有几年，有几个闰年几个平年
		for(int i=1970;i<(1900+time.getYear());i++){
			if(i%4!=0){
				leap++;
			}
			else{
				if(i%100==0&&i%400!=0){
					leap++;
				}
				else{
					aleap++;
				}
			}
		}
		int mianYearSeconds=(365*leap+366*aleap)*24*3600;
		int monthSeconds=0;
		for(int i=0;i<time.getMonth();i++){
			switch(i+1){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				monthSeconds+=31*24*3600;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				monthSeconds+=30*24*3600;
				break;
			case 2:
				if((1900+time.getYear())%4==0){
					if((1900+time.getYear())%400==0){
						monthSeconds+=29*24*3600;
					}
					else if((1900+time.getYear())%100==0&&(1900+time.getYear())%400!=0){
						monthSeconds+=28*24*3600;
					}
					else{
						monthSeconds+=29*24*3600;
					}
				}
				else{
						monthSeconds+=28*24*3600;
				}
			}
			
		}
		
//		System.out.println((long)(mianYearSeconds+monthSeconds+(cal.get(cal.DAY_OF_MONTH)-1)*24*3600+cal.get(cal.HOUR_OF_DAY)*3600+cal.get(.MINUTE)*60+time.getSeconds()));
//		System.out.println(System.currentTimeMillis()/1000); 
		return (long)(mianYearSeconds+monthSeconds+(cal.get(cal.DAY_OF_MONTH)-1)*24*3600+time.getHours()*3600+time.getMinutes()*60+time.getSeconds()); }
}
