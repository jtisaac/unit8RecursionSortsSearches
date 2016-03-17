//********************************************************************
//Author: Joseph Isaac
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************
import java.awt.geom.Line2D;
import java.awt.*;
import javax.swing.JPanel;

public class TreeComponent extends JPanel
{
   private final int PANEL_WIDTH = 400;
   private final int PANEL_HEIGHT = 400;

   private final double SQ = Math.sqrt(3.0) / 6;

   private final int TOPX = 200, TOPY = 20;
   private final int LEFTX = 60, LEFTY = 300;
   private final int RIGHTX = 340, RIGHTY = 300;
   
   private double bangle = 60;
   private double bfrac = 0.6;
   
   private int current; //current order

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public TreeComponent (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void branch (Graphics2D g2, Double x, Double y, Double length, Double angle, int order)
   {
     //g2.draw(Line2D.Double() line = new Line2D.Double());
       double angle1 = angle + bangle;
       double angle2 = angle - bangle;
       double angle3 = angle + 180;
       length = length * bfrac;
       
       double endX1 = (x - length*Math.sin(Math.toRadians(angle1)));
       double endY1 = (y - length*Math.cos(Math.toRadians(angle1)));
       double endX2 = (x - length*Math.sin(Math.toRadians(angle2)));
       double endY2 = (y - length*Math.cos(Math.toRadians(angle2)));
       double endX3 = (x - length*Math.sin(Math.toRadians(angle3)));
       double endY3 = (y - length*Math.cos(Math.toRadians(angle3)));
       
       g2.draw(new Line2D.Double(x,y,endX1,endY1));
       g2.draw(new Line2D.Double(x,y,endX2,endY2));
       g2.draw(new Line2D.Double(x,y,endX3,endY3));
      if (order == 1)
         g2.draw(new Line2D.Double(x,y,x,y-length));
      else
      {
         

         branch (g2, endX1, endY1, length, angle1, order-1 );
         branch (g2, endX2, endY2, length, angle2, order-1 );
         //branch (g2, endX3, endY3, length, angle3, order-1 );
      }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);
      Graphics2D g2 = (Graphics2D) page;
      page.setColor (Color.green);
      branch(g2, 200.0,300.0,100.0,30.0,10);
      

      //drawFractal (current, TOPX, TOPY, LEFTX, LEFTY, page);
      //drawFractal (current, LEFTX, LEFTY, RIGHTX, RIGHTY, page);
      //drawFractal (current, RIGHTX, RIGHTY, TOPX, TOPY, page);
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}