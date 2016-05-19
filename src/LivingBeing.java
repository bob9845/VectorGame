package ProcessingGame.src;

import processing.core.*;

public class LivingBeing {
	Applet m;
	PImage img;
	int x;
	int y;

	public LivingBeing(Applet app, int xx, int yy, String image) {
		m = app;
		x = 512;
		y = 384;
		try {
			img = m.loadImage(image);
		} catch ( Exception e) {
			System.out.println("couldn't find your stupid picture" + image);
			System.exit(-1);
		}
	}
}
