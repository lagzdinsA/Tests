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
		this.setLayout(null);
		this.setVisible(true);
		sakums(this);
 }
 
public static void sakums(JFrame ramis) {
	
	SwingUtilities.updateComponentTreeUI(ramis);
	ramis.invalidate();
	ramis.validate();
	ramis.repaint();
	
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
	SwingUtilities.updateComponentTreeUI(ramis);
	ramis.revalidate();
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
				ramis.revalidate();
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
				ramis.revalidate();
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
	
	SwingUtilities.updateComponentTreeUI(ramis);
	
	JLabel Tituls= new JLabel();
	Tituls.setText("Paskaidrojums");
	Tituls.setBounds(150,0,200,200);
	Tituls.setForeground(Color.WHITE);
	Tituls.setFont(new Font("", Font.PLAIN, 30));
	
	JLabel Paskaidrojums= new JLabel();
	Paskaidrojums.setText("Šī programma ir tests, kurš pārbaudīs tavas zināšanas par OOP.");
	Paskaidrojums.setBounds(20,-100,500,500);
	Paskaidrojums.setForeground(Color.WHITE);
	Paskaidrojums.setFont(new Font("", Font.PLAIN, 14));
	
	JLabel Paskaidrojums2= new JLabel();
	Paskaidrojums2.setText("Kusties ar W un S, apstiprini ar ENTER.");
	Paskaidrojums2.setBounds(20,-50,500,500);
	Paskaidrojums2.setForeground(Color.WHITE);
	Paskaidrojums2.setFont(new Font("", Font.PLAIN, 14));
	
	JLabel Turpinat= new JLabel();
	Turpinat.setText("Esc lai ietu atpakaļ");
	Turpinat.setBounds(25,300,200,200);
	Turpinat.setForeground(Color.WHITE);
	Turpinat.setFont(new Font("", Font.PLAIN, 20));
	//JLabel tests= new JLabel();
	ramis.add(Tituls);
	ramis.add(Paskaidrojums);
	ramis.add(Paskaidrojums2);
	ramis.add(Turpinat);
	ramis.validate();
	ramis.invalidate();
	ramis.validate();
	ramis.repaint();
	//ramis.add(tests);
	//Tituls.setText("tata");
	do {
	Tituls.setText("Paskaidrojums");
	Paskaidrojums.setText("Šī programma ir tests, kurš pārbaudīs tavas zināšanas par OOP.");
	Paskaidrojums2.setText("Kusties ar W un S, apstiprini ar ENTER.");
	Turpinat.setText("Esc lai ietu atpakaļ");
	}while(escNospiests==false);
	Tituls.setText(" ");
	Paskaidrojums.setText(" ");
	Paskaidrojums2.setText(" ");
	Turpinat.setText(" ");	
	escNospiests=false;
	sakums(ramis);	
	SwingUtilities.updateComponentTreeUI(ramis);		
		}


public static void jautajumi(JFrame ramis) {
	
	SwingUtilities.updateComponentTreeUI(ramis);
	
	int[] atbildes = {0,0,0,0,0,0,0,0,0,0};
	int jautajums;
	int izvele=0;
	String[] jautajumi = {"Ka tevi sauc?", "Cik tu esi garšs?"};
	String[][] opcijas = { {"bobs","roks","tops","mobs"}, {"123m","2km","3mm","4cm"} };

	
	JLabel Numurs= new JLabel();
	Numurs.setForeground(Color.WHITE);
	Numurs.setFont(new Font("", Font.PLAIN, 20));
	Numurs.setBounds(15,-10,100,100);
	
	JLabel Jautajums= new JLabel();
	Jautajums.setForeground(Color.WHITE);
	Jautajums.setFont(new Font("", Font.PLAIN, 30));
	Jautajums.setBounds(50,-150,500,500);
	
	JLabel Atbilde1= new JLabel();
	Atbilde1.setForeground(Color.WHITE);
	Atbilde1.setFont(new Font("", Font.PLAIN, 15));
	Atbilde1.setBounds(100,150,250,250);
	
	JLabel Atbilde2= new JLabel();
	Atbilde2.setForeground(Color.WHITE);
	Atbilde2.setFont(new Font("", Font.PLAIN, 15));
	Atbilde2.setBounds(100,250,250,250);
	
	JLabel Atbilde3= new JLabel();
	Atbilde3.setForeground(Color.WHITE);
	Atbilde3.setFont(new Font("", Font.PLAIN, 15));
	Atbilde3.setBounds(300,150,250,250);
	
	JLabel Atbilde4= new JLabel();
	Atbilde4.setForeground(Color.WHITE);
	Atbilde4.setFont(new Font("", Font.PLAIN, 15));
	Atbilde4.setBounds(300,250,250,250);
	
	ramis.add(Numurs);
	ramis.add(Jautajums);
	ramis.add(Atbilde1);
	ramis.add(Atbilde2);
	ramis.add(Atbilde3);
	ramis.add(Atbilde4);
	for (jautajums=0;jautajums<10;jautajums++) {
		Numurs.setText(jautajums+".");
		Jautajums.setText(jautajumi[jautajums]);
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
			if(izvele>3) {
				izvele=3;
			}
			enterNospiests=false;
			switch(izvele) {
			case 0:
				Atbilde1.setText(opcijas[jautajums][0]+" <");
				Atbilde2.setText(opcijas[jautajums][1]+"");
				Atbilde3.setText(opcijas[jautajums][2]+"");
				Atbilde4.setText(opcijas[jautajums][3]+"");
				System.out.println(izvele+" pirmais");
				if (enterNospiests==true){
					atbildes[jautajums]=1;
				}
				break;
			case 1:
				System.out.println(izvele+" otrais");
				Atbilde1.setText(opcijas[jautajums][0]+"");
				Atbilde2.setText(opcijas[jautajums][1]+" <");
				Atbilde3.setText(opcijas[jautajums][2]+"");
				Atbilde4.setText(opcijas[jautajums][3]+"");
				if (enterNospiests==true){
					atbildes[jautajums]=2;
				}
				break;
			case 2:
				Atbilde1.setText(opcijas[jautajums][0]+"");
				Atbilde2.setText(opcijas[jautajums][1]+"");
				Atbilde3.setText(opcijas[jautajums][2]+" <");
				Atbilde4.setText(opcijas[jautajums][3]+"");
				if (enterNospiests==true){
					atbildes[jautajums]=3;
				}
				break;
			case 3:
				Atbilde1.setText(opcijas[jautajums][0]+"");
				Atbilde2.setText(opcijas[jautajums][1]+"");
				Atbilde3.setText(opcijas[jautajums][2]+"");
				Atbilde4.setText(opcijas[jautajums][3]+" <");
				if (enterNospiests==true){
					atbildes[jautajums]=4;
				}
				break;
			}
		}while(enterNospiests==false);
		enterNospiests=false;
	}
	rezultati(ramis, atbildes);
}


public static void rezultati(JFrame ramis, int[] atbildes) {
	int[] parAtbildes= {1,2,1,4,3,3,2,4,1,4};
	int[] skaititajs= {0,0,0,0,0,0,0,0,0,0};
	int punkti=0;
	for(int i =0; i<11;i++) {
		if(atbildes[i]==parAtbildes[i]) {
			skaititajs[i]=1;
			punkti++;
		}
	}
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
