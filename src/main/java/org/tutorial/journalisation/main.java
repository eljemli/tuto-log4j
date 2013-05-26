package org.tutorial.journalisation;

import java.util.logging.Logger;
/**
 * 
 * @author Anasse El JEMLI
 *
 */
public class main {

	   private final static Logger logger = Logger
		         .getLogger(org.tutorial.journalisation.main.class.getName());

	public static void main(String[] args) {
		System.out.println("Le niveau de journalisation utilisées est "+logger.getParent().getLevel());
		 logger.warning("Message avertissement");
		 logger.info("Message information");
	}

}
