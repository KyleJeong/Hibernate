package sample.service;

import java.util.List;

import sample.domain.User;

public interface UserService {
	
	public void saveUser(User user) ;
	
	public List<User> findUser();

	public void removeUser(User user);
}
