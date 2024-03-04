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


public class Person extends DrawingObject{
    
    private double x, y, width, height, tempy;
    private Color color;

    public Person(double x, double y, double h, Color c) {
        this.x = x;
        this.y = y;
        width = h/3;
        height = h;
        color = c;
        tempy = y;
    }

    public void draw(Graphics2D g2d) {
        Circle head = new Circle(x, y + (height/10), width, color);
        head.draw(g2d);
        
        Ellipse body = new Ellipse(x, y + width, width, height, color);
        body.draw(g2d);
    }

    public void animate(double speed, int tick) {
        y = 5 * Math.sin(tick/speed) + tempy;
    }
   
}
