import javax.swing.*;
import java.awt.*;

public class PayView extends JPanel{
   
   private String Sentence_1;
   private String Sentence_2;
   private String Sentence_3;
   private String Sentence_4;
   private int x_position;
   private int y_position;
   
   public PayView(String s1, String s2, String s3, String s4){
      Sentence_1=s1;
      Sentence_2=s2;
      Sentence_3=s3;
      Sentence_4=s4;
      int width=350;
      int height=200;
      x_position=10;
      y_position=30;
      JFrame frame=new JFrame();
      frame.getContentPane().add(this);
      frame.setTitle("Payroll");
      frame.setSize(width, height);
      frame.setVisible(true);
   }
      
   public void paintComponent(Graphics g){
      g.setColor(Color.black);
      g.drawString(Sentence_1,x_position,y_position);
      g.drawString(Sentence_2,x_position,y_position*2);
      g.drawString(Sentence_3,x_position,y_position*3);
      g.drawString(Sentence_4,x_position,y_position*4);
   }
}
