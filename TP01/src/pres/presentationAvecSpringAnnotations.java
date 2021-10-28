package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import metier.IMetier;

public class presentationAvecSpringAnnotations {

	public static void main(String[] args) {
		/* au d�marrage il doit scanner les classes 
		 * il faut donc sp�cifier les packages
		 * il scanne aussi les sous packages
		 * chercher les classes qui utilisent la notation @Component
		 * il va l'instancier pour devenir un composant Spring
		 * et c'est � lui de g�rer son cycle de vie
		 * 
		 * plus rapide que la version XML parce que ce dernier n�cessite la cr�ation des objets DOM
		*/
		ApplicationContext ctx = new AnnotationConfigApplicationContext("ext","metier");
		/*
		 * il va travailler que avec l'interface IMetier au lieu de la classe 
		 *  
		 */
		IMetier metier=ctx.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}

}
