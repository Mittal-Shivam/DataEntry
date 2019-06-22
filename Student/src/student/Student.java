
package student;

import java.util.Scanner;

public class Student {
    public String Name;
    public int Rollno;
    public String Course;
    public String Department;
    Scanner input=new Scanner(System.in);
    public  void readData(){
        Name=input.nextLine();
        Rollno=input.nextInt();
        Course=input.nextLine();
        Department=input.nextLine();
    }
    public  void printData(){
        System.out.println("Student name: "+Name);
        System.out.println("Rollno: "+Rollno);
        System.out.println("Course name: "+Course);
        System.out.println("department name: "+Department);
    }
}