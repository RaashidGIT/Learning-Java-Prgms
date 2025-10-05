/* Aim of the Program:- To draw an oval and a triangle using Java Applet graphics. */

import java.applet.Applet;
import java.awt.Graphics;

public class Drawcirc extends Applet {
    public void paint(Graphics g) {
        g.drawOval(20, 20, 200, 120);
        g.drawLine(180, 150, 180, 370);
        g.drawLine(180, 150, 440, 370);
        g.drawLine(180, 370, 440, 370);
    }
}
