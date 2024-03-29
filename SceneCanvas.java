/**
    This is a template for a Java file.
    @author Evan Sebastian M. Garcia (232776)
    @author Gabriel P. Hermosura (233070)
    @version March 4, 2024
**/

/*
    I have not discussed the Java language code in my program
    with anyone other than my instructor or the teaching assistants
    assigned to this course.

    I have not used Java language code obtained from another student,
    or any other unauthorized source, either modified or unmodified.
    
    If any Java language code or documentation used in my program
    was obtained from another source, such as a textbook or website,
    that has been clearly noted with a proper citation in the comments
    of my program.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * This is the canvas class where all the different elements are instantiated and drawn. 
 * This class also contains several methods for the animations in the graphic. 
 */
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

    /**
     * This is the constructor for the SceneCanvas class. It instantiates the shape objects that will be used, as well as call the method that will animate the objects.
     */
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

    /**
     * This is the paintComponent method, which will not be called explicitly. It iterates through the elements ArrayList containing
     * the shape objects and calls the draw() method on each of them.
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);


        for (DrawingObject d : elements) {
            d.draw(g2d);
        }
    }

    /**
     * This method is called whenever the JButton is pressed. It basically makes the animation faster for the duration of 
     * the song being played. This is achieved through another timer object.
     */
    public void strum() {
        if (addVelocity == 0) addVelocity += 63;
        System.out.println(addVelocity);
        c = 0;
        strumTimer = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                c+=10; 
                if (c > 9500) {
                    if (addVelocity == 63) addVelocity -= 63;
                    c = 0;
                    strumTimer.stop();
                }
            }
        });

        strumTimer.start();
    }


    /**
     * This method is called when you want to animate a speciied shape object. It accepts a parameter of the type DrawingObject
     * and calls the animate method of that specified object
     * @param dObject
     */
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


    /**
     * This method calls the animateDrawing() method on each of the DrawingObject inside the ArrayList elements
     */
    private void animateCanvas() {
        for (DrawingObject d : elements) {
            animateDrawing(d);
        }
    } 
}