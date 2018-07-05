/**
 * 
 */
package com.sr2ltx.algotojava.tp18bis;

/**
 * @author Apprenant
 *
 */
public class Player {
	private String name;
	private int age;
	private Hand handPlayer;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public Hand getHandPlayer() {
		return handPlayer;
	}
	public void setHandPlayer(Hand handPlayer) {
		this.handPlayer = handPlayer;
	}
	
	public Player() {
			this.name = "";
			this.age = 18;
			this.handPlayer = new Hand(); 
			
	}
	public void printHand() {
		handPlayer.print();
		}
	
	
	
	
}
