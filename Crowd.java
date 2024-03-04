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
 * This is the class to create the composite crowd shape. It uses several Person objects.
 */
public class Crowd implements DrawingObject {
 
    private double x, y, height, tempy;
    private Color color;

    /**
     * Constructor methood creating the composite crowd shape; a row of Person objects with parameters of
     * starting x and y coordinates, height of the persons, and color
     * @param x
     * @param y
     * @param h
     * @param c
     */
    public Crowd(double x, double y, double h, Color c) {
        this.x = x;
        this.y = y;
        tempy = y;
        height = h;
        color = c;
    }

    /**
     * Draw method creates a row of Person objects with spaces in between them using the given parameters
     */
    public void draw(Graphics2D g2d) {
        for (int i = 0; i <= 800; i += height/3) {
            Person person = new Person(x + (i + i/2), y, height, color);
            person.draw(g2d);
        }
    }

    /**
     * Animate method uses a sin function of the time (timer tick), wherin the y value of the
     * object oscillates up and down
     */
    public void animate(double speed, int tick) {
        y = 20 * Math.sin(tick/speed) + tempy;
    }

}