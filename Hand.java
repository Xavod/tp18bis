/**
 * 
 */
package com.sr2ltx.algotojava.tp18bis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Apprenant
 *
 */
public class Hand implements Printable{

	private List<Card> cards;
	
	/**
	 * @return the cards
	 */
	public List<Card> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public Hand() {
		this.cards = new ArrayList<Card>();
	}
	
	@Override
	public void print() {
		for (Card card : cards) {
			card.print();
		}
	
	}
}
