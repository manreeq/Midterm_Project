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
 * This is the class used to create the basic circle shape. This class is called in the composite Person class.
 */
public class Circle implements DrawingObject {

    private double x, y, size;
    private Color color;

    /**
     * Constructor method uses parameters of the starting x and y coordinates, and the size and color of the circle
     * @param x
     * @param y
     * @param s
     * @param c
     */
    public Circle(double x, double y, double s, Color c) {
        this.x = x;
        this.y = y;
        size = s;
        color = c;
    }

    /**
     * This method draws an elipse with the given parameters, with equal distance to endpoints creating a circle
     */
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double c = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(c);
    }

    /**
     * Animate method left empty since not used (part of interface)
     */
    public void animate(double speed, int tick) {}

}