import java.awt.*;
import java.awt.geom.*;

//done

public class Line extends DrawingObject {

    private int xs, xy, xe, ye, thickness;
    private Color color;

    public Line(int xs, int xy, int xe, int ye, int t, Color c) {
        this.xs = xs;
        this.xy = xy;
        this.xe = xe;
        this.ye = ye;
        thickness = t;
        color = c;
    }

    public void draw(Graphics2D g2d) {
        Line2D.Double l = new Line2D.Double(xs, xy, xe, ye);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.draw(l);
    }

    public void animate(double addVelocity) {}
    
}