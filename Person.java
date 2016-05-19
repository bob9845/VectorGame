package ProcessingGame.src;

import processing.core.*;

import java.lang.Math.*;

public class Person extends LivingBeing {
	int speed = 2;

	boolean hurt = false;	

	public Person (Applet app) {
		super(app, 0, 0, "PersonWalking.png");
	}

	public void loop() {
		//x++;

		double vecX = m.bob.x - x;
		double vecY = m.bob.y - y;
		double length = Math.sqrt(Math.pow(vecX, 2.0) + Math.pow(vecY, 2.0));
		vecX = vecX/length;
		vecY = vecY/length;
		vecX = vecX*speed;
		vecY = vecY*speed;
		x -= vecX;
		y -= vecY;
		m.image(img, x,y);
	}
}
