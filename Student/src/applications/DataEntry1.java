package applications;
import java.util.*;
import student.*;

public class DataEntry1 {

    public static void main(String[] args) {
        int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of records");
        temp=s.nextInt(); //number of records
        Student obj[]=new Student[temp]; //number of students in the records
        for(int i=0;i<temp;i++){
            obj[i].readData();
        }
        
        
        
        
    }

}
