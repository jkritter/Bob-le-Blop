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
		//TODO créer 3 panels et ajouter les composants 
		
		//Panel 1, à gauche : image de bob, 4 spé
		JPanel partieG = new JPanel() ;
		partieG.setLayout(null);  
		partieG.setBackground(Color.GRAY);
		partieG.setBounds(0, 0, 450, 1000);
		
		//TODO mofidier la police 
			//Font f = new Font("Serif", Font.PLAIN, 36); // par exemple
			// ton_JLabel.setFont(f); 
		
			//TODO ajouter image bob
		//force vitesse intelligence fertilité pop
		JLabel fo = new JLabel("Force : " +monBob.force) ;
		fo.setBounds(10, 500, 200, 200);
		
		JLabel vi = new JLabel("Vitesse : " +monBob.vitesse) ;
		vi.setBounds(20, 600, 100, 100);
		
		JLabel intell = new JLabel("Intelligence : " +monBob.intel) ;
		intell.setBounds(30, 700, 100, 100);
		
		JLabel fertilite = new JLabel("Fertilité : " +monBob.fertilite) ;
		fertilite.setBounds(40, 800, 100, 100);
		
		
		partieG.add(fo) ; partieG.add(vi) ; partieG.add(intell) ; partieG.add(fertilite) ;  
		
		///Panel 2 : image du ciel : là où il y aura les évènements
		JPanel partieCiel = new JPanel() ;
		partieCiel.setLayout(null);
		partieCiel.setBackground(Color.CYAN);
		partieCiel.setBounds(450, 0, 950, 500);
		
		//Panel 3 : là où il y a représentation graphique de la populations : va bcp bouger
		JPanel partieBas = new JPanel() ; 
		partieBas.setLayout(null);
		partieBas.setBackground(Color.GREEN);
		partieBas.setBounds(450, 500, 950, 500);
		
		add(partieG) ; add(partieCiel) ; add(partieBas) ;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// TODO public void actionPerformed(ActionEvent e) {	
	// }
	
	
}
