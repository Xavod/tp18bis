/**
 * 
 */
package com.sr2ltx.algotojava.tp18bis;

/**
 * @author Apprenant
 *
 */
public class Coeur implements Family {

	@Override
	public String getRepresentation() {
		StringBuilder card = new StringBuilder();
		card.append(" _____ ");
		card.append("\n");
		card.append("|%s _ |");
		card.append("\n");
		card.append("|( v )|");
		card.append("\n");
		card.append("| \\ / |");
		card.append("\n");
		card.append("|  .  |");
		card.append("\n");
		card.append("|___%s|");
		card.append("\n");
		return card.toString();
	}

}
