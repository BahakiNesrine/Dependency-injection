package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
	/*
	 * il s'agit du couplage faible
	 * il faut injecter une valeur � dao 
	 * donc on doit ajouter setter pour faire l'injection des d�pendances  
	 */
	private IDao dao;
	/*
	 * un objet de type dao null
	 * il va g�n�rer l'erreur suivant : 
	 * Exception in thread "main" java.lang.NullPointerException: 
	 * Cannot invoke "dao.IDao.getData()" because "this.dao" is null
	 */
	@Override
	public double calcul() {
		double d = dao.getData();
		double res = d*23;
		return res;
	}
	// setter dao
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
