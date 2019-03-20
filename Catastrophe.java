
public class Catastrophe {
	
	private Bob monBob;
	private int id;
	private double victimes; //pourcentage de victimes
	
	public Catastrophe(Bob monBob) {
		
		this.monBob = monBob; // force, intel, fertilite, vitesse
		
	}
	
	public double evenement() {
		
		id = (int) (Math.random()*5); // ID aléatoire de la catastrophe
		//id = 1;
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
		return victimes; // retourne le pourcentage de victimes de la catastrophe
	}
	
	private void secheresse() {
		double force = monBob.force;
		double intel = monBob.intel;
		
		double a = (double)(100-force)/400;
		double b = (double)(100-intel)/700;
		victimes = a*b +a +b;
		victimes += (2*Math.random()-1)*2/100; //ajoute une valeur aléatoire entre -2 et 2
	}
	
	private void predateur() {
		int force = monBob.force;
		int intel = monBob.intel;
		int vitesse = monBob.vitesse;
		
		double a = (double)(100-force)/900;
		double b = (double)(100-intel)/900;
		double c = (double)(100-vitesse)/500;
		victimes = a*b*c +a +b +c;
		victimes += (2*Math.random()-1)*2/100;
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

