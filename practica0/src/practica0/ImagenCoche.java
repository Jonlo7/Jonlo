package practica0;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;


public class ImagenCoche extends JLabel {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		public ImagenCoche () {
			ImageIcon imagen = new ImageIcon("C:\\Users\\jonlc\\eclipse-workspace\\practica0\\src\\practica0\\coche.png");
			this.setIcon(imagen);
		}
		@Override
	    protected void paintComponent(final Graphics g) {
	        super.paintComponent(g);
	      
	        try {
	            final BufferedImage dimg = ImageIO
	                    .read(new File("C:\\Users\\jonlc\\eclipse-workspace\\practica0\\src\\practica0\\coche.png"));
	            final java.awt.Image img = dimg.getScaledInstance(100, 100, 1);
	            

	            this.setIcon(new ImageIcon(img));
	        } catch (final IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
