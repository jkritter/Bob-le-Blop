import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreChoixDesAttributs extends JFrame implements ActionListener {
    JTextField vitesseField;
    JTextField forceField;
    JTextField fertiliteField;
    JTextField inteligenceField;
    JPanel attributsPanel;
    JPanel vitessePanel;
    JLabel vitesseLabel;
    JButton valideButton;
    int valVitesse;
    int valFecondite;
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
        JPanel attributsPanel = new JPanel();
        attributsPanel.setLayout(null);
        attributsPanel.setBounds(0,0,300,800);
        attributsPanel.setBackground(Color.LIGHT_GRAY);
        
        // Le bouton de validation
        JButton valideButton = new JButton("Valider mon choix !");
        valideButton.setLayout(null);
        valideButton.addActionListener(this);
        valideButton.setBounds(25,700,250,50);
        valideButton.setBackground(Color.CYAN);
        attributsPanel.add(valideButton);
        
        // Panneau Vitesse 
        JPanel vitessePanel = new JPanel();
        vitessePanel.setLayout(null);
        vitessePanel.setBounds(0,0,300,200);
        vitessePanel.setBackground(Color.YELLOW);
        
        //Texte vitesse
        JLabel vitesseLabel = new JLabel();
        vitesseLabel.setLayout(null);
        vitesseLabel.setText("Vitesse");
        vitesseLabel.setBounds(25,10,100,50);
        vitesseLabel.setBackground(Color.white);
        vitessePanel.add(vitesseLabel);

        //Champ de rentrée vitesse
        JTextField vitesseField = new JTextField();
        vitesseField.setLayout(null);
        vitesseField.setBounds(25,60,50,50);
        vitesseField.setBackground(Color.white);
        vitessePanel.add(vitesseField);

        attributsPanel.add(vitessePanel);

        this.add(attributsPanel);
        this.setVisible(true);
    }
    
    public void actionPerformed (ActionEvent e){
        valVitesse=Integer.parseInt(vitesseField.getText());
        System.out.println(valVitesse);
        // valForce=Integer.parseInt(forceField.getText());
        // valInteligence=Integer.parseInt(inteligenceField.getText());
        // valFecondite=Integer.parseInt(feconditeField.getText());
    }
}
