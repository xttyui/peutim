import java.util.Date;
public class stringbuffer {
	public   static void main (String args[]) {
		char d[]=new char[10];
		String example,exboy;
		for (int i=0;i<10;i++) {
            
			int s=(int)(Math.random()*(74)+48);
			
			if (s<57|(65<s&s<90)|(s>96&s<122)) {
	      //  d=(char)s;
			d[i] = (char)s;
			
			}
		//	System.out.print((char)s);
			else {
				i--;
			}
		
			}
		example=String.valueOf(new char[] {d[0],d[1],d[2],d[3],d[4],d[5],d[6],d[7],d[8],d[9]});
		Date d1=new Date();
		long stringstart = System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		exboy=example+example;
		long stringend=System.currentTimeMillis();
		long stringtime=stringend-stringstart;
		System.out.println("使用字符串的方式耗时"+stringtime+"ms");
		StringBuffer eample1=new StringBuffer(example);
		long stringbufferstart = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
			eample1.append(example);
		long stringbufferend = System.currentTimeMillis();
		long stringbuffertime=stringbufferend-stringbufferstart;
		System.out.println("使用bufer的方式耗时"+stringbuffertime+"ms");
	}
}
