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
    JLabel forceLabel;
    JLabel vitesseLabel;
    JLabel inteligenceLabel;
    JLabel fertiliteLabel;
    JButton valideButton;
    int valVitesse;
    int valFertilite;
    int valForce;
    int valInteligence;

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
        valideButton = new JButton("Valider mon choix !");
        valideButton.setLayout(null);
        valideButton.addActionListener(this);
        valideButton.setBounds(25,725,250,40);
        valideButton.setBackground(Color.CYAN);
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
        forceLabel.setBounds(25,25,100,50);
        forcePanel.add(forceLabel);

        //Champ de rentrée Force
        forceField = new JTextField();
        forceField.setLayout(null);
        forceField.setBounds(150,25,25,25);
        forceField.setBackground(Color.white);
        forcePanel.add(forceField);
        
        
        
        // Panneau Vitesse 
        vitessePanel = new JPanel();
        vitessePanel.setLayout(null);
        vitessePanel.setBounds(0,150,300,150);
        vitessePanel.setBackground(new Color(196, 235, 239));
        
        //Texte vitesse
        vitesseLabel = new JLabel();
        vitesseLabel.setLayout(null);
        vitesseLabel.setText("Vitesse");
        vitesseLabel.setBounds(25,25,100,50);
        vitessePanel.add(vitesseLabel);

        //Champ de rentrée vitesse
        vitesseField = new JTextField();
        vitesseField.setLayout(null);
        vitesseField.setBounds(150,25,25,25);
        vitesseField.setBackground(Color.white);
        vitessePanel.add(vitesseField);
        
        
        
        // Panneau Inteligence 
        inteligencePanel = new JPanel();
        inteligencePanel.setLayout(null);
        inteligencePanel.setBounds(0,300,300,150);
        inteligencePanel.setBackground(new Color(127, 219, 141));
        
        //Texte Inteligence
        inteligenceLabel = new JLabel();
        inteligenceLabel.setLayout(null);
        inteligenceLabel.setText("Inteligence");
        inteligenceLabel.setBounds(25,25,100,50);
        inteligencePanel.add(inteligenceLabel);

        //Champ de rentrée inteligence
        inteligenceField = new JTextField();
        inteligenceField.setLayout(null);
        inteligenceField.setBounds(150,25,25,25);
        inteligenceField.setBackground(Color.white);
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
        fertiliteLabel.setBounds(25,25,100,50);
        fertilitePanel.add(fertiliteLabel);

        //Champ de rentrée Fertilite
        fertiliteField = new JTextField();
        fertiliteField.setLayout(null);
        fertiliteField.setBounds(150,25,25,25);
        fertiliteField.setBackground(Color.white);
        fertilitePanel.add(fertiliteField);

		attributsPanel.add(forcePanel);
        attributsPanel.add(vitessePanel);
        attributsPanel.add(inteligencePanel);
        attributsPanel.add(fertilitePanel);
		
        this.add(attributsPanel);
        this.setVisible(true);
    }
    
    public void actionPerformed (ActionEvent e){
        valVitesse=Integer.parseInt(vitesseField.getText());
        System.out.println(valVitesse);
        valForce=Integer.parseInt(forceField.getText());
        valInteligence=Integer.parseInt(inteligenceField.getText());
        valFertilite=Integer.parseInt(fertiliteField.getText());
        String nomPop=nomPopField.getText();
        
        Bob monBob = new Bob(nomPop, valForce, valVitesse, valInteligence, valFertilite);
    }
}
