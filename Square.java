import java.awt.*;
import java.awt.geom.*;

public class Square implements DrawingObject {

    private double x, y, size;
    private Color color;

    public Square(double x, double y, double s, Color c) {
        this.x = x;
        this.y = y;
        size = s;
        color = c;
    }

    public void draw(Graphics2D g2d) {
        Rectangle2D.Double sq = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(sq);
    }

}