package ext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import dao.IDao;
//@Component("d") // si on n'ajoute pas @component => UnsatisfiedDependencyException
@Repository("d")


public class DaoImpl3  implements IDao{

	@Override
	public double getData() {
		/*
		 * utiliser un capteur
		 * retourner les données 
		 */
		System.out.println("Utilisation d'un capteur.");
		double value = 23;
		return value;
	}
}
