
package student;

import java.util.Scanner;

public class Master extends PG {
    String Specialization,Project;
    Scanner input=new Scanner(System.in);
    public void readData(){
        Specialization=input.nextLine();
        Project=input.nextLine();
    }
    public void printData(){
        System.out.println("Specialization : "+ Specialization);
        System.out.println("project name: "+ Project);   
    }

}
