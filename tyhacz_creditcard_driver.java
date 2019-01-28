package java_app;

/**
 * @author zachary tyhacz
 */
import java.util.Scanner;
public class tyhacz_creditcard_driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String in_name = "";
        System.out.print("Enter the name of the customer you want to check: ");
        in_name = input.nextLine();
        tyhacz_creditcard_customer customer = new tyhacz_creditcard_customer(in_name);
        customer.GetInfo();
        System.out.println();
        customer.CheckCreditLimit();
        customer.CheckOverDraft();
    }
    
}
