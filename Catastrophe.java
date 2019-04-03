
public class Catastrophe {
	
	private Bob monBob;
	private int id;
	private double victimes; //pourcentage de victimes
	
	public Catastrophe(Bob monBob) {
		
		this.monBob = monBob; // force, intel, fertilite, vitesse
		
	}
	
	public int evenement() {
		
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
				gilletsJaunes();
				break;
		}
        
        do {
            victimes += (2*Math.random()-1)*2/100 + (2*Math.random()-1)*2/100; //ajoute une valeur aléatoire
        } while (victimes < 0 || victimes > 100);
        
		return (int) (victimes*monBob.population); // retourne le pourcentage de victimes de la catastrophe
	}
	
	private void secheresse() {
        
		double force = (double) monBob.force;
		double intel = (double) monBob.intel;
		
		double a = (100-force)/400;
		double b = (100-intel)/700;
		victimes = a*b +a +b;
	}
	
	private void predateur() {
        
		double force = (double) monBob.force;
		double intel = (double) monBob.intel;
		double vitesse = (double) monBob.vitesse;
		
		double a = (100-force)/900;
		double b = (100-intel)/1000;
		double c = (100-vitesse)/600;
		victimes = a*b*c +a +b +c;
	}
	
	private void intemperie() {
        
		double force = (double) monBob.force;
		double intel = (double) monBob.intel;
		double vitesse = (double) monBob.vitesse;
        
        double a = (100-force)/1000;
        double b = (100-intel)/700;
        double c = (100-vitesse)/1200;
        victimes = a*b*c +a +b +c;
	}
	
	private void penurie() {
        
		double force = (double) monBob.force;
		double intel = (double) monBob.intel;
        double population = (double) monBob.population;
        
        double a = (100-force)/750;
        double b = (100-intel)/450;
        victimes = a*b +a +b;
        
        victimes = victimes*(1 + population*Math.log(population)/10000); // augmente le pourcentage de victimes en fonction du nombre de population
	}
	
	private void maladie() {
        
		double force = (double) monBob.force;
        
        victimes = Math.pow((100-force)/100,2) + force/1000;
	}
	
	private void gilletsJaunes() {
        
		int vitesse = monBob.vitesse;
        
        if (vitesse >= 50) {
            victimes = 0;
        } else {
            victimes = Math.log(51-vitesse)/15;
        }
	}

}
