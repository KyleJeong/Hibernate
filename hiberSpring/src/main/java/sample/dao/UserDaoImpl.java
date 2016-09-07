package sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import sample.domain.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<User> findUser(){
		return hibernateTemplate.find("from User");
	}

	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}
	
	public void removeUser(User user){
		hibernateTemplate.delete(user);
	}

}
