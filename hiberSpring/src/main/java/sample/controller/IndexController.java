package sample.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.domain.User;
import sample.service.UserService;


@Controller
public class IndexController {
	
	@Autowired
	private UserService UserService;
	
	
	@RequestMapping(value = "/index", method= GET)
	public String getAll(Model model){
		
		return "sample/index";
	}
	
	@RequestMapping(value = "/register", method= POST)
	public String saveAll(Model model){
		
		   User user = new User();
		   user.setCode(111111);
		   user.setNum(22222);
	        
	        UserService.saveUser(user);
	        
	        List<User> list = UserService.findUser();
	        System.out.println(list.get(0).getCode());
	        
	        UserService.removeUser(user);
	       /* person.setName("foo");
	        personService.updatePerson(person);
	        
	        personService.removePerson(person);*/
		return "sample/register";
	}

}
