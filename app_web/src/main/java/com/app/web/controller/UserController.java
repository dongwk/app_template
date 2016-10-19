/**
 * 
 */
package com.app.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.core.exception.BusinessException;
import com.app.model.User;
import com.app.service.UserService;
import com.app.web.common.ResultWeb;

@Controller
@RequestMapping("/user")
public class UserController {
	
    private Logger logger = LoggerFactory.getLogger(this.getClass());  
    
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index(){
		if (StringUtils.isEmpty(null)) throw new BusinessException();
    	return "success";
	}
	
    @RequestMapping(value="", method=RequestMethod.GET)
    @ResponseBody
	public ResultWeb<User> get(Long uid){
    	logger.info("get");
    	uid = 1L;
    	return ResultWeb.SUCCESS(userService.get(uid));
	}
    
    public static void main(String[] args) {
		System.out.println(f(4));
	}
    
    static int f(int n){
		int sum = 0;
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else if (n == 2) 
			return 1;
	    else sum = f(n - 1) + f(n - 2);
		return sum;
    }
}