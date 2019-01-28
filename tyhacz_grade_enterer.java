package java_app;
import java.util.Scanner;
/**
 * @author zachary tyhacz
 */
public class tyhacz_grade_enterer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        double principal = 1000.0;
        double rate = 0.05;
        
        int x = 1;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        
        int total = 0;
        int gradeCounter = 0;
        
        System.out.printf("%s%n%s%n","~~~~#GRADE ENTERER#~~~~","Type <Ctrl> z then press enter to finish.");
        while(!input.nextLine().contains("exit")){
            System.out.print("Enter a grade: ");
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;
            
            switch (grade/10){
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
            if(gradeCounter != 0)
            {
                double average = (double)total/gradeCounter;
            
                System.out.printf("Total grades entered: %d",gradeCounter);
                System.out.printf("Class grade average: %d",average);
                System.out.printf("%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d",
                        "A Grades:",aCount,
                        "B Grades:",bCount,
                        "C Grades:",cCount,
                        "D Grades:",dCount,
                        "F Grades:",fCount);
            }
            else
            {
                System.out.println("No grades were entered!");
            }
        }
        
        do{
            System.out.printf("%d ",x);
            ++x;
        }while(x<1);
        System.out.println();
        
        
        System.out.printf("%s%20s%n","Year","Amount on deposit");
        for(int year = 1;year <= 10;++year)
        {
            double amount = principal * Math.pow(1.0+rate, year);
            
            System.out.printf("%4d $%,20.2f%n",year,amount);
        }
        System.out.println();
        while(counter <= 10){
            System.out.printf("%d ",counter);
            ++counter;
        }
        System.out.println();
        for (int i = 20; i >= 2;i-=2){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    
}
