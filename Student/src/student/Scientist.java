
package student;

import java.util.Scanner;

public class Scientist extends PG{
    String Area;
    Scanner input=new Scanner(System.in);
    public void readData(){
        Area=input.nextLine();
    }
    public void printData(){
        System.out.println("Area : "+Area);
    }
}
