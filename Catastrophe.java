
public class Catastrophe {
	
	private Bob monBob;
	private int id;
	private double victimes; //pourcentage de victimes
	
	public Catastrophe(Bob monBob) {
		
		this.monBob = monBob; // force, intel, fertilite, vitesse
		
	}
	
	public double evenement() {
		
		id = (int) (Math.random()*5); // ID aléatoire de la catastrophe
		switch (id) {
			case 0:
				secheresse();
				break;
			case 1:
				predateur();
				break;
			case 2:
				intemperie();
				break;
			case 3:
				penurie();
				break;
			case 4:
				maladie();
				break;
			case 5:
				gilletJaune();
				break;
		}
		//victimes = 0.15;
		//victimes += (2*Math.random()-1)/10;
		return victimes; // retourne le pourcentage de victimes de la catastrophe

	}
	
	private void secheresse() {
		int force = monBob.force;
		int intel = monBob.intel;
		
		
	}
	
	private void predateur() {
		int force = monBob.force;
		int intel = monBob.intel;
		int vitesse = monBob.vitesse;
	}
	
	private void intemperie() {
		int force = monBob.force;
		int intel = monBob.intel;
		int vitesse = monBob.vitesse;
	}
	
	private void penurie() {
		int force = monBob.force;
		int intel = monBob.intel;
	}
	
	private void maladie() {
		int force = monBob.force;
	}
	
	private void gilletJaune() {
		int vitesse = monBob.vitesse;
	}

}

