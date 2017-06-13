package ConstructorOverloading;

public class Student
{
  public Student()                          //default constructor
  {
    System.out.println("Good morning");
  }
  public Student(String name)               //parameterized constructor with single parameter
  {
    System.out.println("Student name is " + name);
  }
 
  public Student(String course, int roll)    //parameterized constructor with two parameters
  {
    System.out.println("Course is " + course + " and roll no. is " + roll);
  }
 
  public static void main(String args[])
  {
    Student std1 = new Student();             
    Student std2 = new Student("Nitish negi");      
    Student std3 = new Student("MCA", 304);  
  }
	

	}


