package org.slsale.controller.user;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.slsale.pojo.user.User;
import org.slsale.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/index.html")
	public String index(){
		logger.debug("UserController welcome slsalesystem===========");
		return "index";
	}
	@RequestMapping(value="/login.html")
	public String login(){
		return "login";
	}
	@RequestMapping(value="/dologin.html",method=RequestMethod.POST)
	public ModelAndView doLogin(User user){
		logger.debug("doLogin====> loginCode:"+user.getLoginCode()+"\tpassword:"+user.getPassword());
		try {
			user = userService.getLoginUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("loginsuccess");
	}
	
	@RequestMapping(value="/exit.html")
	public String logout(){
		return "exit";
	}
	
	@RequestMapping(value="/register.html")
	public String register(){
		return "register";
	}
	
	@RequestMapping(value="/doregister.html",method=RequestMethod.POST)
	public ModelAndView doRegister(User user){
		logger.debug("doLogin====> loginCode:"+user.getLoginCode()+"\tpassword"+user.getPassword());
		try {
			int f = userService.addUser(user);
			if(f>0){
				user = userService.getLoginUser(user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("regsuccess");
	}
	
}

