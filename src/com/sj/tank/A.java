package com.sj.tank;

import java.awt.Frame;
import java.awt.Graphics;

public class A  extends Frame {
	int x=300;
	int y=300;
	@Override
	public void paint(Graphics g) {
		g.drawImage( ResouceMgr.goodtankL , x, y, null);
		g.drawImage( ResouceMgr.goodtankR , x-100, y, null);
		g.drawImage( ResouceMgr.goodtankU , x+100, y, null);
		g.drawImage( ResouceMgr.goodtankD , x+200, y, null);
	}

	public A(){
		setSize(1080,800);
		setResizable(false);
		setTitle("tank war");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		A a =new A();
		
	}
}
