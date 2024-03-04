/**
    This is a template for a Java file.
    @author Evan Sebastian M. Garcia (232776)
    @author Gabriel P. Hermosura (233070)
    @version March 4, 2024
**/

/*
    I have not discussed the Java language code in my program
    with anyone other than my instructor or the teaching assistants
    assigned to this course.

    I have not used Java language code obtained from another student,
    or any other unauthorized source, either modified or unmodified.
    
    If any Java language code or documentation used in my program
    was obtained from another source, such as a textbook or website,
    that has been clearly noted with a proper citation in the comments
    of my program.
*/

import java.awt.*;
import java.awt.geom.*;

/**
 * This is the class for the basic line shape. This is used to make the lights. 
 */
public class Line implements DrawingObject {

    private double xs, xy, xe, ye, rotate;
    private int thickness;
    private Color color;

    public Line(int xs, int xy, int xe, int ye, int t, Color c) {
        this.xs = xs;
        this.xy = xy;
        this.xe = xe;
        this.ye = ye;
        thickness = t;
        color = c;
        rotate = 0;
    }

    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();
        Line2D.Double l = new Line2D.Double(xs, xy, xe, ye);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.rotate(Math.toRadians(rotate), xs, xy);
        g2d.draw(l);
        g2d.setTransform(reset);
    }

    public void animate(double speed, int tick) {
        if (xs > xe) rotate = 10 * Math.sin(tick/speed);
        else rotate = -10 * Math.sin(tick/speed);
    }

    
}