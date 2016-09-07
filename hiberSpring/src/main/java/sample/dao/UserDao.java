package sample.dao;

import java.util.List;

import sample.domain.User;

public interface UserDao {
	

	public void saveUser(User user) ;
	
	public List<User> findUser();

	public void removeUser(User user);

}
