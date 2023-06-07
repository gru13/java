import javax.swing.*;
import java.awt.event.*;

public class MouseEventsExample extends JFrame implements MouseListener, MouseMotionListener {

    public MouseEventsExample() {
        setTitle("Mouse Events Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Register the listeners
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MouseEventsExample().setVisible(true);
            }
        });
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at: " + e.getX() + ", " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at: " + e.getX() + ", " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the frame");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited the frame");
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse dragged at: " + e.getX() + ", " + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse moved at: " + e.getX() + ", " + e.getY());
    }
}
