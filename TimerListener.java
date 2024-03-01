import java.awt.event.*;
import java.util.Timer;

public class TimerListener implements ActionListener {
    
    double velocity;
    DrawingObject object;

    public TimerListener(double velocity, DrawingObject object) {
        this.velocity = velocity;
        this.object = object;
    }

    public void actionPerformed(ActionEvent ae) {
        velocity += 10;
        //object.repaint();
        //ayaw magrepaint since hindi naman extends jcomponent yung drawing object, kaya ittry na gawing abstract class ung drawingobject para mainherit yung jcomponent
    }
}
