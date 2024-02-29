import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SceneFrame {

    private SceneCanvas canvas;
    private JFrame frame;
    private JButton button;

    public SceneFrame() {
        canvas = new SceneCanvas();
        frame = new JFrame();
        button = new JButton("Strum a Chord!");
    }

    public void setUpGUI() {
        frame.pack();
        frame.setSize(800, 600);
        frame.setTitle("Midterm Project - Garcia - Hermosura.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = frame.getContentPane();

        cp.add(canvas, BorderLayout.CENTER);
        cp.add(button, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
        

    }

}