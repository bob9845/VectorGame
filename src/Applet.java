package ProcessingGame.src;

import processing.core.*;

/**
 * A simple program that shows an orange screen.
 */
public class Applet extends PApplet {

	PImage img_player;
	int playerY = 120;

	public void keyPressed() {
		if(key == CODED) {
			if(keyCode == UP)
				playerY -= 5;
			else if (keyCode == DOWN)
				playerY += 5;	
		}
	}

	public void settings() {
		size(640, 480);
		img_player = loadImage("PersonReady.png");
	}

	public void draw() {
		background(255,127,0);
		image(img_player, mouseX,playerY);
	}

}
