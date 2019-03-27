import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class fenetreErreur extends JFrame{
	String message ; 
	public fenetreErreur(String m) {
		setName("Message d'erreur");
		message = m ; 
		setSize(200, 100) ; 
		setLayout(null);
		JLabel erreur = new JLabel(message) ; //permet de centrer
		erreur.setBounds(0, 0, 200, 100);
		erreur.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); //bordure
		erreur.setLayout(null);
		add(erreur) ; 
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
