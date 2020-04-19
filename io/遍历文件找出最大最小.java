import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class flie {


    public static void main(String[] args) {
     int min=88,max=0;

    File f1=new File("c:/windows");
      File [] file=  f1.listFiles();
        System.out.println(file[88].length());
        for(int i=0;i<file.length;i++){
           if(file[min].length()>file[i].length() && file[i].length()!=0&&file[i].isFile())

               min=i;

           if(file[max].length()<file[i].length() && file[i].isFile())
               max=i;
        }

        System.out.println(max+"  "+file[max]+"  "+file[max].length());
        System.out.println(min+"   "+file[min].length()+"  "+file[min].length());
        File[]fs= f1.listFiles();
        f1.listRoots();
}
