import java.awt.*;
import java.util.Random;

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
        boolean first = true;
        Random r = new Random();

//        g.translate(0, 800);
        for (int points = 0; points < 10000; points++) {
            x = r.nextInt(1280);
            y = r.nextInt(800);
	    if (!first) {
	        g.drawLine(oldX,oldY, x,y);
            }
            first = false;
            oldX = x;
            oldY = y;
            for (short s = 0; s < Short.MAX_VALUE; s++) {
                //Integer small = new Integer(0);
            }
        }
    }
}

