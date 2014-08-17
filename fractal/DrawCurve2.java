import java.awt.*;
import static java.lang.Math.*;

class DrawCurve extends Canvas {
    DrawCurve() {
	super();
    }

    public static void main(String[] argv) {
        Frame f = new Frame("Hello World");
	Canvas c = new DrawCurve();
	f.add(c);
        f.setVisible(true);
    }

    public void paint(Graphics g) {
	int x, y, oldX = 0, oldY = 0;
	final int MAX_X = 1300;

        g.translate(0, 300);
        for (x = 0; x < MAX_X; x++) {
            y = (int) (- abs(sin((double) x/200.0))*300.0);
	    if (x > 0) {
	        g.drawLine(oldX,oldY, x,y);
            }
            oldX = x;
            oldY = y;
            for (short s = 0; s < Short.MAX_VALUE; s++) {
                Integer small = new Integer(0);
            }
        }
    }
}

