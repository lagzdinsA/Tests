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
	String[] jautajumi = {"Kurš no šiem ir objekts?", "Kas ir objekta attribūts?","Kas ir objekta metode?",
			"Kura no šim NAV klase?","Kurš no šiem NAV klases vārds?","Kurš no šiem NAV klases objekts?",
			"Kādu funkciju pilda getteri?","Kādu funkciju pilda setteri?",
			"Kādam jābūt konstruktora nosaukumama?", "Kurš no šiem ir konstruktora izsaucējs?",};
	String[][] opcijas = { 
			{"Suns","Skriet","15cm","gulēt"}, 
			{"Objekta izsaucējs","Informācija par objektu","Rīcība ko objekts var veikt","Objekta nosaukums"},
			{"Darbība ko objekts var veikt","Objekta izdzēsējs","Darbiba kuru objekts var nozagt","Objekta nosaukums"},
			{"public class Main","class Ramis extends JFrame","final class A","public void jautajumi()"},
			{"Dārzeņi","Skolēni","Burkāns","Māšīnas"},
			{"Nīderlande","Austiņa","Valstis","Valentīns"},
			{"Tie pārbauda klases","Tie atgriež mainīgo","Ļauj lietotājam ievadīt informāciju","Tie pārstāj programmu"},
			{"Tie apzog objektus","Tie izveido konstruktorus","Tie iekapsule mainīgo","Tie nosaka mainīgo vērtības"},
			{"Vienādam ar klases vārdu","Ar mazajiem burtiem","Bez simboliem","Tādām kā pakas nosaukumam"},
			{"import java.awt.Color;","public class Main","static void jautajumi(int x)","Main myObj = new Main();"}};
	//1,2,1,4,3,3,2,4,1,4
	JLabel Numurs= new JLabel();
	Numurs.setForeground(Color.WHITE);
	Numurs.setFont(new Font("", Font.PLAIN, 20));
	Numurs.setBounds(15,-10,100,100);
	
	JLabel Jautajums= new JLabel();
	Jautajums.setForeground(Color.WHITE);
	Jautajums.setFont(new Font("", Font.PLAIN, 30));
	Jautajums.setBounds(15,-200,600,600);
	
	JLabel Atbilde1= new JLabel();
	Atbilde1.setForeground(Color.WHITE);
	Atbilde1.setFont(new Font("", Font.PLAIN, 15));
	Atbilde1.setBounds(25,150,250,250);
	
	JLabel Atbilde2= new JLabel();
	Atbilde2.setForeground(Color.WHITE);
	Atbilde2.setFont(new Font("", Font.PLAIN, 15));
	Atbilde2.setBounds(25,250,250,250);
	
	JLabel Atbilde3= new JLabel();
	Atbilde3.setForeground(Color.WHITE);
	Atbilde3.setFont(new Font("", Font.PLAIN, 15));
	Atbilde3.setBounds(250,150,250,250);
	
	JLabel Atbilde4= new JLabel();
	Atbilde4.setForeground(Color.WHITE);
	Atbilde4.setFont(new Font("", Font.PLAIN, 15));
	Atbilde4.setBounds(250,250,250,250);
	
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
				//System.out.println(izvele+" pirmais");
				if (enterNospiests==true){
					atbildes[jautajums]=1;
				}
				break;
			case 1:
				//System.out.println(izvele+" otrais");
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
	System.out.println(" pirmais");
	int[] parAtbildes= {1,2,1,4,3,3,2,4,1,4};
	int[] skaititajs= {0,0,0,0,0,0,0,0,0,0};
	int punkti=0;
	
	for(int i =0; i<10;i++) {
		if(atbildes[i]==parAtbildes[i]) {
			skaititajs[i]=1;
			punkti++;
		}
	}
	
	JLabel jaut1= new JLabel();
	if(skaititajs[0]==1) {
		jaut1.setForeground(Color.GREEN);
	}else {
		jaut1.setForeground(Color.RED);
	}
	jaut1.setFont(new Font("", Font.PLAIN, 20));
	jaut1.setText("Jautajums 1.");
	jaut1.setBounds(15,-10,100,100);
	
	JLabel jaut2= new JLabel();
	if(skaititajs[1]==1) {
		jaut2.setForeground(Color.GREEN);
	}else {
		jaut2.setForeground(Color.RED);
	}
	jaut2.setFont(new Font("", Font.PLAIN, 20));
	jaut2.setText("Jautajums 2.");
	jaut2.setBounds(15,-10,100,100);
	
	JLabel jaut3= new JLabel();
	if(skaititajs[2]==1) {
		jaut3.setForeground(Color.GREEN);
	}else {
		jaut3.setForeground(Color.RED);
	}
	jaut3.setFont(new Font("", Font.PLAIN, 20));
	jaut3.setText("Jautajums 3.");
	jaut3.setBounds(15,-10,100,100);
	
	JLabel jaut4= new JLabel();
	if(skaititajs[3]==1) {
		jaut4.setForeground(Color.GREEN);
	}else {
		jaut4.setForeground(Color.RED);
	}
	jaut4.setFont(new Font("", Font.PLAIN, 20));
	jaut4.setText("Jautajums 4.");
	jaut4.setBounds(15,-10,100,100);
	
	JLabel jaut5= new JLabel();
	if(skaititajs[4]==1) {
		jaut5.setForeground(Color.GREEN);
	}else {
		jaut5.setForeground(Color.RED);
	}
	jaut5.setFont(new Font("", Font.PLAIN, 20));
	jaut5.setText("Jautajums 5.");
	jaut5.setBounds(15,-10,100,100);
	
	JLabel jaut6= new JLabel();
	if(skaititajs[5]==1) {
		jaut6.setForeground(Color.GREEN);
	}else {
		jaut6.setForeground(Color.RED);
	}
	jaut6.setFont(new Font("", Font.PLAIN, 20));
	jaut6.setText("Jautajums 6.");
	jaut6.setBounds(15,-10,100,100);
	
	JLabel jaut7= new JLabel();
	if(skaititajs[6]==1) {
		jaut7.setForeground(Color.GREEN);
	}else {
		jaut7.setForeground(Color.RED);
	}
	jaut7.setFont(new Font("", Font.PLAIN, 20));
	jaut7.setText("Jautajums 7.");
	jaut7.setBounds(15,-10,100,100);
	
	JLabel jaut8= new JLabel();
	if(skaititajs[7]==1) {
		jaut8.setForeground(Color.GREEN);
	}else {
		jaut8.setForeground(Color.RED);
	}
	jaut8.setFont(new Font("", Font.PLAIN, 20));
	jaut8.setText("Jautajums 8.");
	jaut8.setBounds(15,-10,100,100);
	
	JLabel jaut9= new JLabel();
	if(skaititajs[8]==1) {
		jaut9.setForeground(Color.GREEN);
	}else {
		jaut9.setForeground(Color.RED);
	}
	jaut9.setFont(new Font("", Font.PLAIN, 20));
	jaut9.setText("Jautajums 9.");
	jaut9.setBounds(15,-10,100,100);
	
	JLabel jaut10= new JLabel();
	if(skaititajs[9]==1) {
		jaut10.setForeground(Color.GREEN);
	}else {
		jaut10.setForeground(Color.RED);
	}
	jaut10.setFont(new Font("", Font.PLAIN, 20));
	jaut10.setText("Jautajums 10.");
	jaut10.setBounds(15,-10,100,100);
	
	JLabel Atpakal= new JLabel();
	Atpakal.setForeground(Color.WHITE);
	Atpakal.setFont(new Font("", Font.PLAIN, 20));
	jaut1.setText("Atpakal [Esc]");
	Atpakal.setBounds(15,-10,100,100);
	
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
