package ProcessingGame.src;

import processing.core.*;

public class Monster {
	Applet m;
	PImage img_monster;
	int monsterx = 0;
	int monstery = 0;

	public Monster(Applet app) {
		m = app;
		img_monster = m.loadImage("Giant.png");
	}

	public void loop() {
		m.image(img_monster, monsterx,monstery);
	}
}
