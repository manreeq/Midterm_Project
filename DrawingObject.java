import java.awt.*;

public abstract class DrawingObject {
    abstract void draw(Graphics2D g2d);
    
    abstract void animate(double addVelocity, int tick);

    /*
    void adjustX(double distance);
    double getX();
    */
}