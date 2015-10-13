/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		Card aceClubs1 = new Card("ace","clubs", 1);
		Card aceClubs2 = new Card("ace","clubs", 1);
		Card sixHearts = new Card("6","hearts", 6);
		
		System.out.println("Ace of clubs #1 Test");
		System.out.println("rank:"+ aceClubs1.rank());
		System.out.println("suit:"+ aceClubs1.suit());
		System.out.println("pointValue:"+ aceClubs1.pointValue());
		System.out.println(" toString:"+ aceClubs1.toString());
		System.out.println();
		
		System.out.println("Ace of clubs #2 Test");
		System.out.println("rank:"+ aceClubs2.rank());
		System.out.println("suit:"+ aceClubs2.suit());
		System.out.println("pointValue:"+ aceClubs2.pointValue());
		System.out.println(" toString:"+ aceClubs2.toString());
		System.out.println();
		
		System.out.println("Six of hearts Test");
		System.out.println("rank:"+ sixHearts.rank());
		System.out.println("suit:"+ sixHearts.suit());
		System.out.println("pointValue:"+ sixHearts.pointValue());
		System.out.println(" toString:"+ sixHearts.toString());
		System.out.println();
		
		System.out.println("** matches test **");
		System.out.println("matching" + aceClubs1.matches(aceClubs2));
		System.out.println(" not matching" + aceClubs1.matches(sixHearts));
	}
}
