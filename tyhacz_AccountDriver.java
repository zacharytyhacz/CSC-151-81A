package java_app;
/**
 * @author zachary tyhacz
 */
import java.util.Scanner;

public class tyhacz_AccountDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        tyhacz_Account account1 = new tyhacz_Account("John","Doe",600.11);
        tyhacz_Account account2 = new tyhacz_Account("Hugo","Franklin",10.34);
        
        
        System.out.printf("Initial name for account1 is: %s%n",account1.getName());
        System.out.printf("Initial name for account2 is: %s%n%n",account2.getName());
        
        System.out.printf("Initial balance for %s is: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("Initial balance for %s is: $%.2f%n%n",account2.getName(), account2.getBalance());
        
        System.out.printf("Please enter new first name for %s: ",account1.getName());
        String newFirst1 = input.nextLine();
        System.out.printf("Please enter new last name for %s: ",account1.getName());
        String newLast1 = input.nextLine();
        
        System.out.printf("Please enter new first name for %s: ",account2.getName());
        String newFirst2 = input.nextLine();
        System.out.printf("Please enter new last name for %s: ",account2.getName());
        String newLast2 = input.nextLine();
        
        account1.setName(newFirst1,newLast1);
        account2.setName(newFirst2, newLast2);
        System.out.printf("Account1 name is now %s%n%n",account1.getName());
        System.out.printf("Account2 name is now %s%n%n",account2.getName());
        
        System.out.printf("Please enter a deposit amount for %s: ",account1.getName());
        double newBalance1 = input.nextDouble();
        
        
        System.out.printf("Please enter a deposit amount for %s: ",account2.getName());
        double newBalance2 = input.nextDouble();
        
        account2.deposit(newBalance2);
        account1.deposit(newBalance1);
        System.out.printf("%s's balance is now $%.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s's balance is now $%.2f%n",account2.getName(),account2.getBalance());
        
        System.out.printf("Please enter an amount less than $%.2f to withdraw from %s: ",account1.getBalance(),account1.getName());
        double withdraw1 = input.nextDouble();
        
        System.out.printf("Please enter an amount less than $%.2f to withdraw from %s: ",account2.getBalance(),account2.getName());
        double withdraw2 = input.nextDouble();
        account2.WithDraw(withdraw2);
        account1.WithDraw(withdraw1);
    }
}
