package ProcessingGame.src;

import processing.core.*;

import java.lang.Math.*;

public class Monster extends LivingBeing {
	int speed = 5;
	boolean right = false;

	public Monster (Applet app) {
		super(app, 0, 0, "Giant.png");
	}

	public void loop(Player player) {
		//y = m.playerY;
		//x = m.playerX -50;
		if(player.x > x -100 && player.x < x + 100 &&
			player.y > y -100 && player.y < y + 100)
		{
			player.hurt = true;
		}
		double vecX = m.jim.x - x;
		double vecY = m.jim.y - y;
		double length = Math.sqrt(Math.pow(vecX, 2.0) + Math.pow(vecY, 2.0));
		vecX = vecX/length;
		vecY = vecY/length;
		vecX = vecX*speed;
		vecY = vecY*speed;
		x += vecX;
		y += vecY;
		m.image(img, x,y);
	}
}
