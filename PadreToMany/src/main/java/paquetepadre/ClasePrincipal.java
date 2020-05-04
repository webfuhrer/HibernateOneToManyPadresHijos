package paquetepadre;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class ClasePrincipal {
	
	public static void main(String[] args) {
		Hijo h1=new Hijo("Caín");
		Hijo h2=new Hijo("Abel");
		
		List<Hijo> hijos=new ArrayList();
		hijos.add(h1);
		hijos.add(h2);
		
		Padre p=new Padre("Adán", hijos);
		
		StandardServiceRegistry s=new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf=new MetadataSources(s).buildMetadata().buildSessionFactory();
		Session sesion=sf.openSession();
		Transaction t=sesion.beginTransaction();
		//sesion.save(p);
		
		t.commit();
		//lazy "perezoso" o "en diferido", "postergado"
		
		Query q=sesion.createQuery("FROM Hijo");
		List<Hijo> lista_hijos=q.getResultList();
		/*for (Padre padre : padres) {
			System.out.println(padre.getHijos().size());
		}*/
		for (Hijo h : lista_hijos) {
			System.out.println(h);
		}
		sesion.close();
		
		
	}
	
	
	

}
