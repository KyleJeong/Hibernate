package sample.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		return "sample/register";
	}

}
