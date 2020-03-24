public class myStringbuffer implements IStringbuffer {
 
    private String string;
 
    public myStringbuffer(String s){
        string = s;
    }
 
    @Override
    public String toString() {
        return "myStringbuffer{" +
                "string='" + string + '\'' +
                '}';
    }
 
    @Override
    public void append(String str) {
        string += str;
    }
 
    @Override
    public void append(char c) {
        string += c;
    }
 
    @Override
    public void insert(int pos, char b) {
 
        if (pos>string.length()){
            return;
        }
        else {
            char[] chars = string.toCharArray();
            char[] chars1 = new char[chars.length+1];
 
            chars1[pos] = b;
 
 
            for (int i = 0; i <pos ; i++) {
                chars1[i]= chars[i];
            }
 
            for (int i =pos; i <chars.length; i++) {
                chars1[i+1] = chars[i];
            }
 
            string = new String(chars1);
        }
 
 
 
 
    }
 
    @Override
    public void insert(int pos, String b) {
        string = string.substring(0,pos)+ b + string.substring(pos);
    }
 
 
    @Override
    public void delete(int start) {
        string = string.substring(0,start);
    }
 
    @Override
    public void delete(int start, int end) {
        string = string.substring(0,start) + string.substring(end);
    }
 
    @Override
    public void reverse() {
        char[] chars = string.toCharArray();
        char[] chars1 = new char[chars.length];
 
 
        for (int i = 0; i <chars.length ; i++) {
            chars1[chars.length-i-1] = chars[i];
        }
 
        string = new String(chars1);
    }
 
    @Override
    public int length() {
        char[] chars = string.toCharArray();
            int count=0;
 
            for (int i = 0; i <chars.length ; i++) {
                count++;
            }
            return count;
    }
 
    public static void main(String[] args) {
        String s = "This is a test string";
        myStringbuffer myStringbuffer = new myStringbuffer(s);
 
        myStringbuffer.append('a');
        System.out.println(myStringbuffer);
 
        myStringbuffer.append("Hahaha");
        System.out.println(myStringbuffer);
 
        myStringbuffer.insert(0,'a');
        System.out.println(myStringbuffer);
 
        myStringbuffer.insert(10,'a');
        System.out.println(myStringbuffer);
 
        myStringbuffer.insert(10,"this");
        System.out.println(myStringbuffer);
 
        myStringbuffer.insert(7,"this");
        System.out.println(myStringbuffer);
 
        myStringbuffer.delete(10);
        System.out.println(myStringbuffer);
 
        myStringbuffer.delete(1,5);
        System.out.println(myStringbuffer);
 
        myStringbuffer.reverse();
        System.out.println(myStringbuffer);
 
        System.out.println(myStringbuffer.length());
    }
}
