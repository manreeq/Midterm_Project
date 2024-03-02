import java.awt.*;
import java.awt.geom.*;

//done

public class Rectangle extends DrawingObject {

    private double x, y, width, height;
    private Color color;

    public Rectangle(double x, double y, double w, double h, Color c) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        color = c;
    }

    public void draw(Graphics2D g2d) {
        Rectangle2D.Double sq = new Rectangle2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(sq);
    }

    public void animate(double addVelocity) {}

}