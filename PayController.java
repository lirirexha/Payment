import javax.swing.*;
import java.text.*;

public class PayController{
   public static void main(String[] args){
      DecimalFormat f = new DecimalFormat("0.00");
      int hours = new Integer(JOptionPane.showInputDialog("How many hours did you work this week?")).intValue();
      int payrate = new Integer(JOptionPane.showInputDialog("What is your hourly payrate?")).intValue();
      PayCalculator c = new PayCalculator(hours, payrate);
      double grossCash = c.grossPay();
      double retirement = c.retirementDeduction();
      double tax = c.taxDeduction();
      double netCash = grossCash - (retirement + tax);
      String s1="Your gross pay this week was: $" + f.format(grossCash);
      String s2="Of which: $" + f.format(tax) + " is taxes,";
      String s3=" $" + f.format(retirement) + " goes to your retirement fund,";
      String s4="Leaving you with: $" + f.format(netCash) + " of net pay.";
      new PayView(s1, s2, s3, s4);
   }
}
