import java.awt.*;
import java.awt.geom.*;

public class Background extends DrawingObject {
    
    private float x1, y1, x2, y2;
    private Color color1, color2;

    public Background(float x1, float y1, Color c1, float x2, float y2, Color c2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        color1 = c1;
        color2 = c2;

        
    }

    public void draw(Graphics2D g2d) {
        GradientPaint g = new GradientPaint((x2/2), y1, color1, (x2/2), y2, color2);
        Rectangle2D.Double bgShape = new Rectangle2D.Double(x1, y1, x2-x1, y2-y1);
        g2d.setPaint(g);
        g2d.fill(bgShape);

    }

    public void animate(double speed, int tick) {}

}
