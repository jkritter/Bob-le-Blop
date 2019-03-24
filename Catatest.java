public class Catatest {
	
	public static void main (String args[]) {
		double victimes;
		double b;
		double a;
		double c;
		int force = 00;
		int vitesse = 60;
		int fertilite = 40;
		int intel = 100;
		
		for(int i=0; i<11; i++) {
			//System.out.println("\nintel : " + intel +"\n");
			for(int j=0; j<11; j++) {
				a = (double)(100-force)/900;
				b = (double)(100-intel)/900;
				c = (double)(100-vitesse)/500;
				victimes = a*b*c +a +b +c;
				//victimes += (2*Math.random()-1)*2/100;
				System.out.print((int)(victimes*100)+"  ");
				force += 10;
			}
			intel -= 10;
			force = 0;
			System.out.println("\n");
		}
	}
}

