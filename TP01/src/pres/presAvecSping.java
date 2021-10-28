package pres;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class presAvecSping {

	public static void main(String[] args) {
		/*
		 * lire le fichier de configuration
		 * création des objets par Spring
		 * on dit que Spring est un conteneur, c'est lui qui contient les objets 
		 * Beans graph
		 */
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext
				(new String[]{"applicationContext.xml"});
		IMetier metier = (IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
	}

}
