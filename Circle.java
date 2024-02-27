import java.awt.*;
import java.awt.geom.*;

public class Circle implements DrawingObject {

    public void draw(Graphics2D g2d) {
        Ellipse2D.Double e
= new Ellipse2D.Double(200,75,100,100);
g2d.setColor(Color.BLUE);
g2d.fill(e);

    }
}