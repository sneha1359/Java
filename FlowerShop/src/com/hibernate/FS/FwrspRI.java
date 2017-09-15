package com.hibernate.FS;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//import com.hib.assign.connection.HibernateUtil;
//import com.hib.assign.model.FlowerShop;

public class FwrspRI implements FwrspR {
	
	private static SessionFactory sessionFactory;
	
	public FwrspRI() {
		// TODO Auto-generated constructor stub
		sessionFactory = FwrU.getSessionFactory();
	}

	public List<Fwrsp> getAllData() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		List<Fwrsp> result = null;
		try {
			result = session.createCriteria("from FLOWER_SHOP").list();
			
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return result;
	}

	public void saveFlowerShop(Fwrsp flowerShop) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		try {
			session.save(flowerShop);
			tr.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		
		session.close();
	}

	public Fwrsp getFlowerShop(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Fwrsp flowerShop = null;
		try {
			flowerShop = session.get(Fwrsp.class, new Integer(id));
			
			tr.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		
		return flowerShop;
	}

	public void deleteFlowerShop(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		try {
			Fwrsp flowerShop = session.load(Fwrsp.class, new Integer(id));
			session.delete(flowerShop);
			tr.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		
		session.close();
	}

	public Fwrsp updateFlowerShop(Fwrsp flowerShop) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Fwrsp fs = null;
		try {
			fs = session.load(Fwrsp.class, new Integer(flowerShop.getId()));
			fs.setFlowers(flowerShop.getFlowers());
			fs.setManagers(fs.getManagers());
			fs.setName(flowerShop.getName());
			
			session.saveOrUpdate(fs);
			tr.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tr.rollback();
			e.printStackTrace();
		}
		
		session.close();
		return fs;
	}

}
