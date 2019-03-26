import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreChoixDesAttributs extends JFrame implements ActionListener {
    JTextField vitesseField;
    JTextField forceField;
    JTextField fertiliteField;
    JTextField inteligenceField;
    JTextField nomPopField;
    JPanel attributsPanel;
    JPanel forcePanel;
    JPanel vitessePanel;
    JPanel inteligencePanel;
    JPanel fertilitePanel;
    JPanel nomPopPanel;
    JLabel forceLabel;
    JLabel vitesseLabel;
    JLabel inteligenceLabel;
    JLabel fertiliteLabel;
    JLabel nomPopLabel;
    JButton valideButton;
    int valVitesse;
    int valFertilite;
    int valForce;
    int valInteligence;
    String nomPop;

    Bob monBob;
    FenetreJeu maFenetreJeu;

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
        
        
        
        // Panneau Inteligence 
        inteligencePanel = new JPanel();
        inteligencePanel.setLayout(null);
        inteligencePanel.setBounds(0,300,300,150);
        inteligencePanel.setBackground(new Color(196, 235, 239));
        
        
        //Texte Inteligence
        inteligenceLabel = new JLabel();
        inteligenceLabel.setLayout(null);
        inteligenceLabel.setText("Inteligence");
        Font iL = new Font("Calibri", Font.PLAIN, 30); 
        inteligenceLabel.setFont(iL); ; //change la police
        inteligenceLabel.setBounds(25,50,150,50);
        inteligencePanel.add(inteligenceLabel);

        //Champ de rentrée inteligence
        inteligenceField = new JTextField();
        inteligenceField.setLayout(null);
        inteligenceField.setBounds(200,50,50,50);
        inteligenceField.setBackground(Color.white);
        Font iF = new Font("Calibri", Font.PLAIN, 30); 
        inteligenceField.setFont(iF); ; //change la police
        inteligencePanel.add(inteligenceField);
        
        
        
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
        fertiliteLabel.setFont(feL); ; //change la police
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
        nomPopLabel.setText("Nom Blop");
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

        

		attributsPanel.add(forcePanel);
        attributsPanel.add(vitessePanel);
        attributsPanel.add(inteligencePanel);
        attributsPanel.add(fertilitePanel);
        this.add(nomPopPanel);
		
        this.add(attributsPanel);
        this.setVisible(true);
    }
    
    public void actionPerformed (ActionEvent e){
        valVitesse=Integer.parseInt(vitesseField.getText());
        // System.out.println(valVitesse);
        valForce=Integer.parseInt(forceField.getText());
        valInteligence=Integer.parseInt(inteligenceField.getText());
        valFertilite=Integer.parseInt(fertiliteField.getText());
        nomPop=nomPopField.getText();
        
        monBob = new Bob(nomPop, valForce, valVitesse, valInteligence, valFertilite);

       FenetreJeu maFenetreJeu = new FenetreJeu(monBob);
    }
}