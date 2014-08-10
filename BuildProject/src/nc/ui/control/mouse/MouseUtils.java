package nc.ui.control.mouse;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;

public class MouseUtils {
	private static  Robot robot;
	private MouseUtils()
	{
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void moveTo(Point p)
	{
		robot.mouseMove(p.x, p.y);
	}
}
