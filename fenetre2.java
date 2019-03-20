import java.awt.*; import javax.swing.*; import java.awt.event.* ; 
public class fenetre2 extends JFrame{ //implements actionlistener
	//TODO mettre les composants du actionlistener en attributs
	//ne pas les mettre dans le constructeur
		Bob monBob ; 
	
	public fenetre2(Bob monBob) {
		super("Bob le Blob");
		setSize(1400, 1000) ; 
		setLayout(null);
		this.monBob= monBob ; 
		
		//Panel 1, à gauche : image de bob, 4 spé, population
		JPanel partieG = new JPanel() ;
		partieG.setLayout(null);  
		partieG.setBackground(Color.GRAY);
		partieG.setBounds(0, 0, 450, 1000);
		
		//pour modifier la police
			//Font f = new Font("Serif", Font.PLAIN, 36); // par exemple
			//ton_JLabel.setFont(f); 
		
			//TODO ajouter image bob
		
		
		
		//force vitesse intelligence fertilité pop
		JLabel fo = new JLabel("Force : " +monBob.force, SwingConstants.CENTER) ; //permet de centrer
		fo.setBounds(90, 500, 260, 80);
		fo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); //bordure
		
		JLabel vi = new JLabel("Vitesse : " +monBob.vitesse, SwingConstants.CENTER) ;
		vi.setBounds(90, 600, 260, 80);
		vi.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		JLabel intell = new JLabel("Intelligence : " +monBob.intel, SwingConstants.CENTER) ;
		intell.setBounds(90, 700, 260, 80);
		intell.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		JLabel fertilite = new JLabel("Fertilité : " +monBob.fertilite, SwingConstants.CENTER) ;
		fertilite.setBounds(90, 800, 260, 80);
		fertilite.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		
		Font f = new Font("Calibri", Font.PLAIN, 30); 
		fo.setFont(f); vi.setFont(f); intell.setFont(f); fertilite.setFont(f); //change la police 
		
		fo.setOpaque(true) ; vi.setOpaque(true) ;intell.setOpaque(true) ;fertilite.setOpaque(true) ;
		fo.setBackground(Color.WHITE) ;vi.setBackground(Color.WHITE) ;intell.setBackground(Color.WHITE) ;fertilite.setBackground(Color.WHITE) ;
		partieG.add(fo) ; partieG.add(vi) ; partieG.add(intell) ; partieG.add(fertilite) ;  
		
		///Panel 2 : image du ciel : là où il y aura les évènements
		JPanel partieCiel = new JPanel() ;
		partieCiel.setLayout(null);
		partieCiel.setBackground(Color.CYAN);
		partieCiel.setBounds(450, 0, 950, 500);
		
		JLabel imageCiel = new JLabel() ;
		imageCiel.setLayout(null); 
		imageCiel.setBounds(0, 0, 950, 500);
		//imageCiel.setText("!!!!");
		imageCiel.setIcon(new ImageIcon("./Ciel-nuageux.jpg"));
		partieCiel.add(imageCiel) ;
		
				//population 
		JLabel pop = new JLabel("Population : " +monBob.population, SwingConstants.CENTER) ; //permet de centrer
		pop.setBounds(5, 5, 260, 50);
		pop.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); //bordure
		Font f2 = new Font("Calibri", Font.ITALIC, 25); 
		pop.setFont(f2); 
		pop.setOpaque(true);
		pop.setBackground(Color.WHITE) ;
		imageCiel.add(pop) ; 
		//partieCiel.add(pop) ; 
		
		//Panel 3 : là où il y a représentation graphique de la populations : va bcp bouger
		JPanel partieBas = new JPanel() ; 
		partieBas.setLayout(null);
		partieBas.setBackground(Color.GREEN);
		partieBas.setBounds(450, 500, 950, 500);
		
		//TODO : faire une matrice avec des carrés représentant chacun un Bob
		//1 case colorée = 1 bob
		//à actualiser à chaque tour
		//renvoie d'un nombre de la part de Jeu ? 
		
		
		add(partieG) ; add(partieCiel) ; add(partieBas) ;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// TODO public void actionPerformed(ActionEvent e) {	
	// }
	
	
}
