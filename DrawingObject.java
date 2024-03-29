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
 * This is the interface used for all shapes. It contains the draw and animate methods to be called within these classes. 
 */
public interface DrawingObject {
    /**
     * Draws the object. 
     * @param g2d
     */
    abstract void draw(Graphics2D g2d);
    
    /**
     * Animates the object. 
     * @param speed
     * @param tick
     */
    abstract void animate(double speed, int tick);
}