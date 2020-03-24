
public interface IStringBuffer {

	    public void append(String str); //追加字符串
	    public void append(char c);  //追加字符
	    public void insert(int pos,char b); //指定位置插入字符
	    public void insert(int pos,String b); //指定位置插入字符串
	    public void delete(int start); //从开始位置删除剩下的
	    public void delete(int start,int end); //从开始位置删除结束位置-1
	    public void reverse(); //反转
	    public int length(); //返回长度
	}
	















public class MyStringBuffer implements IStringBuffer {

    int capacity = 16;
    int length = 0;
    char[] value;
    public MyStringBuffer(){
        value = new char[capacity];
    }
    public MyStringBuffer(String str){
        this();
        if(null==str)
            return;
         
        if(capacity<str.length()){
            capacity  = value.length*2;
            value=new char[capacity];
        }
         
        if(capacity>=str.length())
            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
         
        length = str.length();
         
    }
	public void append(String str) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void append(char c) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void insert(int pos, char b) {
        // TODO Auto-generated method stub
         
    }
    public void insert(int pos,String b) {
        if(pos<0)
            return;
         
        if(pos>length)
            return;
         
        if(null==b)
            return;
         
        //扩容
        while(length+b.length()>capacity){
            capacity = (int) ((length+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }
         
        char[] cs = b.toCharArray();
         
        //先把已经存在的数据往后移
         
        System.arraycopy(value, pos, value,pos+ cs.length, length-pos);
        //把要插入的数据插入到指定位置
        System.arraycopy(cs, 0, value, pos, cs.length);
         
        length = length+cs.length;
    }
 
    @Override
    public void delete(int start) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void delete(int start, int end) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void reverse() {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public int length() {
        // TODO Auto-generated method stub
        return 0;
    }
    public   static void main (String args[]) {
        String str ="";
        String str2 = "";
        String str3 = "";
        StringBuffer sb = new StringBuffer(str);
       // MyStringBuffer ss= new MyStringBuffer();
        while (sb.length() < 10)
        {
            int cha = (int) (Math.random() * 26 + 97);
            char c = (char) cha;
            sb.append(c);
        }
        Long startTime1 = System.currentTimeMillis();
        for(int i=0;i<=1000000;i++)
        {
            str2 =str2+ sb;
        }
        Long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);
 
        StringBuffer sb2 = new StringBuffer(str3);
        Long startTime2 = System.currentTimeMillis();
        for(int j=0;j<=1000000;j++)
        {
            sb2.append(sb);
        }
        Long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2+" "+sb2.length());
        String str4= ""+sb;
        MyStringBuffer ss= new MyStringBuffer(str4);
        Long startTime3 = System.currentTimeMillis();
        int ps=ss.length;
        for(int i=0;i<=1000000;i++) {
        	
        	ss.insert(ps, str4);
        ps=ss.length;
        }
        	
        	 Long endTime3 = System.currentTimeMillis();
        	 System.out.println(endTime3 - startTime3+" "+ ss.length);
    }
 
}
