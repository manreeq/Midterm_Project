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
 * This is the class for the basic Right Triangle shape. This is called in the composite Trapezoid shape. 
 */
public class RTriangle implements DrawingObject {

    private double x, y, width, height;
    private Color color;

    /**
     * Constructor method creates a right triangle object with parameters starting coordinates, width, height,
     * and color
     * @param x
     * @param y
     * @param w
     * @param h
     * @param c
     */
    public RTriangle(double x, double y, double w, double h, Color c){
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        color = c;
    }

    /**
     * Draw method draws a right triangle using the path method, following the given parameters
     */
    public void draw(Graphics2D g2d) {
        Path2D.Double t = new Path2D.Double();

        t.moveTo(x, y);
        t.lineTo(x + width, y);
        t.lineTo(x, y - height);
        t.closePath();
        g2d.setColor(color);
        g2d.fill(t);

    }

    /**
     * Animate method left empty since not used (part of interface)
     */
    public void animate(double speed, int tick) {}
 
}