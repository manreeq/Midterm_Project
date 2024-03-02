import java.awt.*;
import java.awt.geom.*;

//done

public class Line extends DrawingObject {

    private double xs, xy, xe, ye, rotate;
    private int thickness;
    private Color color;

    public Line(int xs, int xy, int xe, int ye, int t, Color c) {
        this.xs = xs;
        this.xy = xy;
        this.xe = xe;
        this.ye = ye;
        thickness = t;
        color = c;
        rotate = 0;
    }

    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();
        Line2D.Double l = new Line2D.Double(xs, xy, xe, ye);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.rotate(Math.toRadians(rotate), xs, xy);
        g2d.draw(l);
        g2d.setTransform(reset);
    }

    public void animate(double speed, int tick) {
        if (xs > xe) rotate = 10 * Math.sin(tick/speed);
        else rotate = -10 * Math.sin(tick/speed);
    }

    
}