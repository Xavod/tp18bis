/**
 * 
 */
package com.sr2ltx.algotojava.tp18bis;

/**
 * @author Apprenant
 *
 */
public class Card implements Printable{
	
	private CardValue value;
	private Family family;
	
	public Card(CardValue value, Family family) {
		super();
		this.value = value;
		this.family = family;
	}
	
	@Override
	public void print(){
		System.out.println(String.format(family.getRepresentation(), value.getRepresentationLeft(), value.getRepresentationRight()));	
	}
	
	
}