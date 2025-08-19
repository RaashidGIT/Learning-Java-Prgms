/*
Aim of the Program:
-------------------
To draw an oval and a triangle using Java Applet graphics.

Program Explanation:
--------------------
- An oval is drawn using the drawOval() method.
- Three lines are drawn using the drawLine() method to form a triangular shape below the oval.
*/

import java.applet.Applet;
import java.awt.Graphics;

public class Drawcirc extends Applet {
    
    // paint() method is called whenever the applet needs to be redrawn
    public void paint(Graphics g) {
        
        // Draw an oval with top-left corner (20,20), width=200, height=120
        g.drawOval(20, 20, 200, 120);
        
        // Draw a vertical line from (180,150) to (180,370)
        g.drawLine(180, 150, 180, 370);
        
        // Draw a slanted line from (180,150) to (440,370)
        g.drawLine(180, 150, 440, 370);
        
        // Draw a base line from (180,370) to (440,370)
        g.drawLine(180, 370, 440, 370);
    }
}

/*
Simulated Output:
-----------------
- An oval shape will appear at the top.
- A triangle-like figure (made using 3 lines) will appear below the oval.

         _________
       /           \
      |             |
       \___________/

           /\
          /  \
         /____\
*/
