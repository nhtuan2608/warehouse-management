package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.model.Merchandise;
import spring.repository.GenericDAO;


/**
* MerchandiseServiceImpl
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-22 
*/
@Service
@Transactional
public class MerchandiseService implements GenericService<Merchandise>{

	@Autowired
	private GenericDAO<Merchandise> merchandiseDAO;
	
	@Override
	public void save(Merchandise entity) {
		merchandiseDAO.save(entity);
	}
	@Override
	public List<Merchandise> findAll() {
		return merchandiseDAO.findAll();
	}

	@Override
	public Merchandise findById(String id) {
		return merchandiseDAO.findById(id);
	}

	@Override
	public void delete(String id) {
		merchandiseDAO.delete(id);
	}

	@Override
	public void update(Merchandise entity) {
		merchandiseDAO.update(entity);
	}

	@Override
	public boolean isExist(Merchandise entity) {
		return merchandiseDAO.isExist(entity);
	}
	@Override
	public boolean findByName(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Merchandise findByIntegerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Merchandise returnUserFindByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Merchandise> getListByAttribute(String id) {
		return merchandiseDAO.getListById(id);	}

}
