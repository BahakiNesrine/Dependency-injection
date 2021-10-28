package dao;

import org.springframework.stereotype.Repository;
/*
 * dommander � Spring de cr�er des objets de cette classe 
 * et les appeler d
 * <=> 	<bean id="d" class="dao.DaoImpl2"></bean>
 */
//@Component("d") 

/*
 * la possibilit� de travailler avec Repository qui indique 
 * que cet objet fait partie de la couche Dao
 * couche metier => @Service
 * couche web => @Controller
 */

@Repository("d")
// l'implementation de l'interface IDao
public class DaoImpl2 implements IDao{
	
	@Override
	public double getData() {
		System.out.println("Utilisation de la base de donn�es.");
		double value = 98;
		return value;
	}
	
}
