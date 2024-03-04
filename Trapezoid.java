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

/**
 * This is the class to create the composite Trapezoid shape. Makes use of the basic Rectangle and RTriangle shapes. 
 */
public class Trapezoid implements DrawingObject {

    private double x, y, width, height;
    private Color color;

    /**
     * Constructor method creates a trapezoid object with parameters starting coordinates, width, height,
     * and color
     * @param x
     * @param y
     * @param w
     * @param h
     * @param c
     */
    public Trapezoid(double x, double y, double w, double h, Color c) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        color = c;
    }

    /**
     * Draw method uses Rectangle and RTriangle objects to create a trapezoid using the given parameters.
     */
    public void draw(Graphics2D g2d) {
        Rectangle middle = new Rectangle(x, y - height, width, height, color);
        middle.draw(g2d);

        RTriangle left = new RTriangle(x, y, -(width/5), height, color);
        left.draw(g2d);
        
        RTriangle right = new RTriangle(x + width, y, width/5, height, color);
        right.draw(g2d);
    }

    /**
     * Animate method left empty since not used (part of interface)
     */
    public void animate(double speed, int tick) {}

}