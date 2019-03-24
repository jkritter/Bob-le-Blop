
public class Bob {

		int force ;
		int vitesse ; 
		int intel ; 
		int fertilite ; 
		int population ; 
		String nomPop ; 
		
						//mode al�atoire ? 
	public Bob(String nomPop, int force, int vitesse, int intel, int fertilite) {
		this.nomPop = nomPop ; 
		this.population = 10 ; // � changer si jamais
		this.force = force ;
		this.vitesse = vitesse ; 
		this.intel = intel ; 
		this.fertilite = fertilite ; 
		// v�rifier que le total fasse moins que 500 AVANT d'envoyer au constructeur	
	}

	public String toString() {
		return("Bob a : "+force+"de force, "+vitesse+"de vitesse, "+intel+"d'intel, "+fertilite+"de fertilité");
	}

}
