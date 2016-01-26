package ProcessingGame.src;

import processing.core.*;

public class Monster extends LivingBeing {

	public Monster(Applet app) {
		super(app, 0, 0, "Giant.png");
	}

	public void loop() {
		m.image(img, x, y);
	}
}
