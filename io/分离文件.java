import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file3 {
    public static void main(String[] args) {
        try {
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f =new File("d:/hhxtt/55.rar");
            //创建基于文件的输入流
            FileInputStream fis =new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all =new byte[(int) f.length()];
            fis.read(all);
            for(int i=0;i<all.length/102400;i++){
                File f2 =new File("d:/hhxtt/llloo-"+i+".log");
                FileOutputStream fsss = new FileOutputStream(f2);

                byte[] t = new byte[102400];
                if(i-all.length/12400==0) {
                    byte[] tt = new byte[all.length - i * 102400];
                }
                if(all.length<102400){
                    fsss.write(all);
                }else{
                for(int j=i*102400;j<all.length;j++) {

                          t[j-i*102400] = all[j];
                          if ((j + 1) % 102400 == 0||all[j-i*102400]<100) {
                        fsss.write(t);

                        break;
                    }
                }
                }
            }

            //每次使用完流，都应该进行关闭
            fis.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
