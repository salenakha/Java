import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;

public class StickFigure3 extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
	    Ellipse2D.Double head = new Ellipse2D.Double(25, 10, 50, 50);
		g2.draw(head);
		g2.draw(new Line2D.Double(50,60, 50,150));
		g2.draw(new Line2D.Double(50,60,75,75));
		g2.draw(new Line2D.Double(50,60,-50,75));
	}
}