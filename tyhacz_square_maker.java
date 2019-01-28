package java_app;
import java.util.Scanner;
/**
 * @author zachary tyhacz
 */
public class tyhacz_square_maker {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int in_width = 0;
        int x = 1;
        String in_char;
        while(x == 1)
        {
            System.out.print("Enter square width:" );
            in_width = input.nextInt();
            input.nextLine();
            System.out.print("Enter a character: ");
            in_char = input.nextLine();
            
            MakeSquare(in_width-1,in_char);  
        }       
    }
    
    private static void MakeSquare(int width,String in_char)
    {
        int row = 0;
        int column = 0;
        System.out.println();
        while(row <= width)
        {
            column = 0; // reset column position
            if(row == width || row == 0) // first and last rows
            {
                while(column <= width)
                { // until the last column 
                    System.out.print(in_char); // fill with * 
                    column++;           // next column 
                }
                System.out.print("\n"); // when columns reach width, end row
                row++;                  // next row
            }
            else 
            { // middle rows *      *
                while(column <= width)
                {
                    if(column == 0 || column == width)
                    { // first and last columns
                        System.out.print(in_char);
                        if(column == width)
                        { // width means last column
                            row++;          // go to next row 
                            System.out.print("\n"); // and end line
                        }
                        column++; // next column
                    }
                    else
                    { // midle columns
                        System.out.print(" ");
                        column++;
                    }
                }
            }            
        }
        System.out.println();
    }
    
}
