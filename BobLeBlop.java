import java.awt.Color;
import java.util.LinkedList; 
 
public class BobLeBlop{
  
	public static void main(String[] args){
        //FenetreChoixDesAttributs Fenetre1 = new FenetreChoixDesAttributs();
        
        Bob monBob = new Bob(50, 70, 30, 40);
        
        Catastrophe Cata = new Catastrophe(monBob);
        
        double morts = Cata.evenement();
        System.out.println(morts);
        
    }
}
