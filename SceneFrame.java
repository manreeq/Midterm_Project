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
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;

/**
 * This class is the frame in which all of the elements will be visualized. 
 * This class is responsible for all the GUI components of the program. 
 * Contains the method to read and play the audio file. 
 */
public class SceneFrame {

    private SceneCanvas canvas;
    private JFrame frame;
    private JButton button;
    private Clip clip;

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
        
        ActionListener aListener = new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
                canvas.strum();
                playAudio();
                
            }
        };

        button.addActionListener(aListener);

    }

    private void playAudio() {
        if (clip != null) {
            clip.stop();
        }

        try {
            File file = new File("java_audio.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);

            clip = AudioSystem.getClip();
            clip.open(audioIn);

            clip.start();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

}