import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreChoixDesAttributs extends JFrame implements ActionListener {
    JTextField vitesseField;
    JTextField forceField;
    JTextField fertiliteField;
    JTextField intelligenceField;
    JTextField nomPopField;
    JPanel attributsPanel;
    JPanel forcePanel;
    JPanel vitessePanel;
    JPanel intelligencePanel;
    JPanel fertilitePanel;
    JPanel nomPopPanel;
    JLabel forceLabel;
    JLabel vitesseLabel;
    JLabel intelligenceLabel;
    JLabel fertiliteLabel;
    JLabel nomPopLabel;
    JLabel imageBob ; 
    JLabel regles ; 
    JButton valideButton;
    int valVitesse;
    int valFertilite;
    int valForce;
    int valIntelligence;
    String nomPop;

    Bob monBob;
    FenetreJeu maFenetreJeu;
    FenetreErreur E1;
    Jeu monJeu;

    public FenetreChoixDesAttributs (){
        //Création de la fenetre
        this.setTitle("Choix des attributs");
        this.setLayout(null);
        this.setSize(800,800);
        this.setLocation(200,0);
        this.getContentPane().setBackground(Color.darkGray);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Mon panneau de rentrée des informations
        attributsPanel = new JPanel();
        attributsPanel.setLayout(null);
        attributsPanel.setBounds(0,0,300,800);
        attributsPanel.setBackground(Color.LIGHT_GRAY);
        
        // Le bouton de validation
        valideButton = new JButton("VALIDER MON CHOIX !");
        valideButton.setLayout(null);
        valideButton.addActionListener(this);
        valideButton.setBounds(10,700,280,60);
        valideButton.setBackground(new Color(246, 184, 114));
        attributsPanel.add(valideButton);
        
        // Panneau Force 
        forcePanel = new JPanel();
        forcePanel.setLayout(null);
        forcePanel.setBounds(0,0,300,150);
        forcePanel.setBackground(new Color(204, 55, 55));
        
        //Texte Force
        forceLabel = new JLabel();
        forceLabel.setLayout(null);
        forceLabel.setText("Force");
        Font fL = new Font("Calibri", Font.PLAIN, 30); 
        forceLabel.setFont(fL); ; //change la police
        forceLabel.setBounds(25,50,100,50);
        forcePanel.add(forceLabel);

        //Champ de rentrée Force
        forceField = new JTextField();
        forceField.setLayout(null);
        forceField.setBounds(150,50,50,50);
        forceField.setBackground(Color.white);
        Font fF = new Font("Calibri", Font.PLAIN, 30); 
        forceField.setFont(fF); ; //change la police
        forcePanel.add(forceField);
        
        
        
        // Panneau Vitesse 
        vitessePanel = new JPanel();
        vitessePanel.setLayout(null);
        vitessePanel.setBounds(0,150,300,150);
        vitessePanel.setBackground(new Color(127, 219, 141));
        
        //Texte vitesse
        vitesseLabel = new JLabel();
        vitesseLabel.setLayout(null);
        vitesseLabel.setText("Vitesse");
        Font vL = new Font("Calibri", Font.PLAIN, 30); 
        vitesseLabel.setFont(vL); ; //change la police
        vitesseLabel.setBounds(25,50,100,50);
        vitessePanel.add(vitesseLabel);

        //Champ de rentrée vitesse
        vitesseField = new JTextField();
        vitesseField.setLayout(null);
        vitesseField.setBounds(150,50,50,50);
        vitesseField.setBackground(Color.white);
        Font vF = new Font("Calibri", Font.PLAIN, 30); 
        vitesseField.setFont(vF); ; //change la police
        vitessePanel.add(vitesseField);
        
        
        
        // Panneau intelligence 
        intelligencePanel = new JPanel();
        intelligencePanel.setLayout(null);
        intelligencePanel.setBounds(0,300,300,150);
        intelligencePanel.setBackground(new Color(196, 235, 239));
        
        
        //Texte intelligence
        intelligenceLabel = new JLabel();
        intelligenceLabel.setLayout(null);
        intelligenceLabel.setText("Intelligence");
        Font iL = new Font("Calibri", Font.PLAIN, 30); 
        intelligenceLabel.setFont(iL); ; //change la police
        intelligenceLabel.setBounds(25,50,150,50);
        intelligencePanel.add(intelligenceLabel);

        //Champ de rentrée intelligence
        intelligenceField = new JTextField();
        intelligenceField.setLayout(null);
        intelligenceField.setBounds(200,50,50,50);
        intelligenceField.setBackground(Color.white);
        Font iF = new Font("Calibri", Font.PLAIN, 30); 
        intelligenceField.setFont(iF); ; //change la police
        intelligencePanel.add(intelligenceField);
        
        
        
         // Panneau Fertilite 
        fertilitePanel = new JPanel();
        fertilitePanel.setLayout(null);
        fertilitePanel.setBounds(0,450,300,150);
        fertilitePanel.setBackground(new Color(226, 154, 196));
        
        //Texte Fertilite
        fertiliteLabel = new JLabel();
        fertiliteLabel.setLayout(null);
        fertiliteLabel.setText("Fertilite");
        Font feL = new Font("Calibri", Font.PLAIN, 30); 
        fertiliteLabel.setFont(feL); //change la police
        fertiliteLabel.setBounds(25,50,100,50);
        fertilitePanel.add(fertiliteLabel);

        //Champ de rentrée Fertilite
        fertiliteField = new JTextField();
        fertiliteField.setLayout(null);
        fertiliteField.setBounds(150,50,50,50);
        fertiliteField.setBackground(Color.white);
        Font feF = new Font("Calibri", Font.PLAIN, 30); 
        fertiliteField.setFont(feF); ; //change la police
        fertilitePanel.add(fertiliteField);

        // Panneau nomPop
        nomPopPanel = new JPanel();
        nomPopPanel.setLayout(null);
        nomPopPanel.setBounds(500,0,300,80);
        nomPopPanel.setBackground(new Color(235, 92, 231));
        
        //Texte nomPop
        nomPopLabel = new JLabel();
        nomPopLabel.setLayout(null);
        nomPopLabel.setText("Nom Blob");
        Font nPL = new Font("Calibri", Font.PLAIN, 30); 
        nomPopLabel.setFont(nPL); ; //change la police
        nomPopLabel.setBounds(20,25,150,40);
        nomPopPanel.add(nomPopLabel);

        //Champ de rentrée nomPop
        nomPopField = new JTextField();
        nomPopField.setLayout(null);
        nomPopField.setBounds(160,25,120,40);
        nomPopField.setBackground(Color.white);
        Font nPF = new Font("Calibri", Font.PLAIN, 30); 
        nomPopField.setFont(nPF); ; //change la police
        nomPopPanel.add(nomPopField);

        //image du Blob
        imageBob = new JLabel() ;
		imageBob.setLayout(null); 
		imageBob.setBounds(300, 220, 500,360);
		//imageCiel.setText("!!!!");
		imageBob.setIcon(new ImageIcon("./Blob.gif"));
		this.add(imageBob) ; 
		
		//regles du jeu
		regles = new JLabel() ; 
		regles.setText("<html> Bienvenue !  <br> Vous allez maintenant choisir les "
				+ "caracteristiques de votre blob, le but etant que la population soit la plus grande possible a la fin de la partie. "
				+ "Vous avez 300 points au total a repartir dans chacune des caracteristiques, sans depasser 100 points par caracteristiques."
				+ "<br> Bonne chance ! <html>") ; 
		regles.setLayout(null); 
		regles.setBounds(310, 570, 490,220);
		//regles.setOpaque(true) ;
        Font re = new Font("Calibri", Font.PLAIN, 17); 
        regles.setFont(re); 
        regles.setForeground(new Color(98,255,130));
		this.add(regles) ;
	//	fertilite = new JLabel("Fertilite : " +monBob.fertilite, SwingConstants.CENTER) ;

		attributsPanel.add(forcePanel);
        attributsPanel.add(vitessePanel);
        attributsPanel.add(intelligencePanel);
        attributsPanel.add(fertilitePanel);
        this.add(nomPopPanel);
		
        this.add(attributsPanel);
        this.setVisible(true);
    }
    
    public void actionPerformed (ActionEvent e){
        // On récupère les valeurs dans les textFields
        valVitesse=Integer.parseInt(vitesseField.getText());
        valForce=Integer.parseInt(forceField.getText());
        valIntelligence=Integer.parseInt(intelligenceField.getText());
        valFertilite=Integer.parseInt(fertiliteField.getText());
        nomPop=nomPopField.getText();
        int somme = valVitesse + valForce + valIntelligence + valFertilite ;
        if(somme<=300 && valVitesse <101 && valForce <101 && valIntelligence <101 && valFertilite<101 ) {
        monBob = new Bob(nomPop, valForce, valVitesse, valIntelligence, valFertilite); // Créer notre cher Blop

        //FenetreJeu maFenetreJeu = new FenetreJeu(monBob); // Lance le jeu
        Jeu monJeu = new Jeu(monBob);
        }else {
           FenetreErreur E1 = new FenetreErreur("ATTENTION! \n Il ne faut pas que les valeurs depassent pas 100 et que leur somme ne depasse pas 300") ; 
       }
 ;    }
}
