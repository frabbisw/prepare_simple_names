package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MyRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//createVisit();
		createEndVisit();
	}
	static void createVisit(){
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				
				try {
					sleep(2000);
					for(int i=0; i<80; i++)
					{
						sleep(200);
						Robot robot = new Robot();
						robot.keyPress(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_V);
						robot.keyPress(KeyEvent.VK_I);
						robot.keyRelease(KeyEvent.VK_I);
						robot.keyPress(KeyEvent.VK_S);
						robot.keyRelease(KeyEvent.VK_S);
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_SPACE);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.keyRelease(KeyEvent.VK_SPACE);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						
						robot.keyPress(KeyEvent.VK_UP);
						robot.keyRelease(KeyEvent.VK_UP);
						robot.keyPress(KeyEvent.VK_LEFT);
						robot.keyRelease(KeyEvent.VK_LEFT);
						robot.keyPress(KeyEvent.VK_LEFT);
						robot.keyRelease(KeyEvent.VK_LEFT);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						
						robot.keyPress(KeyEvent.VK_S);
						robot.keyRelease(KeyEvent.VK_S);
						robot.keyPress(KeyEvent.VK_Y);
						robot.keyRelease(KeyEvent.VK_Y);
						robot.keyPress(KeyEvent.VK_S);
						robot.keyRelease(KeyEvent.VK_S);
						robot.keyPress(KeyEvent.VK_O);
						robot.keyRelease(KeyEvent.VK_O);
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_SPACE);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.keyRelease(KeyEvent.VK_SPACE);
						
						robot.keyPress(KeyEvent.VK_SHIFT);
						robot.keyPress(KeyEvent.VK_QUOTE);
						robot.keyRelease(KeyEvent.VK_QUOTE);
						robot.keyRelease(KeyEvent.VK_SHIFT);										
						
						robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
						robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
						robot.keyPress(KeyEvent.VK_SPACE);
						robot.keyRelease(KeyEvent.VK_SPACE);
						robot.keyPress(KeyEvent.VK_SPACE);
						robot.keyRelease(KeyEvent.VK_SPACE);
						
						robot.keyPress(KeyEvent.VK_DOWN);
						robot.keyRelease(KeyEvent.VK_DOWN);
						robot.keyPress(KeyEvent.VK_DOWN);
						robot.keyRelease(KeyEvent.VK_DOWN);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						
						sleep(1000);
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}
	static void createEndVisit(){
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				
				try {
					sleep(2000);
					for(int i=0; i<80; i++)
					{
						sleep(200);
						Robot robot = new Robot();
						robot.keyPress(KeyEvent.VK_E);
						robot.keyRelease(KeyEvent.VK_E);
						robot.keyPress(KeyEvent.VK_N);
						robot.keyRelease(KeyEvent.VK_N);
						robot.keyPress(KeyEvent.VK_D);
						robot.keyRelease(KeyEvent.VK_D);
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_SPACE);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.keyRelease(KeyEvent.VK_SPACE);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						
						robot.keyPress(KeyEvent.VK_UP);
						robot.keyRelease(KeyEvent.VK_UP);
						robot.keyPress(KeyEvent.VK_LEFT);
						robot.keyRelease(KeyEvent.VK_LEFT);
						robot.keyPress(KeyEvent.VK_LEFT);
						robot.keyRelease(KeyEvent.VK_LEFT);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						
						robot.keyPress(KeyEvent.VK_S);
						robot.keyRelease(KeyEvent.VK_S);
						robot.keyPress(KeyEvent.VK_Y);
						robot.keyRelease(KeyEvent.VK_Y);
						robot.keyPress(KeyEvent.VK_S);
						robot.keyRelease(KeyEvent.VK_S);
						robot.keyPress(KeyEvent.VK_O);
						robot.keyRelease(KeyEvent.VK_O);
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_SPACE);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.keyRelease(KeyEvent.VK_SPACE);
						
						robot.keyPress(KeyEvent.VK_SHIFT);
						robot.keyPress(KeyEvent.VK_QUOTE);
						robot.keyRelease(KeyEvent.VK_QUOTE);
						robot.keyRelease(KeyEvent.VK_SHIFT);										
						
						robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
						robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
						robot.keyPress(KeyEvent.VK_SPACE);
						robot.keyRelease(KeyEvent.VK_SPACE);
						robot.keyPress(KeyEvent.VK_SPACE);
						robot.keyRelease(KeyEvent.VK_SPACE);
						
						robot.keyPress(KeyEvent.VK_DOWN);
						robot.keyRelease(KeyEvent.VK_DOWN);
						robot.keyPress(KeyEvent.VK_DOWN);
						robot.keyRelease(KeyEvent.VK_DOWN);
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						
						sleep(1000);
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}
}
