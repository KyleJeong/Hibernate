package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.dao.UserDao;
import sample.domain.User;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserDao UserDao;
	
	
	public void saveUser(User user) {
		UserDao.saveUser(user);
	}
	
	public List<User> findUser(){
		return UserDao.findUser();
	}

	public void removeUser(User user){
		UserDao.removeUser(user);
	}

}
