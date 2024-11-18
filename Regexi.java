
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regexi 
{
    public static void main(String[] args) 
    {
     Pattern p=Pattern.compile(".o") ;
     Matcher m=p.matcher("go") ;
     Boolean b=m.matches();
     System.out.println(b);  
     System.out.println(Pattern.matches(".o", "go"));
    }
}