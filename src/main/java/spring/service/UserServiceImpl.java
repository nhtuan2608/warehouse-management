package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.DAO.UserDao;
import spring.model.User;

@Service
public class UserServiceImpl implements UserService{

	   @Autowired
	   private UserDao userDao;
	 
	   @Transactional
	   public void save(User user) {
	      userDao.save(user);
	   }
	 
	   @Transactional(readOnly = true)
	   public List<User> findAll() {
	      return userDao.findAll();
	   }

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
