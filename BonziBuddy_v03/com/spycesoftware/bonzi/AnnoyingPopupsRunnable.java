package com.spycesoftware.bonzi;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnnoyingPopupsRunnable implements Runnable, KeyListener, WindowListener{
	
	@Override
	public void run() {
		JFrame frame = new JFrame("DONG HAS BEEN EXPANDED");
		JLabel image = new JLabel(new ImageIcon(this.getClass().getResource("/assets/bonzi_best.png")));
		ImageIcon img = new ImageIcon(this.getClass().getResource("/assets/icon.png"));
	       
		image.setSize(500, 500);
		int h = Toolkit.getDefaultToolkit().getScreenSize().height;
		int w = Toolkit.getDefaultToolkit().getScreenSize().width;
		
		frame.setSize(500, 500);
		frame.add(image);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setIconImage(img.getImage());
		frame.setLocation((int) Math.floor(Math.random() * (w - 500)), (int) Math.floor(Math.random() * (h- 500)));
		frame.addKeyListener(this);
		frame.addWindowListener(this);
		frame.pack();
		
		
		frame.setVisible(true);
	}

	
	@Override
	public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_PLUS){
				System.out.println("Pressed stopping key!");
				System.exit(-1);
			}else{
				String arg[] = new String[1];
				arg[0] = "instant";
				Main.main(arg);
			}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		String arg[] = new String[1];
		arg[0] = "instant";
		Main.main(arg);
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		
	}


	@Override
	public void windowOpened(WindowEvent e) {
		
	}

}
