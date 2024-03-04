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
 * This is the class for the basic Elipse shape. This shape is called in the composite Person class. 
 */
public class Ellipse implements DrawingObject {

    private double x, y, width, height;
    private Color color;

    /**
     * Constructor method creates an alipse using the given parameters: starting x and y coordinates, 
     *  width, height, and color.
     * @param x
     * @param y
     * @param w
     * @param h
     * @param c
     */
    public Ellipse(double x, double y, double w, double h, Color c) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        color = c;
    }

    /**
     * Draw method creates an elipse object using the given parameters
     */
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double c = new Ellipse2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(c);
    }

    /**
     * Animate method left empty since not used (part of interface)
     */
    public void animate(double speed, int tick) {}
}