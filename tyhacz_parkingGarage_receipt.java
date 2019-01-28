package java_app;
import java.security.SecureRandom;
// 1 + randomNumbers.nextInt(6);
/**
 * @author zachary tyhacz
 */
public class tyhacz_parkingGarage_receipt
{
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static double total_charges;
    public static void main(String[] args)
    {
        double hoursparked = 100*randomNumbers.nextDouble();
        System.out.println("______________________");
        System.out.println("PARKING GARAGE RECEIPT");
        System.out.println("----------------------");
        
        System.out.println("First 3 hours - $2.00");
        System.out.println("After 3 hours - $0.50 per hour");
        System.out.println("24 hour charge - $10.00");
        System.out.println("----------------------");
        System.out.printf("Hours Parked: %.2f%n",hoursparked);
        CalculateCharges(hoursparked);
        System.out.println("______________________");
        System.out.printf("Total Charge: $%.2f%n",total_charges);
    }
    
    private static void CalculateCharges(double hours)
    {
        double ad_hours = 0;
        double i = 0;
               
        if(hours < 24.00) // for less than 24 hours fee
        {
            if(hours <= 3.00) // if lets than three hours, flat fee of 2 bucks 
            {
                System.out.println("First 3 Hours: $2.00");
                total_charges += 2.00;
            }
                
            else // if over 3 hours,
            {
                // an hour is a full hour, so floor the additional hours.
                ad_hours = Math.floor(hours - 3.00);  // additional hours the hours after the first three hours 
                // add two bucks for the first three hours 
                System.out.println("First 3 Hours: $2.00"); 
                total_charges += 2.00;
                
                
                System.out.printf("Additional Hours: %.2f%n",ad_hours); // show the full hours
                System.out.printf("Additional Charges: $%.2f%n",ad_hours*0.5); // charge for each hour,0.50 an hour
                total_charges += ad_hours*0.5;
            }
        }
        else // for more than day, calculate how many days are in hours, then calculate the last-non full day.
        {            
            for(i = 0;i < Math.floor(hours/24);i++) // for each full day in the hours ( count how man times 24 goes into the hours fully)
            {
                System.out.println("24 Hour Charge: $10.00"); // 24 hour charge is $10
                total_charges += 10.00;
            }
            // additional hours for the last day are calculated as:
            // total hours minus the amount of full days(24 hours)
            ad_hours = Math.floor( hours - (Math.floor(hours/24) * 24) ); // floor it to take out decimals, only want ful hours
            
            // calculate as if less than 24 hours, 
            if(ad_hours <= 3.00)
            {
                System.out.println("First 3 Hours: $2.00"); // first three hours of the day is 2$
                total_charges += 2.00;
            }

            else
            {
                System.out.println("First 3 Hours: $2.00");
                total_charges += 2.00;
                System.out.printf("Additional Hours: %.2f%n",ad_hours);
                System.out.printf("Additional Charges: $%.2f%n",(ad_hours-3)*0.5); // subtract by three, because the first three hours are already charged
                total_charges += (ad_hours-3)*0.5;
            }
        }
            
    }
    
}
