import java.awt.event.*;
import java.util.Timer;

public class TimerListener implements ActionListener {
    
    double a;
    DrawingObject b;

    public TimerListener(double a, DrawingObject b) {
        this.a = a;
        this.b = b;
    }

    public void actionPerformed(ActionEvent ae) {
        a += 10;
        //b.repaint();
        //ayaw magrepaint since hindi naman extends jcomponent yung drawing object, kaya ittry na gawing abstract class ung drawingobject para mainherit yung jcomponent
    }
}
