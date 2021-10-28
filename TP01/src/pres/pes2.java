package pres;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class pes2 {
	public static void main(String[] args) throws Exception {
		/*
		 * l'injection des d�pendances par instanciation dynamique
		 */
		Scanner scanner = new Scanner(new File("config.txt"));
		String daoClassName = scanner.nextLine(); // lire le premier ligne
		// charger le byte code dans la m�moire sous forme d'un objet de type Class
		Class cDao = Class.forName(daoClassName);
		// cr�ation de l'objet d'une mani�re dynamique c'est de type Object donc on doit ajouter casting
		IDao dao = (IDao) cDao.newInstance();
		
		String metierClassName = scanner.nextLine(); // lire le deuxi�me ligne
		Class cMetier = Class.forName(metierClassName);
		IMetier metier = (IMetier) cMetier.newInstance();
		Method method = cMetier.getMethod("setDao", IDao.class);
		method.invoke(metier, dao); // invoker la methode method sur l'objet metier avec le parametre de type Dao 
		System.out.println(metier.calcul());
	}
}
