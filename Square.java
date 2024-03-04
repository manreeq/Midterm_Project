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
 * This is the class to create the basic square shape. This shape is used to create simple stage designs.
 */
public class Square implements DrawingObject {

    private double x, y, size;
    private Color color;

    /**
     * Constructor method creates a square with paramters starting coordinates, size, and color.
     * @param x
     * @param y
     * @param s
     * @param c
     */
    public Square(double x, double y, double s, Color c) {
        this.x = x;
        this.y = y;
        size = s;
        color = c;
    }

    /**
     * Draw method creates a rectangle with equal height and width (identified in parameters) to create a square.
     */
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double sq = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(sq);
    }

    /**
     * Animate method left empty since not used (part of interface)
     */
    public void animate(double speed, int tick) {}

}