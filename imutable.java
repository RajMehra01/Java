class imutable 
{
    public static void main(String[] args) 
    {
     Student obj = new Student (2233,"Brijesh") ;
     System.out.println("Roll No. = "+obj.getRollNo());
     System.out.println("Name = "+obj.getName());
    }
}
final class Student 
{
    private final String name ;
    private final int RollNo ; 
    public Student(int RollNo,String name )
    {
        this.name=name ;
        this.RollNo=RollNo;
    }
    public String getName ()
    {
        return name ;
    }
    public int getRollNo() 
    {
        return RollNo;
    } 
}