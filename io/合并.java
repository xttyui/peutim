import java.io.*;

public class file4 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/hhxtt/55.rar");
        FileInputStream fs = new FileInputStream(f);

        byte[] byteArr = new byte[(int) f.length()];


        fs.close();
        for(int i=0;i<byteArr.length/102400;i++){
            File f1=new File("d:/hhxtt/lol"+i+".log");
            FileInputStream f2=new FileInputStream(f1);
            byte[] t1 = new byte[102400];
            f2.read(t1);
            for(int j=i*102400;j<byteArr.length;j++){
                byteArr[j]=t1[j-i*102400];
                if((j+1)%102400==0)
                    break;
            }
        }
        File f2=new File("d:/hhxtt/lol.log");
        FileOutputStream f3=new FileOutputStream(f2);
        f3.write(byteArr);
    }
}
