import java.awt.*;

public abstract class DrawingObject {
    abstract void draw(Graphics2D g2d);
    
    abstract void animate(double speed, int tick);
}