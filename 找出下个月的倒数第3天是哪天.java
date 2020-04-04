package data;
  
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
  
public class data1 {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
         c.getTime();
         c.add(Calendar.MONTH,2);
         c.set(Calendar.DATE,1);
         c.add(Calendar.DAY_OF_MONTH,-3);
        Date d2 = new Date(0);
        System.out.println(sdf.format(c.getTime()));
        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
        System.out.println(c);
    }
}
