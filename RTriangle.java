import java.awt.*;
import java.awt.geom.*;

//to be tested

public class RTriangle {

    private double x, y, width, height;
    private Color color;

    public RTriangle(double x, double y, double w, double h, Color c){
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        color = c;
    }

    public void drawTriangle(Graphics2D g2d){
        Path2D.Double t = new Path2D.Double();
        t.moveTo(x, y);
        t.lineTo(x + width, y);
        t.moveTo(x, y);
        t.lineTo(x, y + height);
        t.closePath();
        g2d.setColor(color);
        g2d.fill(t);
    }
}