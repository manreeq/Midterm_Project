import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SceneCanvas extends JComponent {

    private double velocity;
    private int addVelocity;
    private Line l1;
    private Line l2;
    private Rectangle sbg;
    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Rectangle sfloor;
    private Trapezoid sroof;
    private Crowd c1;
    private Crowd c2;
    private Crowd c3;
    private Timer timer;
    private Timer strumTimer;
    private int tick;
    private int c;


    public SceneCanvas() {
        tick = 0;
        this.setPreferredSize(new Dimension(800, 600));
        velocity = 100;
        addVelocity = 0;

        //crowd
        c1 = new Crowd(0, 460, 100, Color.GRAY);
        c2 = new Crowd(25, 500, 100, new Color(70, 70, 70));
        c3 = new Crowd(0, 540, 100, new Color(53, 53, 53));

        //lights
        l1 = new Line(400, 600, 0, 0, 90, Color.YELLOW);
        l2 = new Line(400, 600, 800, 0, 90, Color.YELLOW);

        //stage
        p1 = new Person(290, 370, 60, Color.BLACK);
        p2 = new Person(350, 370, 60, Color.BLACK);
        p3 = new Person(410, 370, 60, Color.BLACK);
        p4 = new Person(470, 370, 60, Color.BLACK);
        sbg =  new Rectangle(190, 220, 420, 370, Color.WHITE);
        sfloor =  new Rectangle(150, 440, 500, 100, new Color(183, 183, 183));
        sroof = new Trapezoid(190, 220, 420, 40, new Color(70, 70, 70));

        animateCanvas();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Rectangle background = new Rectangle(0, 0, 800, 600, Color.BLACK);
        background.draw(g2d);

        //lights
        l1.draw(g2d);
        l2.draw(g2d);

        //stage
        sbg.draw(g2d);
        p1.draw(g2d);
        p2.draw(g2d);
        p3.draw(g2d);
        p4.draw(g2d);
        sfloor.draw(g2d);
        sroof.draw(g2d);

        //crowd
        c1.draw(g2d);
        c2.draw(g2d);
        c3.draw(g2d);  
    }

    public void strum() {
        if (addVelocity == 0) addVelocity += 80;
        System.out.println(addVelocity);
        c = 0;
        strumTimer = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                c+=10; 
                if (c > 800) {
                    if (addVelocity == 80) addVelocity -= 80;
                    c = 0;
                    strumTimer.stop();
                }
            }
        });

        strumTimer.start();
    }


    public void animateDrawing(DrawingObject dObject) {
        timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tick++;
                dObject.animate(velocity - addVelocity, tick);
                repaint();       
            }
        });
        timer.start();
    }


    public int getTick() {
        return tick;
    }


    private void animateCanvas() {
        animateDrawing(l1);
        animateDrawing(l2);
        animateDrawing(p1);
        animateDrawing(p2);
        animateDrawing(p3);
        animateDrawing(p4);
        animateDrawing(c1);
        animateDrawing(c2);
        animateDrawing(c3);
    } 
}