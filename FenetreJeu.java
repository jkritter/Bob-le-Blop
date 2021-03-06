import java.awt.*; import javax.swing.*; import java.awt.event.* ; 

public class FenetreJeu extends JFrame{ 
		Bob monBob ; 
		JPanel partieG ;	JPanel partieCiel ;
		JLabel fo ; JLabel vi ; JLabel intell ; JLabel fertilite ;  JLabel imageCiel ; JLabel pop ; JLabel nomPop; JLabel imageBob ; JLabel nomCata; JLabel chrono ;
		FenetreMatrice partieBas ; 
		
	public FenetreJeu(Bob monBob) {
		super("Bob le Blob");
		setSize(1400, 1000) ; 
		setLayout(null);
		this.setResizable(false);
		this.monBob= monBob ; 
		
		//Panel 1, A gauche : image de bob, 4 spe, population
		partieG = new JPanel() ;
		partieG.setLayout(null);  
		partieG.setBackground(Color.GRAY);
		partieG.setBounds(0, 0, 450, 1000);
		
		 //image du Blob
        imageBob = new JLabel() ;
		imageBob.setLayout(null); 
		imageBob.setBounds(0, 0, 450,360);
		imageBob.setIcon(new ImageIcon("./Images/Blob.gif"));
		partieG.add(imageBob) ; 
		
		//force vitesse intelligence fertilit� pop
		fo = new JLabel("Force : " +monBob.force, SwingConstants.CENTER) ; //permet de centrer
		fo.setBounds(90, 500, 260, 80);
		fo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); //bordure
		
		vi = new JLabel("Vitesse : " +monBob.vitesse, SwingConstants.CENTER) ;
		vi.setBounds(90, 600, 260, 80);
		vi.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		intell = new JLabel("Intelligence : " +monBob.intel, SwingConstants.CENTER) ;
		intell.setBounds(90, 700, 260, 80);
		intell.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		fertilite = new JLabel("Fertilite : " +monBob.fertilite, SwingConstants.CENTER) ;
		fertilite.setBounds(90, 800, 260, 80);
		fertilite.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		nomPop = new JLabel(monBob.nomPop, SwingConstants.CENTER) ;
		nomPop.setBounds(80, 400, 280, 80);
		nomPop.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

		Font f = new Font("Calibri", Font.PLAIN, 30);
		Font fP = new Font("Calibri", Font.PLAIN, 40);  
		fo.setFont(f); vi.setFont(f); intell.setFont(f); fertilite.setFont(f); nomPop.setFont(fP); //change la police 
		
		fo.setOpaque(true) ; vi.setOpaque(true) ;intell.setOpaque(true) ;fertilite.setOpaque(true); nomPop.setOpaque(true);;
		fo.setBackground(Color.WHITE) ;vi.setBackground(Color.WHITE) ;intell.setBackground(Color.WHITE) ;fertilite.setBackground(Color.WHITE) ; nomPop.setBackground(new Color(106, 223, 135));
		partieG.add(fo) ; partieG.add(vi) ; partieG.add(intell) ; partieG.add(fertilite) ; partieG.add(nomPop);
		
		///Panel 2 : image du ciel : la ou il y aura les evenements
		partieCiel = new JPanel() ;
		partieCiel.setLayout(null);
		partieCiel.setBackground(Color.lightGray);
		partieCiel.setBounds(450, 0, 950, 500);
		
		imageCiel = new JLabel() ;
		imageCiel.setLayout(null); 
		imageCiel.setBounds(0, 0, 950, 500);
		imageCiel.setIcon(new ImageIcon("./Images/Ciel-nuageux.jpg"));
		partieCiel.add(imageCiel) ;
		
				// actualisation de la population 
		pop = new JLabel("Population : " +monBob.population, SwingConstants.CENTER) ; //permet de centrer
		pop.setText("Population : " +monBob.population);
		pop.setBounds(5, 5, 260, 50);
		pop.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); //bordure
		Font f2 = new Font("Calibri", Font.ITALIC, 25); 
		pop.setFont(f2); 
		pop.setOpaque(true);
		pop.setBackground(Color.WHITE) ;
		imageCiel.add(pop) ; 								
		
        chrono = new JLabel("", SwingConstants.CENTER) ;
        chrono.setText("0:00");
        chrono.setBounds(860, 5, 80, 50);
        chrono.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        Font f4 = new Font("Calibri", Font.PLAIN, 25);
        chrono.setFont(f4);
        chrono.setOpaque(true);
        chrono.setBackground(Color.WHITE) ;
        imageCiel.add(chrono);
        
		nomCata = new JLabel("", SwingConstants.CENTER) ; //permet de centrer
		nomCata.setText("");
		nomCata.setBounds(0, 0, 1000, 60);
		Font f3 = new Font("Calibri", Font.BOLD, 30); 
		nomCata.setFont(f3);
		imageCiel.add(nomCata) ;
		
		//Panel 3 : la ou ilya une reprentation graphique de la populations : va bcp bouger
		partieBas = new FenetreMatrice(monBob) ; 
		partieBas.setLayout(null);
		partieBas.setBounds(450, 500, 950, 500);		
		
		add(partieG) ; add(partieCiel) ; add(partieBas) ;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
