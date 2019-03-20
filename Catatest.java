/*
 * Catatest.java
 * 
 * Copyright 2019 jkritter <jkritter@PC106-025-12>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


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

