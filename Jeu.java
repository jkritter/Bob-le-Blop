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
		
		//jouer();
	}
	
	//~ public void jouer() {
		//~ //System.out.println("a");
		//~ boolean enJeu = true;
		//~ //maFenetreJeu = new FenetreJeu(monBob); // Lance la fenetre du jeu
		//~ int victimes;
		//~ while (enJeu) {
			//~ //System.out.println("heho");
			//~ if (eve == 1) {
				//~ System.out.println("Reproduction");
				
				//~ eve = 0;
			//~ } else if (eve == 2) {
				//~ System.out.println("Catastrophe");
				//~ victimes = Cata.evenement();
				
				//~ if (monBob.population > victimes) {
					//~ monBob.population -= victimes;
				//~ } else {
					//~ monBob.population = 0;
				//~ }
				//~ System.out.println(monBob.population);
				//~ eve = 0;
			//~ }
		//~ }
	//~ }
	
	public void actionPerformed(ActionEvent e){
		temps+=500;
		//System.out.println("t");
		double aleat = Math.random(); 
		if (aleat < 0.1) { //Reproduction
			System.out.println("Reproduction");
			monBob.population += (int) (monBob.population * (5 + (2*Math.log(1+monBob.fertilite*monBob.fertilite) + (2*Math.random()-1)*3))/100);
			maFenetreJeu.repaint();
			maFenetreJeu.pop.setText("Population : " +monBob.population);
		} else if (aleat < 0.2) { //Catastrophe
			System.out.println("Catastrophe");
			victimes = Cata.evenement();
			if (monBob.population > victimes) {
					monBob.population -= victimes;
			} else {
				monBob.population = 0;
			}
		maFenetreJeu.repaint();
		maFenetreJeu.pop.setText("Population : " +monBob.population);
		}
		System.out.println(monBob.population);
		victimes = 0;
		
		if (temps > 120000) {
			monChrono.stop();
			System.out.println("C'est fini");
		}
	}
}

