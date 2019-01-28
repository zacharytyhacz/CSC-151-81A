package java_app;

/**
 *
 * @author zachary tyhacz
 */
public class tyhacz_payroll_employee {
    private String name = "";
    private double PayRate = 0.0;
    private double Hours = 0.0;
    private double OTHours = 0.0;
    
    public tyhacz_payroll_employee(String inName,double inPR,double inHR){
        name = inName;
        PayRate = inPR;
        Hours = inHR;
        if(Hours > 40.0)  {
            OTHours = Hours-40;
            Hours = Hours - OTHours;
        }
    }
    public double GetOT(){
        if(OTHours != 0.0)
            return OTHours;

        else{
            System.out.printf("No over time for %s",name);
            return 0.0;
        }
    }
    
    public String GetName()
    {
        return name;
    }

    public double GetWeekPay(){
        return (Hours*PayRate)+(OTHours*(PayRate*1.5));
    }
}
