package ecpection;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class yichang{
	
	public float hp;
    class IndexIsNagetiveException extends Exception{
    	public IndexIsNagetiveException() {
    		
    	}
    	public IndexIsNagetiveException(String msg) {
    		super(msg);
    	}
    
  
    }
	public void negtive(String a[],int pos) throws IndexIsNagetiveException{
		if (pos<0)
			throw new IndexIsNagetiveException(pos+"<--下标值为负啦");
	}
	public void insert(String a[],int pos,int insertsite) throws IndexIsOutofRangeException {
		if (insertsite>a.length-1)
			throw new IndexIsOutofRangeException ("下边朝鲜");
		
	}
   public static void main(String[] args) {
        
	  // yichang a=new yichang();
	   yichang b=new yichang();
	   String a[]=new String[8]; 
 
   try {
	   b.insert(a, 6, 22);
	   b.negtive(a,7);
	   
   }catch (IndexIsOutofRangeException | IndexIsNagetiveException   e) {
	 if(e instanceof IndexIsNagetiveException )
	 System.out.println("异常的原因"+e.getMessage());
	   if (e instanceof IndexIsOutofRangeException )
		   System.out.println("异常的原因"+e.getMessage());
	   e.printStackTrace();
   }
   }
}
