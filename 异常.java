package ecpection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class yichang{
	public static int ddd() {
		return 333;
	}
	public static int method() {
		  File f= new File("d:/LOL.exe");
		try{
	           //System.out.println("试图打开 d:/LOL.exe");
	           new FileInputStream(f);
	          // System.out.println("成功打开");
	           return 1;
	       }
	       catch(Exception e){
	           //System.out.println("d:/LOL.exe不存在");
	           e.printStackTrace();
	           return 2;
	       }
	        finally {
	        //	System.out.print("无论是否出现异常代码都会执行啊");
	        	return 3;
	        }
	}

   public static void main(String[] args) {
        
       File f= new File("d:/LOL.exe");
       System.out.println(method());
   }
}
