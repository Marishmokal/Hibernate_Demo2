package pro.wings.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class HibernateUtil {
	private static SessionFactory factory = null;

	public static SessionFactory getFactory() {
		if (factory == null) {
			return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		}
		return factory;
	}

}

public class ApplicationApi {

	public static void main(String[] args) {
		
	    Set<Items> itemSet = new HashSet<Items>();
		Cart cart = new Cart("Marish",10,itemSet);

		Items item1 = new Items("101", 45.5, 12, cart);
		Items item2 = new Items("102", 46.5, 42, cart);
		itemSet.add(item1);
		itemSet.add(item2);

		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(cart);
		session.save(item1);
		session.save(item2);

		tx.commit();
		factory.close();

	}
}
