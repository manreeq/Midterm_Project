import java.awt.*;
import java.awt.geom.*;

//done

public class Ellipse extends DrawingObject {

    private double x, y, width, height;
    private Color color;

    public Ellipse(double x, double y, double w, double h, Color c) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        color = c;
    }

    public void draw(Graphics2D g2d) {
        Ellipse2D.Double c = new Ellipse2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(c);
    }

    public void animate(double addVelocity, int tick) {}
}