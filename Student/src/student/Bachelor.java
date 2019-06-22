
package student;

import java.util.*;

public class Bachelor extends UG {
    Scanner input=new Scanner(System.in);
    String Branch,College;
    public void readData(){
        Branch=input.nextLine();
        College=input.nextLine();
    }
    public void printData(){
        System.out.println("Branch name: "+ Branch);
        System.out.println("College name: "+ College);
    }
}
