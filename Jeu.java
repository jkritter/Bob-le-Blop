import javax.swing.Timer; 
import java.awt.event.*;

public class Jeu implements ActionListener{
	
	FenetreJeu maFenetreJeu;
	public Bob monBob;
	private int temps;
    private int temps0;
	private Timer monChrono;
    private int delta;
	private int eve;
	private Catastrophe Cata;
	private int victimes;
	
	public Jeu (Bob monBob) {
		
		this.monBob = monBob;
		maFenetreJeu = new FenetreJeu(monBob);
		
        this.delta = 500;
		this.monChrono = new Timer(delta,this);
		this.temps = 0;
		this.monChrono.start();
		this.Cata = new Catastrophe(monBob);
		
	}
	
	public void actionPerformed(ActionEvent e){ // boucle de jeu, s'execute toutes les 500 ms
		temps += delta;
		double aleat = Math.random(); 
		if (aleat < 0.15 && temps >= temps0 + 3*delta) { //Reproduction
            
            temps0 = temps; // place un marqueur temporel pour éviter que les actions se succedent trop rapidement
            
			System.out.println("Reproduction");
			monBob.population += (int) (monBob.population * (5 + (2*Math.log(1+monBob.fertilite*monBob.fertilite) + (2*Math.random()-1)*3))/100);
			maFenetreJeu.repaint();
            
		} else if (aleat < 0.30 && temps >= temps0 + 3*delta) { //Catastrophe
            
            temps0 = temps;
            
			System.out.println("Catastrophe");
			victimes = Cata.evenement();
            switch (Cata.id) { // affichage graphique de la catastrophe
                case 0: //secheresse
                
                    break;
                case 1: //predateur
                
                    break;
                case 2: //intemperie
                
                    break;
                case 3: //penurie
                
                    break;
                case 4: //maladie
                
                    break;
                case 5: //gilletsJaunes
                
                    break;
            }
            
			if (monBob.population > victimes) {
					monBob.population -= victimes;
			} else { // arrete le jeu si il n'y a plus d'individus
				monBob.population = 0;
                monChrono.stop();
                finJeu();
			}
            
		maFenetreJeu.repaint();
		}
		System.out.println(monBob.population);
		victimes = 0;
		
		if (temps > 240*delta) { //s'arrete au bout de 2 minutes
			monChrono.stop();
            finJeu();
		}
	}
    
    public void finJeu() {
        System.out.println("C'est fini");
    }
}

