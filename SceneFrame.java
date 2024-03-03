import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;


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