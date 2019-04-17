
public class Bob {

		int force ;
		int vitesse ; 
		int intel ; 
		int fertilite ; 
		int population ; 
		String nomPop ; 
		
	public Bob (String nomPop, int force, int vitesse, int intel, int fertilite) {
		this.nomPop = nomPop ; 
		this.population = 100;
		this.force = force ;
		this.vitesse = vitesse ; 
		this.intel = intel ; 
		this.fertilite = fertilite ; 
	}

	public String toString () {
		return(nomPop+" a : "+force+" de force, "+vitesse+" de vitesse, "+intel+" d'intel, "+fertilite+" de fertilité");
	}

}
