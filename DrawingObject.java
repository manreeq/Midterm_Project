import java.awt.*;
import javax.swing.*;

//gawing abstract class?

public abstract class DrawingObject /*extends JComponent*/ {
    abstract void draw(Graphics2D g2d);
    
    abstract void animate(double addVelocity);
    /*
    void adjustX(double distance);
    double getX();
    */
}