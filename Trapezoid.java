import java.awt.*;
//done

public class Trapezoid extends DrawingObject {

    private double x, y, width, height;
    private Color color;

    public Trapezoid(double x, double y, double w, double h, Color c) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        color = c;
    }

    public void draw(Graphics2D g2d) {
        Rectangle middle = new Rectangle(x, y - height, width, height, color);
        middle.draw(g2d);

        RTriangle left = new RTriangle(x, y, -(width/5), height, color);
        left.draw(g2d);
        
        RTriangle right = new RTriangle(x + width, y, width/5, height, color);
        right.draw(g2d);
    }

    public void animate(double speed, int tick) {}

}