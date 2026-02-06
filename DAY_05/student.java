/*1. Student Details Program
Create a class Student with non-static variables name, rollNo, and marks.
Use a constructor to initialize the values and display student details using an object.*/
 class student
{
  class Student {
    
    String name;
    int rollNo;
    static int totalStudents = 0;
}


Student s1 = new Student();
s1.name = "Gurudev Kini";    
s1.rollNo = 101;

Student s2 = new Student();
s2.name = "hafeez";     
s2.rollNo = 102;

System.out.println(s1.name); 
System.out.println(s2.name);  
System.out.println(Student.totalStudents);  
}
