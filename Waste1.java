import java.util.*;
class Waste1{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("===WASTE COLLECTION VEHICLE===");
        
        System.out.println("ENTER THE VEHICLE NUMBER");
        int vehicle = sc.nextInt();
        System.out.println("ENTER WASTED COLLECTED IN KILOS");
        double waste = sc.nextDouble();
        System.out.println("ENTER NUMBER OF POINTS COLLECTED");
        int points = sc.nextInt();
        
        String status = "ACTIVE";

        System.out.println("THE VEHICLE NUMBER IS " +vehicle);
        System.out.println("THE WASTED COLLECTED IN KILOS IS " +waste+"kg");
        System.out.println("THE NUMBER OF POINTS COLLECTED ARE " +points);
        System.out.println("THE VECHILE STATUS IS " +status);
    }
}