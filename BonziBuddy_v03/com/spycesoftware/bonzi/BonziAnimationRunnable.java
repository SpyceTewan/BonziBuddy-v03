package com.spycesoftware.bonzi;

import java.awt.Dimension;
import java.awt.Toolkit;

public class BonziAnimationRunnable implements Runnable{
	Bonzi bonzi;
	
	public BonziAnimationRunnable(Bonzi bonzi){
		this.bonzi = bonzi;
	}
	
	@Override
	public void run() {
		if(bonzi.bonziAnimationExpanded){
			bonzi.upadteBonziPicture("/assets/bonzi_normal.png");
			bonzi.bonziAnimationExpanded = false;
			
			int size = (int) Math.floor(Math.random()  * 1000);
			
			bonzi.frame.setSize(size, size);
		}else{
			bonzi.upadteBonziPicture("/assets/bonzi_expanded.png");
			bonzi.bonziAnimationExpanded = true;
			
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			int posX = (int) Math.floor(Math.random() * (dim.getWidth() - 500));
			int posY = (int) Math.floor(Math.random() * (dim.getHeight() - 500));
			
			bonzi.frame.setLocation(posX, posY);
			
			
				
		}
	}
	
}
