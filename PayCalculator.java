/**Klasa permban metodat e nevojshme per llogaritjen e pages*/
public class PayCalculator{
   private int hoursWorked;//oret me rate pagese normale
   private int hourPayrate;//rata e pageses
   private int overtimeHours;//oret shtese
   private double cash;//parate totale
   
   /*ben inicializimin e variablave*/
   public PayCalculator(int hrs, int pay){
      cash = 0;
      hoursWorked = hrs;
      hourPayrate = pay;
      if(hoursWorked > 40){    //nese oret e punuara jane mbi 40, i kthen ato ne 40 pasi oret tjera kane rate tjeter te pageses
         overtimeHours = hoursWorked - 40;
         hoursWorked = 40;
      }else
         overtimeHours = 0;
   }
   
   public double grossPay(){
      cash = (hoursWorked * hourPayrate) + (overtimeHours * (hourPayrate * 1.5));
      return cash;
   }
   
   public double retirementDeduction(){
      double retirementCash = 0.05 * cash;
      return retirementCash;
   }
   
   public double taxDeduction(){
      double taxes;
      if(hoursWorked <= 30){
         taxes = 0.2 * cash;
      }else if((hoursWorked + overtimeHours) <= 40){
         taxes = 0.25 * cash;
      }else
         taxes = 0.28 * cash;
      return taxes;
   }
}
