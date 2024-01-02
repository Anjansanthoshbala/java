//Program to implement the concept of dynamic method dispatch.
class Student 
{
    int maxRollNo = 582
    ;
}
class SchoolStudent extends Student
{
    int maxRollNo = 80;
}
class CollegeStudent extends SchoolStudent
{
    int maxRollNo = 700;
}
public class DynamicMethodDispatch
{
    public static void main(String args[])
    {
        Student obj1 = new CollegeStudent();
        Student obj2 = new SchoolStudent();
        
        System.out.println(obj1.maxRollNo);
        System.out.println(obj2.maxRollNo);
    }
}
