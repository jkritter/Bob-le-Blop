import javax.swing.Timer; 
import java.awt.event.*;

public class Jeu implements ActionListener{
	
	FenetreJeu maFenetreJeu;
	public Bob monBob;
	private int temps;
	private Timer monChrono;
	private int eve=0;
	
	public Jeu (Bob monBob) {
		
		this.monBob = monBob;
		this.monChrono = new Timer(100,this);
		temps = 0;
		monChrono.start();
		
		jouer();
	}
	
	public void jouer() {
		maFenetreJeu = new FenetreJeu(monBob); // Lance la fenetre du jeu
		//System.out.println("a");
		boolean enJeu = true;
		
		while (enJeu) {
			//System.out.println("heho");
			if (eve == 1) {
				System.out.println("Reproduction");
				eve = 0;
			} else if (eve == 2) {
				System.out.println("Catastrophe");
				eve = 0;
			}
			maFenetreJeu.setVisible(true);
		}
	}
	
	public void actionPerformed(ActionEvent e){
		temps+=100;
		System.out.println("t");
		double aleat = Math.random(); 
		if (aleat < 0.1) { //Reproduction
			eve = 1;
			//System.out.println("Reproduction");
		} else if (aleat < 0.2) { //Catastrophe
			eve = 2;
			//System.out.println("Catastrophe");
		} else { //Rien ne se passe
			eve = 0;
		}
	}
}

