import javax.swing.*;

public class SceneStarter {
    
    public static void main(String[] args) {
        
        int w = 800;
        int h = 600;
        JFrame SceneFrame = new JFrame();
        SceneCanvas concert = new SceneCanvas(w,h);
        SceneFrame.setSize(w,h);
        SceneFrame.setTitle("tite");
        SceneFrame.setResizable(false);
        SceneFrame.add(concert);
        SceneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SceneFrame.setVisible(true);


    }

}
