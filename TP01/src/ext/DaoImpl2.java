package ext;

import dao.IDao;

public class DaoImpl2  implements IDao{
	
	@Override
	public double getData() {
		/*
		 * utiliser un capteur
		 * retourner les donn�es 
		 */
		System.out.println("Utilisation d'un capteur.");
		double value = 23;
		return value;
	}
}
