import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SceneCanvas extends JComponent {

    public SceneCanvas() {
        this.setPreferredSize(new Dimension(800, 600));
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Rectangle background = new Rectangle(0, 0, 800, 600, Color.BLACK);
        background.draw(g2d);

    }

}