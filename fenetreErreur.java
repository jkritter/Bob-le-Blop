import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FenetreErreur extends JFrame{
	String message ; 

	public FenetreErreur(String m) {
		this.setTitle("Message d'erreur");
		message = m ; 
		this.setBounds(125,350,550, 100) ; 
		this.setLayout(null);
		JLabel erreur = new JLabel(message) ; //permet de centrer
		erreur.setBounds(0, 0, 550, 100);
		erreur.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); //bordure
		erreur.setLayout(null);
		this.add(erreur) ; 
		
		this.setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
