package java_app;
import java.util.Scanner;
/*
 * @author zachary tyhacz
 */
public class tyhacz_temp_calculator 
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       double in_temp;
       double final_temp;
       int in_letter;
       int x = 0;
       
       while(x == 0)
       {
           System.out.println("1. C to F");
           System.out.println("2. F to C");
           System.out.print("Enter a conversion method: ");
           in_letter = input.nextInt();

           switch (in_letter)
           {
                case 1:
                    System.out.print("Enter a temperature to convert: ");
                    in_temp = input.nextDouble();
                    final_temp = (9/5) * in_temp + 32;
                    System.out.printf("%.2f in fahrenheit is %.2f.%n", in_temp,final_temp);
                case 2:
                    System.out.print("Enter a temperature to convert: ");
                    in_temp = input.nextDouble();
                    final_temp = (5/9)*(in_temp -32);
                    System.out.printf("%.2f in celsius is %.2f.%n", in_temp,final_temp);
                default:
                    System.out.println("Try again...");
           }
           
       }
       
    }
    
}
