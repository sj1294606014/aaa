package com.sj.tank;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResouceMgr {
	public static BufferedImage goodtankL, goodtankR, goodtankU, goodtankD;
	public static BufferedImage badtankL, badtankR, badtankU, badtankD;
	public static BufferedImage bulletL, bulletR, bulletU, bulletD;
	public static BufferedImage[] explodes = new BufferedImage[15];
	static {
		try {

			goodtankR = ImageIO.read(ResouceMgr.class.getClassLoader().getResourceAsStream("image/goodtankR.png"));
			goodtankU = ImageUtil.rotateImage(goodtankR, -90);
			goodtankL = ImageUtil.rotateImage(goodtankR, 180);
			goodtankD = ImageUtil.rotateImage(goodtankR, 90);
			
			badtankU = ImageIO.read(ResouceMgr.class.getClassLoader().getResourceAsStream("image/badtankU.png"));
			badtankL = ImageUtil.rotateImage(badtankU, -90);
			badtankR = ImageUtil.rotateImage(badtankU, 90);
			badtankD = ImageUtil.rotateImage(badtankU, 180);
		
			bulletU = ImageIO.read(ResouceMgr.class.getClassLoader().getResourceAsStream("image/bulletU.png"));
			bulletL = ImageUtil.rotateImage(bulletU, -90);
			bulletR = ImageUtil.rotateImage(bulletU, 90);
			bulletD = ImageUtil.rotateImage(bulletU, 180);
			for (int i = 0; i < 15; i++) {
				explodes[i] = ImageIO
						.read(ResouceMgr.class.getClassLoader().getResourceAsStream("image/e" + (i + 1) + ".gif"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
