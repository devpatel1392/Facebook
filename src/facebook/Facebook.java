// This is the Facebook class
// Dr. Xiaolin Hu
// 03/05/2015
package facebook;

import java.awt.*;

public class Facebook{

   private String name;
   private String content;
   private Graphics g;
   private int x;
   private int y;

   public Facebook(String nm, DrawingPanel a, int column, int row){
       content = "undefined";
       name = nm;
       x = column;
       y = row;
       g = a.getGraphics();
       g.drawRect(25 + (x * 225), 25 + (y * 175), 200, 150);
       g.drawString(name + "'s mood is undefined.", 50 + (x * 225),100 + (y * 175));
   }
   public void removeContent() {
		g.setColor(Color.white);
		g.fillRect(24 + (x * 225), 20 + (y * 175), 203, 157);
   }
   
  public void setContent(String newContent) {
		content = newContent;
		if (content.equals("happy")) {
			g.setColor(Color.red);
			g.fillRect(25 + (x * 225), 25 + (y * 175), 200, 150);
			g.setColor(Color.black);
			g.drawRect(25 + (x * 225), 25 + (y * 175), 200, 150);
			g.drawString(name + "'s mood is:" + content, 50 + (x * 225), 100 + (y * 175));
		} else if (content.equals("sad")) {
			g.setColor(Color.green);
			g.fillRect(25 + (x * 225), 25 + (y * 175), 200, 150);
			g.setColor(Color.black);
			g.drawRect(25 + (x * 225), 25 + (y * 175), 200, 150);
			g.drawString(name + "'s mood is:" + content, 50 + (x * 225), 100 + (y * 175));
		} else {
			g.setColor(Color.white);
			g.fillRect(25 + (x * 225), 25 + (y * 175), 200, 150);
			g.setColor(Color.black);
			g.drawRect(25 + (x * 225), 25 + (y * 175), 200, 150);
			g.drawString(name + "'s mood is:" + content, 50 + (x * 225), 100 + (y * 175));
		}
	}
  
}

   


