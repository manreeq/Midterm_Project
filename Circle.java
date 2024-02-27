import java.awt.*;
import java.awt.geom.*;

//done

public class Circle implements DrawingObject {

    private double x, y, size;
    private Color color;

    public Circle(double x, double y, double s, Color c) {
        this.x = x;
        this.y = y;
        size = s;
        color = c;
    }

    public void draw(Graphics2D g2d) {
        Ellipse2D.Double c = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(c);
    }

}