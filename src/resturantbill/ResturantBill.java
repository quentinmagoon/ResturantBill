/*
 * ResturantBill.java
 * Quentin Magoon
 * 
 */

package resturantbill;

/**
 *
 * @author qumag7758
 */
public class ResturantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        double cost;
        cost = 145;
        double tax;
        tax = 0.13;
        double total;
        double hst;
        
        hst = cost * tax;
        total = cost + hst;
        
        System.out.println("Resturant Bill");
        System.out.println("**************");
        System.out.println("             ");
        System.out.println("Cost:     $" + cost);
        System.out.println("hst:      $" + hst);
        System.out.println("Total:    $" + total);
        
        //int myNumberRounded;
       // double myNumber =15.6;
       // myNumber *=10;
       // myNumber +=5;
       // myNumber /=10;
       // myNumberRounded =(int) (myNumber);
        
        
       
    }
    
}
