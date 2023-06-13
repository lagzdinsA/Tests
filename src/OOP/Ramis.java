package OOP;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Ramis extends JFrame implements KeyListener {
	
	static boolean wNospiests;
	static boolean sNospiests;
	static boolean enterNospiests;
	static boolean escNospiests;
	
 Ramis(){
	    this.addKeyListener(this);   
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.getContentPane().setBackground(Color.black);
		//this.setLayout(null);
		this.setVisible(true);
		sakums(this);
 }
 
public static void sakums(JFrame ramis) {
	SwingUtilities.updateComponentTreeUI(ramis);
	int izvele=0;
	JLabel Tituls= new JLabel();
	Tituls.setText("Tests-OOP");
	Tituls.setBounds(10,0,200,200);
	Tituls.setForeground(Color.WHITE);
	Tituls.setFont(new Font("Liels", Font.PLAIN, 40));
	
	JLabel Starts= new JLabel();
	Starts.setText("Sakt testu");
	Starts.setBounds(10,100,200,200);
	Starts.setFont(new Font("Videjs", Font.PLAIN, 25));
	Starts.setForeground(Color.WHITE);
	
	JLabel Opcijas= new JLabel();
	Opcijas.setText("Opcijas");
	Opcijas.setBounds(10,150,200,200);
	Opcijas.setFont(new Font("Videjs", Font.PLAIN, 25));
	Opcijas.setForeground(Color.WHITE);
	
	JLabel Izziet= new JLabel();
	Izziet.setText("Izziet");
	Izziet.setBounds(10,200,200,200);
	Izziet.setFont(new Font("Videjs", Font.PLAIN, 25));
	Izziet.setForeground(Color.WHITE);
	
	JLabel tests= new JLabel();
	ramis.add(Tituls);
	ramis.add(Starts);
	ramis.add(Opcijas);
	ramis.add(Izziet);
	ramis.add(tests);
	
	
	do {
		if(wNospiests==true) {
			izvele--;
			wNospiests=false;
		}
		if(sNospiests==true) {
			izvele++;
			sNospiests=false;
		}
		
		if(izvele<0) {
			izvele=0;
		}
		if(izvele>2) {
			izvele=2;
		}
		
		
		switch(izvele) {
		case 0:
			Starts.setText("Sakt testu <");
			Opcijas.setText("Opcijas");
			Izziet.setText("Izziet");
			if (enterNospiests==true){
				ramis.remove(Tituls);
				ramis.remove(Starts);
				ramis.remove(Opcijas);
				ramis.remove(Izziet);
				jautajumi(ramis);
			}
			break;
		case 1:
			Starts.setText("Sakt testu");
			Opcijas.setText("Opcijas <");
			Izziet.setText("Izziet");
			if (enterNospiests==true){
				ramis.remove(Tituls);
				ramis.remove(Starts);
				ramis.remove(Opcijas);
				ramis.remove(Izziet);
				paskaidrojums(ramis);
			}
			break;
		case 2:
			Starts.setText("Sakt testu");
			Opcijas.setText("Opcijas");
			Izziet.setText("Izziet <");
			if (enterNospiests==true){
				System.exit(0);
				enterNospiests=false;
			}
			break;
		}
	}while(1==1);
	}


public static void paskaidrojums(JFrame ramis) {
	
	ramis.removeAll();//or remove(JComponent)
	ramis.revalidate();
	ramis.repaint();
	SwingUtilities.updateComponentTreeUI(ramis);
	JLabel Tituls= new JLabel();
	Tituls.setText("Paskaidrojums");
	Tituls.setBounds(200,100,200,200);
	Tituls.setForeground(Color.WHITE);
	Tituls.setFont(new Font("", Font.PLAIN, 30));
	
	JLabel Paskaidrojums= new JLabel();
	Paskaidrojums.setText("Test par OOP. Kusties ar W un S.");
	Paskaidrojums.setBounds(20,100,200,200);
	Paskaidrojums.setForeground(Color.WHITE);
	Paskaidrojums.setFont(new Font("", Font.PLAIN, 14));
	
	JLabel Turpinat= new JLabel();
	Turpinat.setText("Esc lai ietu atpakaļ");
	Turpinat.setBounds(200,200,200,200);
	Turpinat.setForeground(Color.WHITE);
	Turpinat.setFont(new Font("", Font.PLAIN, 20));
	JLabel tests= new JLabel();
	ramis.add(Tituls);
	ramis.add(Paskaidrojums);
	ramis.add(Turpinat);
	ramis.add(tests);
	ramis.removeAll();//or remove(JComponent)
	ramis.revalidate();
	ramis.repaint();
	SwingUtilities.updateComponentTreeUI(ramis);		
			if(escNospiests==true) {
				escNospiests=false;
				ramis.remove(Tituls);
				ramis.remove(Paskaidrojums);
				ramis.remove(Turpinat);
				SwingUtilities.updateComponentTreeUI(ramis);	
				sakums(ramis);	
			}
		}


public static void jautajumi(JFrame ramis) {
	
}


public static void atbildes(JFrame ramis) {
	
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	//System.out.println("Nospiesta charactera kods"+e.getKeyCode());

}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("tests"+e.getKeyCode());
	enterNospiests=false;
	switch(e.getKeyCode()) {
	case 87: 
		wNospiests=true;
		break;
	case 83: 
		sNospiests=true;
		break;
	case 10: 
			enterNospiests=true;
			System.out.println("tests"+e.getKeyCode());
			break;
	case 27:
		escNospiests=true;
		}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
	}
}
