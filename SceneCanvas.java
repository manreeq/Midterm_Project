import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent {

    private double velocity;
    private int addVelocity;
    private Line l1;
    private Line l2;
    private Rectangle sbg;
    private Square design1;
    private Square design2;
    private Square design3;
    private Square design4;
    private Square design5;
    private Square design6;
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
    private ArrayList<DrawingObject> elements;


    public SceneCanvas() {
        tick = 0;
        this.setPreferredSize(new Dimension(800, 600));
        velocity = 100;
        addVelocity = 0;

        elements = new ArrayList<>();

        Background bg = new Background(0, 0, Color.BLACK, 800, 600, new Color(0,0,80));
        elements.add(bg);

        //lights
        l1 = new Line(400, 600, 0, 0, 90, Color.YELLOW);
        elements.add(l1);
        l2 = new Line(400, 600, 800, 0, 90, Color.YELLOW);
        elements.add(l2);

        //stage
        sbg =  new Rectangle(190, 220, 420, 370, Color.WHITE);
        elements.add(sbg);
        design1 = new Square(270, 285, 100, new Color(255, 204, 204));
        elements.add(design1);
        design2 = new Square(435, 285, 100, new Color(255, 204, 204));
        elements.add(design2);
        design3 = new Square(330, 260, 150, new Color(255, 102, 102));
        elements.add(design3);

        p1 = new Person(290, 370, 60, Color.BLACK);
        elements.add(p1);
        p2 = new Person(350, 370, 60, Color.BLACK);
        elements.add(p2);
        p3 = new Person(410, 370, 60, Color.BLACK);
        elements.add(p3);
        p4 = new Person(470, 370, 60, Color.BLACK);
        elements.add(p4);

        sfloor =  new Rectangle(150, 440, 500, 100, new Color(183, 183, 183));
        elements.add(sfloor);
        design4 = new Square(190, 460, 85, Color.BLACK);
        elements.add(design4);
        design5 = new Square(360, 460, 85, Color.BLACK);
        elements.add(design5);
        design6 = new Square(530, 460, 85, Color.BLACK);
        elements.add(design6);
        sroof = new Trapezoid(190, 220, 420, 40, new Color(70, 70, 70));
        elements.add(sroof);

        //crowd
        c1 = new Crowd(0, 460, 100, Color.GRAY);
        elements.add(c1);
        c2 = new Crowd(25, 500, 100, new Color(70, 70, 70));
        elements.add(c2);
        c3 = new Crowd(0, 540, 100, new Color(53, 53, 53));
        elements.add(c3);

        animateCanvas();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

 

        //Rectangle background = new Rectangle(0, 0, 800, 600, Color.BLACK);
        //background.draw(g2d);


        for (DrawingObject d : elements) {
            d.draw(g2d);
        }
    }

    public void strum() {
        if (addVelocity == 0) addVelocity += 80;
        System.out.println(addVelocity);
        c = 0;
        strumTimer = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                c+=10; 
                if (c > 9500) {
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