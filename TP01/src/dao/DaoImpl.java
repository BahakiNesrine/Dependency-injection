package dao;

// l'implementation de l'interface IDao
public class DaoImpl implements IDao{
	
	@Override
	public double getData() {
		/*
		 * se connecter � la base de donn�es 
		 * retourner les donn�es 
		 */
		System.out.println("Utilisation de la base de donn�es.");
		double value = 98;
		return value;
	}
	
}
