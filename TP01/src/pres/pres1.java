package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class pres1 {

	public static void main(String[] args) {
		/*
		 * l'injection des dépendances par instanciation statique
		 */
		DaoImpl dao = new DaoImpl(); // créer un objet de type DaoImpl 
		MetierImpl metier = new MetierImpl(); // créer un objet de type MetierImpl
		metier.setDao(dao); // initialiser la valeur de dao à l'aide de setter
		System.out.println(metier.calcul());
	}

}
