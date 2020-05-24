import java.io.*;
import java.util.Scanner;

public class sysytemin{
    public static void bufferread(){
        File f=new File("h:/dog.java");
        try(FileReader fr=new FileReader(f);
            BufferedReader pw=new BufferedReader(fr)){
            while(true) {
                String line = pw.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static  void printwrite(String name,String type,String property){
        File f=new File("h:/dog.java");
        try(FileWriter fw=new FileWriter(f);
            PrintWriter pw=new PrintWriter(fw)){
            pw.println("public class "+name+" {\n" +
                    "    public "+name+ property+";\n" +
                    "    public "+name+"() {\n" +
                    "    }\n" +
                    "    public void set"+property+"("+type+""+property+"){\n" +
                    "        this"+property+" ="+property+";\n" +
                    "    }\n" +
                    "      \n" +
                    "    public "+type+"  get"+property+"(){\n" +
                    "        return this."+property+";\n" +
                    "    }\n" +
                    "}");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入类的名称：");

        String a =s.nextLine();
        System.out.println("请输入类的属性：");
       String b = s.nextLine();
        System.out.println("请输入属性内容：");
        String c=s.nextLine();

      printwrite(a,b,c);
      bufferread();
    }
}
