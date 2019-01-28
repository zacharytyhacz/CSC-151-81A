package java_app;
import java.util.Scanner;
/**
 * @author zachary tyhacz
 */

public class tyhacz_payroll {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tmp_name;
        double tmp_payrate;
        double tmp_hours;
        tyhacz_payroll_employee Employee;
        int x = 0;
        while( x < 4){           
            System.out.println();
            System.out.print("Enter the name of the employee you want to pay: ");
            tmp_name = input.nextLine();
            System.out.printf("Enter the current payrate for %s: ",tmp_name);
            tmp_payrate = input.nextDouble();
            System.out.printf("Enter this pay period's hours for %s: ",tmp_name);
            tmp_hours = input.nextDouble();
            
            Employee = new tyhacz_payroll_employee(tmp_name,tmp_payrate,tmp_hours);
            System.out.printf("%s's overtime for this pay period is: %.2f%n",Employee.GetName(),Employee.GetOT());
            System.out.printf("%s's payment for this pay period is: $%.2f%n",Employee.GetName(),Employee.GetWeekPay());
            input.nextLine();
            x++;
        }
        
        
        
    }
    
}
