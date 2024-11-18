public class buff 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer() ;
        System.out.println(sb.capacity());
        sb = sb.append("java");
        System.out.println("c++");
        sb=sb.append(sb);
        System.out.println(sb.capacity());
        sb=sb.append("both are OOPS");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb=sb.append("Both are good programming languages");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
 