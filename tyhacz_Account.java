package java_app;

public class tyhacz_Account {
    private String first;
    private String last;    
    private double balance;
    
    public Account(String new_first,String new_last, double balance){
        first = new_first;
        last = new_last;
        
        if(balance > 0.0)
            this.balance = balance;
        else
            System.out.println("Invalid balance.");
    }
    
    public void setName(String new_first, String new_last){
        first = new_first;
        last = new_last;
    }
    
    public String getName(){
        return first+" "+last;
    }
    
    public void deposit(double deposit){
        if(deposit > 0.0)
            balance += deposit;
        else
            System.out.println("Invalid deposit.");
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void WithDraw(double amount){
        if(amount >= balance){
            System.out.printf("Withdraw amount exceedes balance of %.2f%n",balance);
        }
        else{
            balance = balance - amount;
            System.out.printf("%s's balance is now %.2f%n",getName(),balance);
        }
    }
}
