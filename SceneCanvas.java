import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SceneCanvas extends JComponent {

    private int height;
    private int width; 

    public SceneCanvas(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        /*
        Rectangle2D.Double stage_bg = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(Color.BLACK);
        g2d.fill(stage_bg);

        Rectangle2D.Double stage = new Rectangle2D.Double(250, 500, 500, 200);
        g2d.setColor(Color.GRAY);
        g2d.fill(stage);
        */




    }

}