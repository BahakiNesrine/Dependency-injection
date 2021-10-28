package metier;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;
/*
 * cr�er un objet de cette classe et l'appeler metier
 * <=> <bean id="metier" class="metier.MetierImpl2">
 */
//@Component("metier") 

/*
 * la possibilit� de travailler avec Service qui indique 
 * que cet objet fait partie de la couche Metier
 */

@Service("metier")

public class MetierImpl2 implements IMetier{
	/*
	 * l'injection des d�pendances
	 * chercher dans les objets d�j� cr�er par Spring 
	 * s'il existe un objet qui implemente cette interface
	 * et l'affecter par la suite � cette interface
	 */
	@Autowired 
	private IDao dao = null;
	@Override
	public double calcul() {
		double d = dao.getData();
		double res = d*23;
		return res;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
