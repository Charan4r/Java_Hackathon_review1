import java.util.*;
public class Waste2 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT OF WASTE COLLECTED IN KG");
        double waste = sc.nextDouble();

        if(waste>=100){
            System.out.println("THE AMOUNT OF WASTED COLLECT IS" +waste+"kg");
            System.out.println("Collection Target Achieved");
        }else{
            System.err.println("THE AMOUNT OF WASTE COLLECTED IS" +waste+"kg");
            System.out.println("More Waste Collection Required");
        }
    }
}
