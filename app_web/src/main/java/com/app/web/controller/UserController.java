/**
 * 
 */
package com.app.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.User;
import com.app.service.UserService;
import com.app.web.commons.ResultWeb;

@Controller
@RequestMapping("/user")
public class UserController {
	
    private Logger logger = LoggerFactory.getLogger(this.getClass());  
    
	@Autowired
	private UserService userService;
	
    @RequestMapping(value="", method=RequestMethod.GET)
    @ResponseBody
	public ResultWeb<User> get(Long uid){
    	logger.info("get");
    	uid = 1L;
    	return ResultWeb.SUCCESS(userService.get(uid));
	}
}