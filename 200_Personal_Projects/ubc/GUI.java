/*
 *	Author:  
 *  Date: 
*/

// import pkg.*;
// import java.util.Scanner;
// import java.util.Random;
import java.awt.GridLayout;
import java.awt.BorderLayout;
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.BorderFactory;

public class GUI {
	
	public GUI(){
		JFrame frame = new JFrame();
		
		JPanel p = new JPanel();
		p.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		p.setLayout(new GridLayout(0,1));
		
		frame.add(p,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new GUI();
		
		// int w = 640;
		// int h = 480;
		// JFrame f = new JFrame();
		// f.setSize(w,h);
		// f.setTitle("Drawing in Java");
		// f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// f.setVisible(true);

		
	}
}
