package hero;

public class asdd {
	
	

	public static void matchPassword(String password,int index)
    {
        if(index==password.length())
            return;
        for(int i=48;i<=122;i++)
        {
            if((char)i==password.charAt(index))
            {
                System.out.print((char)i);
                matchPassword(password,index+1);
                break;
            }
        }
        
    }

	public static void main(String[] args) {	
		String password,answer;
		char d[]=new char[3];
	for(int i=0;i<3;i++) {
		int acsii=(int)(Math.random()*74+48);
		d[i]=(char)acsii;
		
	}
	password=String.valueOf(new char[] {d[0],d[1],d[2]});
	System.out.println(password);
	asdd.matchPassword(password, 0);
		
	}
}
