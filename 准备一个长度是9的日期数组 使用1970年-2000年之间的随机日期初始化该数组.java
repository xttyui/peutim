package data;
import java.text.SimpleDateFormat;
import java.util.Date;
public class data1 { 

		public static void main(String[] args) {
	
			 SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
			 String str[]=new String [9];

	        Date d1 = new Date(70, 1, 1, 0, 0, 0);
	        Date d2 = new Date(100, 12, 31, 23, 59, 59);
	        long time1 = d1.getTime();
	        long time2 = d2.getTime();
	        long cover = time2 - time1;
	        long d3[]=new long[9];
	        for(int i=0;i<9;i++)
	        d3 [i]= (long)(Math.random()*(time2 - time1) + time1);
	        Date d[]=new Date[9];
	        System.out.println("没排序之前哦");
	        
	        for (int i=0;i<9;i++) {           //long变为date ,date转为字符型
	         d [i]= new Date(d3[i]);
	         str[i]=sdf.format(d[i]);
	        System.out.println(str[i]);
	        }
	      long a=Integer.parseInt(str[0]);
	       System.out.println(a);
	        }
	    }


