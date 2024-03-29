package spring.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.Merchandise;

/**
* MerchandiseDAOImpl
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-14 
*/
//@Qualifier("merchandises")
@Repository
public class MerchandiseDAO implements GenericDAO<Merchandise>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Merchandise entity) {
		Session session = sessionFactory.getCurrentSession();
		Logger logger = Logger.getLogger(this.getClass().getName());
		String msg = "Merchandise: " + entity;
		logger.info(msg);
		session.saveOrUpdate(entity);
	}

	@Override
	public List<Merchandise> findAll() {
		Session session = sessionFactory.getCurrentSession();
	    return session.createQuery("FROM Merchandise", Merchandise.class).getResultList();
	}

	@Override
	public Merchandise findById(String id) {
		Session session = sessionFactory.getCurrentSession();
	    return session.get(Merchandise.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		Merchandise obj = findById(id);
	    session.remove(obj);
	}

	@Override
	public void update(Merchandise entity) {
		Session session = sessionFactory.getCurrentSession();
	    session.update(entity);
	}

	@Override
	public boolean isExist(Merchandise entity) {
		return findById(entity.getId()) != null;
	}

	@Override
	public boolean isExist(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Merchandise findByIntegerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Merchandise findByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Merchandise> getListById(String id){
		Session session = sessionFactory.getCurrentSession();
		List<Merchandise> list = new ArrayList<Merchandise>();
		list = session.createQuery("FROM Merchandise WHERE merchandise_type_id=:merchandise_type_id",Merchandise.class).setParameter("merchandise_type_id", id).getResultList();
		return list;
	}
}
