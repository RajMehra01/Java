class stringclass 
{
    public static void main(String[] args) 
    {
        String s1="Hello";
        String s2="Hello";
        String s3="Hel"+"lo";
        String s4=("Hello");
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        System.out.println("s4="+s4);
        System.out.println("s1==s2 "+(s1==s2));//reference
        System.out.println("s1==s3 "+(s1==s3));//reference
        System.out.println("s2==s3 "+(s2==s3));//reference
        System.out.println("s1==s4 "+(s1==s4));//reference
        System.out.println("s1.equals(s2) "+s1.equals(s2));//contents
        System.out.println("s1.equals(s3) "+s1.equals(s3));//contents
        System.out.println("s2.equals(s3) "+s1.equals(s3));//contents
        System.out.println("s1.equals(s4) "+s1.equals(s4));//contents
    }
}