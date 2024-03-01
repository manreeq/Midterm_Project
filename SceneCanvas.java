import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SceneCanvas extends JComponent {

    Timer timer;
    int delay;
    int velocity;
    ActionListener al;

    public SceneCanvas() {
        this.setPreferredSize(new Dimension(800, 600));
        delay = 50;
        al = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

            }
        };
        timer = new Timer(delay, al);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        // Timer timer = new Timer(500);
        
        Rectangle background = new Rectangle(0, 0, 800, 600, Color.BLACK);
        background.draw(g2d);


        //lights
        Line l1 = new Line(400, 600, 0, 0, 90, Color.YELLOW);
        l1.draw(g2d);

        Line l2 = new Line(400, 600, 800, 0, 90, Color.YELLOW);
        l2.draw(g2d);


        //stage
        Rectangle sbg =  new Rectangle(190, 220, 420, 370, Color.WHITE);
        sbg.draw(g2d);

        Person p1 = new Person(290, 370, 60, Color.BLACK);
        p1.draw(g2d);

        Person p2 = new Person(350, 370, 60, Color.BLACK);
        p2.draw(g2d);

        Person p3 = new Person(410, 370, 60, Color.BLACK);
        p3.draw(g2d);

        Person p4 = new Person(470, 370, 60, Color.BLACK);
        p4.draw(g2d);

        Rectangle sfloor =  new Rectangle(150, 440, 500, 100, new Color(183, 183, 183));
        sfloor.draw(g2d);

        Trapezoid sroof = new Trapezoid(190, 220, 420, 40, new Color(70, 70, 70));
        sroof.draw(g2d);


        //crowd
        Crowd test3 = new Crowd(0, 460, 100, Color.GRAY);
        test3.draw(g2d);  
        Crowd test2 = new Crowd(25, 500, 100, new Color(70, 70, 70));
        test2.draw(g2d);
        Crowd test = new Crowd(0, 540, 100, new Color(53, 53, 53));
        test.draw(g2d);

    }

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {

        }
    }

}