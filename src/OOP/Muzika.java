package OOP;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Muzika {

	Clip clip;
	URL muzikasURL[] = new URL[3];
	
	public Muzika() {
		
		muzikasURL[0] = getClass().getResource("/Skanas/Muzika.wav");
		muzikasURL[1] = getClass().getResource("/Skanas/cursor.wav");
		muzikasURL[2] = getClass().getResource("/Skanas/speak.wav");
		
	}
	
	public void noteiktFailu(int i) {
		try {
		AudioInputStream ais = AudioSystem.getAudioInputStream(muzikasURL[i]);
		clip = AudioSystem.getClip();
		clip.open(ais);
		
		}catch(Exception e) {		
		}
	}
	public void spelet() {
		clip.start();
	}
	public void loop() {
		
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public void beigt() {
		
		clip.stop();
	}
}



