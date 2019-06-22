
package student;

import java.util.Scanner;

public class PHD extends PG{
    String Topic,Supervisor;
    Scanner input=new Scanner(System.in);
    public void readData(){
        Topic=input.nextLine();
        Supervisor=input.nextLine();
    }
    public void printData(){
        System.out.println("Topic : "+Topic);
        System.out.println("Supervisor : "+Supervisor);
    }
}
