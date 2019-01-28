import java.util.Scanner;
/**
 * @author zachary tyhacz
 */
public class tyhacz_salary_calculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double temp_earnings;
        int temp_count;
        int[] gross_sales = new int[11];
        
        System.out.println("Enter the gross sales of each of the 10 salespersons...");
        
        for(int i = 1; i < 11; i++ )
        {
            System.out.printf("%d. Enter gross sales: ",i);
            gross_sales[i] = input.nextInt();
            System.out.println(gross_sales[i]*0.09+200);
        }
        System.out.println();
        System.out.println(":Salary Ranges:");
        System.out.println("_______________");
        for(int i = 2; i < 11; i++){
            temp_count = 0;
            for(int j = 1; j < 11; j++){
                if( i != 10){
                    if((gross_sales[j]*0.09+200) >= i*100 && (gross_sales[j]*0.09+200) <= i*100+99){
                        temp_count++;
                    }
                }
                else{
                    if((gross_sales[j]*0.09+200) >= i*100){
                        temp_count++;
                    }
                }
            }
            
            if( i == 10){
                System.out.printf("   >$%d:",i*100);
                if(temp_count != 0){
                    for(int k = 0; k < temp_count; k++){
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            
            else{
                System.out.printf("$%d-$%d:",i*100,i*100+99);
                if(temp_count != 0){
                    for(int k = 0; k < temp_count; k++){
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }   
    } 
}
