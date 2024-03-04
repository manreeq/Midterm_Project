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
 * This is the class to creat the background shape. It makes use of GradientPaint to create the gradient.
 */
public class Background implements DrawingObject {
    
    private float x1, y1, x2, y2;
    private Color color1, color2;

    public Background(float x1, float y1, Color c1, float x2, float y2, Color c2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        color1 = c1;
        color2 = c2;

        
    }

    /**
     * This method makes use of the java awt GradientPaint method in order to create the gradient of the
     * sky background, and creates a rectangle shape with this color.
     */
    public void draw(Graphics2D g2d) {
        GradientPaint g = new GradientPaint((x2/2), y1, color1, (x2/2), y2, color2);
        Rectangle2D.Double bgShape = new Rectangle2D.Double(x1, y1, x2-x1, y2-y1);
        g2d.setPaint(g);
        g2d.fill(bgShape);

    }

    /**
     * Animate method left empty since not used (part of interface)
     */
    public void animate(double speed, int tick) {}

}
