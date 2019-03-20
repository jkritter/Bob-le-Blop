
public class Bob {

		int force ;
		int vitesse ; 
		int intel ; 
		int fertilite ; 
		int population ; 
		String nomPop ; 
		
						//mode aléatoire ? 
	public Bob(String nomPop, int force, int vitesse, int intel, int fertilite) {
		this.nomPop = nomPop ; 
		this.population = 10 ; // à changer si jamais
		this.force = force ;
		this.vitesse = vitesse ; 
		this.intel = intel ; 
		this.fertilite = fertilite ; 
		// vérifier que le total fasse moins que 500 AVANT d'envoyer au constructeur	
	}

}
