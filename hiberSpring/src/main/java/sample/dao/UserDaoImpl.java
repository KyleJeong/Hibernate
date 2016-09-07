package sample.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import sample.domain.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}

}
