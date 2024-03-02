import java.awt.*;

public class Crowd extends DrawingObject {
 
    private double x, y, height;
    private Color color;

    public Crowd(double x, double y, double h, Color c) {
        this.x = x;
        this.y = y;
        height = h;
        color = c;
    }

    public void draw(Graphics2D g2d) {
        for (int i = 0; i <= 800; i += height/3) {
            Person person = new Person(x + (i + i/2), y, height, color);
            person.draw(g2d);
        }
    }

    public void animate(double speed) {
        y -= speed;
    }

}