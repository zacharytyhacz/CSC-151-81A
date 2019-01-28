package java_app;
import java.util.Random;
/**
 *
 * @author zachary tyhacz
 */
public class tyhacz_creditcard_customer {
    Random r = new Random();
    
    private int AccNumber;
    private String AccName;
    private double StartBalance;
    private double TotalCharges;
    private double TotalCreditCharges;
    private double CreditLimit;
    
    public tyhacz_creditcard_customer(String name){
        AccName = name;
        AccNumber = r.nextInt(Integer.MAX_VALUE);
        StartBalance = 2000.0*r.nextDouble();           
        TotalCreditCharges = 1500.0*r.nextDouble();
        TotalCharges = 1400.0*r.nextDouble() + TotalCreditCharges;
        CreditLimit = 1200.0*r.nextDouble();
        /*System.out.println(AccNumber);
        System.out.println(StartBalance);
        System.out.println(TotalCreditCharges);
        System.out.println(TotalCharges);
        System.out.println(CreditLimit);*/

    }
    
    public void GetInfo(){
        System.out.printf("%s's account number: #%s%n",AccName,AccNumber);
        System.out.printf("%s's start balance: $%.2f%n",AccName,StartBalance);
        System.out.printf("%s's credit limit: $%.2f%n",AccName,CreditLimit);
        System.out.printf("%s's total credit charges: -$%.2f%n",AccName,TotalCreditCharges);
        System.out.printf("%s's total overall charges: -$%.2f%n",AccName,TotalCharges);
        
    }
    
    public void CheckCreditLimit(){
        if(TotalCreditCharges > CreditLimit)
            System.out.printf("%s's credit limit has been exceeded by $%.2f!%n", AccName,TotalCreditCharges-CreditLimit);
        else
            System.out.printf("%s's credit limit has not been exceeded.%n",AccName);
    }
    
    public void CheckOverDraft(){
        if(TotalCharges > StartBalance)
            System.out.printf("%s's account has been overdrafted by $%.2f!%n",AccName,TotalCharges-StartBalance);
        else
            System.out.printf("%s's current balance: $%.2f%n", AccName,StartBalance-TotalCharges);
    }
}
   
