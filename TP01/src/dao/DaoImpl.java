package dao;

// l'implementation de l'interface IDao
public class DaoImpl implements IDao{
	
	@Override
	public double getData() {
		/*
		 * se connecter à la base de données 
		 * retourner les données 
		 */
		System.out.println("Utilisation de la base de données.");
		double value = 98;
		return value;
	}
	
}
