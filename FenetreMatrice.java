import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FenetreMatrice extends JPanel {
		Bob monBob ; 
	public FenetreMatrice(Bob monBob) {
		this.monBob = monBob; // TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) { //taille matrice
		int[][] terrain = new int[50][50]; //TODO revoir la taille de la matrice en fonction de l'affichage, faire plus de pixels
		int r = monBob.population ; //variable permettant de dire combien de cases seront coloree
		int a = 0 ; 
		int b = 0 ;
		while(r!=0) {		//initialisation de la matrice avec des 0 et des 1 (0 si neutre, 1 si bob)
			while(terrain[a][b]!=0) {	//on cherche des coordonnees pour lesquelles la mtrice vaut 0
				a = (int)(Math.random()*terrain.length) ; 
				b = (int)(Math.random()*terrain[0].length) ; 
			}
			terrain[a][b]=1 ; 
			r = r - 1 ; 
		}
		//nouvelles couleurs
		Color monVert = new Color(126, 206, 122);
		Color monBlanc = new Color(204, 234, 203);
		
		//colorie la carte : 
		int haut_carre = 500/terrain.length ; //ptieBas.getHeight()
		int larg_carre = 950/terrain[0].length ; //taille des rectangles
		
		for(int i =0;i<terrain.length;i++) {
			for(int j=0;j<terrain[0].length;j++) {
				if(terrain[i][j]==0) {
					g.setColor(monBlanc);
				}else if(terrain[i][j]==1) {
					g.setColor(monVert);
				}
				int y1 = i*haut_carre ; 
				int x1 = j*larg_carre ; 
				g.fillRect(x1, y1, larg_carre, haut_carre);
				
			}
		}
		
		
		
	}
}
