/**
 * 
 */
package com.sr2ltx.algotojava.tp18bis;

/**
 * @author Apprenant
 *
 */
public class Trefle implements Family {

	@Override
	public String getRepresentation() {
		StringBuilder card = new StringBuilder();
		card.append(" _____ ");
		card.append("\n");
		card.append("|%s_  |");
		card.append("\n");
		card.append("| ( ) |");
		card.append("\n");
		card.append("|(_'_)|");
		card.append("\n");
		card.append("|  |  |");
		card.append("\n");
		card.append("|___%s|");
		card.append("\n");
		return card.toString();
	}

}
