import java.awt.*;
import javax.swing.*;

//gawing abstract class?

public interface DrawingObject /*extends JComponent*/ {
    void draw(Graphics2D g2d);
    /*
    void adjustX(double distance);
    double getX();
    */
}