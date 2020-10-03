import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram{
	private static final int HEAD_WIDTH = 200;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 20;
	private static final int MOUTH_WIDTH = 100;
	private static final int MOUTH_HEIGHT = 50;
	
	public void run() {
		addFace(getWidth() / 2, getHeight() / 2);
	}

	private void addFace(int midWidth, int midHeight) {
		addHead(midWidth, midHeight);
		addEye(midWidth - HEAD_WIDTH / 4, midHeight - HEAD_HEIGHT / 4);
		addEye(midWidth + HEAD_WIDTH / 4, midHeight - HEAD_HEIGHT / 4);
		addMouth(midWidth, midHeight + HEAD_HEIGHT / 4);
		}

	private void addHead(int midWidth, int midHeight) {
		int x = midWidth - HEAD_WIDTH / 2;
		int y = midHeight - HEAD_HEIGHT / 2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
		
	}

	private void addEye(int midEyeX, int midEyeY) {
		int x = midEyeX - EYE_RADIUS;
		int y = midEyeY - EYE_RADIUS;
		int eyeDiameter = 2 * EYE_RADIUS;
		GOval eye = new GOval(x, y, eyeDiameter, eyeDiameter);
		eye.setFilled(true);
		eye.setColor(Color.YELLOW);
		add(eye);
		
	}

	private void addMouth(int midWidth, int midHeight) {
		int x = midWidth - MOUTH_WIDTH / 2;
		int y = midHeight - MOUTH_HEIGHT / 2;
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		mouth.setColor(Color.WHITE);
		add(mouth);
		
	}
}
