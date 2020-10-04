package practica0;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.imageio.ImageIO;

public class ventanaJuego extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel pCentral;
	JPanel pInferior;
	
	public ventanaJuego() {
		//paneles
		pCentral = new JPanel();
		pInferior = new JPanel ( new FlowLayout());
		pCentral.setBackground(Color.WHITE);
		//botones
		JButton bAcelerar = new JButton("Acelerar");
		JButton bFrenar= new JButton("Frenar");
		JButton bIzqda = new JButton("Izquierda");
		JButton bDrcha = new JButton("Derecha");
		
		pInferior.add(bAcelerar);
		pInferior.add(bFrenar);
		pInferior.add(bIzqda);
		pInferior.add(bDrcha);
		
		this.add(pInferior,BorderLayout.SOUTH);
		
		ClaseCoche c1 = new ClaseCoche();
		c1.setPosX(150);
		c1.setPosY(150);
		ImagenCoche Ic1 = new ImagenCoche();
		
		bAcelerar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c1.acelera(1);
			}
		});

		bFrenar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c1.acelera(-1);
			}
		});
		

		bIzqda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c1.gira(-0.5);				
			}
		});
		
		bDrcha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c1.gira(+0.5);
			}
		});
		
		
		this.add(pCentral);
		JLabel te1 = new ImagenCoche();
		pCentral.add(te1);
		
		
		new Thread(){
			@Override
			public void run() {
				boolean estado = true;
				while ( estado = true) {
					if (c1.getPosX() < pCentral.getX() || c1.getPosY() < pCentral.getY() ||c1.getPosX() > pCentral.getWidth()|| c1.getPosY() > pCentral.getHeight()){
						c1.setVelocidad(c1.getVelocidad()*(-1)) ;
					}
					
					te1.setLocation((int) c1.posX, (int) c1.posY);
					System.out.println(c1.getPosX() + " : " + c1.getPosY());
					c1.mueve();
					
					try { Thread.sleep(40); 
					} 
					catch (InterruptedException e) {
						System.err.println(e);
					}

				}
			}
		}.start();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
		ventanaJuego v1 = new ventanaJuego();
	}
}
