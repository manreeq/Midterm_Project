import java.awt.*;

//done

public class Person extends DrawingObject{
    
    private double x, y, width, height, tempy;
    private Color color;

    public Person(double x, double y, double h, Color c) {
        this.x = x;
        this.y = y;
        width = h/3;
        height = h;
        color = c;
        tempy = y;
    }

    public void draw(Graphics2D g2d) {
        Circle head = new Circle(x, y + (height/10), width, color);
        head.draw(g2d);
        
        Ellipse body = new Ellipse(x, y + width, width, height, color);
        body.draw(g2d);
    }

    public void animate(double speed, int tick) {
        y = 5 * Math.sin(tick/speed) + tempy;
    }
   
}
