package ProcessingGame.src;

import processing.core.*;

public class Player extends LivingBeing {

	boolean hurt = false;

	public Player(Applet app) {
		super(app, 0, 120, "PersonFighting.png");
	}

	public void loop() {
		m.image(img, x, y);
		if(hurt) {
			m.textSize(32);
			m.text("OH MY GOD!!!!", x, y);
			hurt = false;
		}
	}
}
