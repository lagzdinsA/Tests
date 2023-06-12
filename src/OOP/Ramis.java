package OOP;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ramis extends JFrame implements KeyListener {
	
	static boolean wNospiests;
	static boolean sNospiests;
	static boolean enterNospiests;
	
 Ramis(){
	    this.addKeyListener(this);   
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.getContentPane().setBackground(Color.black);
		this.setLayout(null);
		this.setVisible(true);
		sakums(this);
 }
 
public static void sakums(JFrame ramis) {
	int izvele=0;
	new Font("Liels", Font.PLAIN, 40);
	new Font("Videjs", Font.PLAIN, 25);
	
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
	
	ramis.add(Tituls);
	ramis.add(Starts);
	ramis.add(Opcijas);
	ramis.add(Izziet);
	
	
	do {
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
			break;
		case 1:
			Starts.setText("Sakt testu");
			Opcijas.setText("Opcijas <");
			Izziet.setText("Izziet");
			break;
		case 2:
			Starts.setText("Sakt testu");
			Opcijas.setText("Opcijas");
			Izziet.setText("Izziet <");
			break;
		}
	}while(enterNospiests==false);
	
	
	switch(izvele) {
	case 0:
jautajumi(ramis);
		break;
	case 1:
paskaidrojums(ramis);
		break;
	case 2:
		System.exit(0);
		break;
	}
	}while(1==2);
}
public static void paskaidrojums(JFrame ramis) {
	
}
public static void jautajumi(JFrame ramis) {
	
}
public static void atbildes(JFrame ramis) {
	
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	switch(e.getKeyCode()) {
	case 87: wNospiests=true;
		break;
	case 83: sNospiests=true;
		break;
	case 10: enterNospiests=true;
		break;
}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Nospiesta charactera kods"+e.getKeyCode());
}
}
