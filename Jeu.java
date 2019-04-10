import javax.swing.Timer; 
import java.awt.event.*;

public class Jeu implements ActionListener{
	
	FenetreJeu maFenetreJeu;
	public Bob monBob;
	private int temps;
	private Timer monChrono;
	private int eve=0;
	private Catastrophe Cata;
	private int victimes;
	
	public Jeu (Bob monBob) {
		
		this.monBob = monBob;
		maFenetreJeu = new FenetreJeu(monBob);
		
		this.monChrono = new Timer(500,this);
		temps = 0;
		monChrono.start();
		this.Cata = new Catastrophe(monBob);
		}
	
	public void actionPerformed(ActionEvent e){
		temps+=500;
		//System.out.println("t");
		double aleat = Math.random(); 
		if (aleat < 0.1) { //Reproduction
			System.out.println("Reproduction");
			monBob.population += (int) (monBob.population * (5 + (2*Math.log(1+monBob.fertilite*monBob.fertilite) + (2*Math.random()-1)*3))/100);
			maFenetreJeu.repaint();
		} else if (aleat < 0.2) { //Catastrophe
			System.out.println("Catastrophe");
			victimes = Cata.evenement();
			if (monBob.population > victimes) {
					monBob.population -= victimes;
			} else {
				monBob.population = 0;
			}
		maFenetreJeu.repaint();
		}
		System.out.println(monBob.population);
		victimes = 0;
		
		if (temps > 120000) {
			monChrono.stop();
			System.out.println("C'est fini");
		}
	}
}

