
import java.util.StringTokenizer;

class Token 
{
    public static void main(String[] args) 
    {
     String s="Java is a programming language" ;
     StringTokenizer st=new StringTokenizer(s) ;
     while (st.hasMoreTokens())
     {
        System.out.println(st.nextToken());
     } 
    }
}
