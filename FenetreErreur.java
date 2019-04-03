import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FenetreErreur extends JFrame{
	String message ; 
	JPanel fond;
	public FenetreErreur(String m) {
		this.setTitle("Message d'erreur");
		message = m ; 
		this.setLayout(null);
		this.setBounds(125,350,1200, 200); 
		fond = new JPanel();
		fond.setLayout(null);
		fond.setBounds(0,0,1200,200);
		fond.setBackground(Color.red);
		JLabel erreur = new JLabel(message) ; //permet de centrer
		Font e = new Font("Tahoma", Font.PLAIN, 20); 
		erreur.setFont(e);
		erreur.setBounds(0, 50, 1200, 100);
		//erreur.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); //bordure
		erreur.setLayout(null);
		this.add(erreur) ; 
		this.add(fond);
		
		this.setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
