import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
    private int reproduction;
	
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
			reproduction = (int) (monBob.population * (5 + (2*Math.log(1+monBob.fertilite*monBob.fertilite) + (2*Math.random()-1)*3))/100);
            monBob.population += reproduction;
            
			maFenetreJeu.pop.setText("Population : " +monBob.population);
			maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Reproduction.gif"));
			maFenetreJeu.nomCata.setText("Reproduction  (+" + reproduction + ")");
            maFenetreJeu.nomCata.setOpaque(true);
            
		} else if (aleat < 0.30 && temps >= temps0 + 3*delta) { //Catastrophe
            
            temps0 = temps;
            
			System.out.println("Catastrophe");
			victimes = Cata.evenement();
            maFenetreJeu.nomCata.setOpaque(true);
            
            switch (Cata.id) { // affichage graphique de la catastrophe
                case 0: //secheresse
                    maFenetreJeu.nomCata.setText("Secheresse  (-" + victimes + ")");
                    maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Secheresse.gif"));
                	
                    break;
                case 1: //predateur
                    maFenetreJeu.nomCata.setText("Predateur  (-" + victimes + ")");
                    maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Predateur.gif"));
                
                    break;
                case 2: //intemperie
                    maFenetreJeu.nomCata.setText("Intemperie  (-" + victimes + ")");
                    maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Intemperie.gif"));
        		
                    break;
                case 3: //penurie
                    maFenetreJeu.nomCata.setText("Penurie  (-" + victimes + ")");
                    maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Penurie.jpg"));         
				
                    break;
                case 4: //maladie
                    maFenetreJeu.nomCata.setText("Maladie  (-" + victimes + ")");
                    maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Maladie.gif"));
        		
                    break;
                case 5: //gilets jaunes
                    maFenetreJeu.nomCata.setText("Gilets Jaunes  (-" + victimes + ")");
                    maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/GiletsJaunes.gif"));  
					break;
			}
                      
			if (monBob.population > victimes) {
                monBob.population -= victimes;
			} else { // evite que le nombre de population soit négatif
				monBob.population = 0;
                temps0 = temps;
			}

            maFenetreJeu.pop.setText("Population : " +monBob.population);
            maFenetreJeu.nomCata.setOpaque(true);
		}
        
        if (temps < 10000) { // affichage du chrono
            maFenetreJeu.chrono.setText(temps/60000 + ":0" + temps/1000);
        } else if (temps < 60000) {
            maFenetreJeu.chrono.setText(temps/60000 + ":" + temps/1000);
        } else if (temps < 70000) {
            maFenetreJeu.chrono.setText(temps/60000 + ":0" + (temps-60000)/1000);
        } else if (temps < 120000) {
            maFenetreJeu.chrono.setText(temps/60000 + ":" + (temps-60000)/1000);
        } else {
            maFenetreJeu.chrono.setText(temps/60000 + ":0" + (temps-120000)/1000);
        }
		
		if (temps >= temps0 + 3*delta) { // remet l'image du ciel
					maFenetreJeu.nomCata.setText("");
                    maFenetreJeu.nomCata.setOpaque(false);
					maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Ciel-nuageux.jpg"));
        	}
        
        if (monBob.population == 0 && temps > temps0 + 2*delta) { //arrete le jeu quand il n'y a plus de blobs
            monChrono.stop();
            finJeu();
        }
		
		if (temps > 240*delta) { //s'arrete au bout de 2 minutes
			monChrono.stop();
            finJeu();
		}
        
        System.out.println(monBob.population);
        victimes = 0;
        maFenetreJeu.repaint();
	}
    
    public void finJeu() {
		maFenetreJeu.nomCata.setText("Simulation terminée ! Votre score : "+monBob.population);
        maFenetreJeu.nomCata.setBounds(240, 5, 520, 60);
        maFenetreJeu.nomCata.setOpaque(true);
		maFenetreJeu.pop.setVisible(false);

		if (monBob.population < 100){
			maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Defaite.gif"));
		} else {
			maFenetreJeu.imageCiel.setIcon(new ImageIcon("./Images/Victoire.gif"));
		}
        
        maFenetreJeu.repaint();
    }
}

