package com.asp.testit.Controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asp.testit.Service.AppTypeService;

/**
 * Handles and retrieves person request
 */
@Controller
public class LoginController {

	protected static Logger logger = Logger.getLogger("LoginController");
	//private String requestType = request.getParameter("session.telephone.ani");
	
	@Resource(name="appTypeService")
	private AppTypeService appTypeService;
	
	/**
	 * Handles and retrieves all users and show it in a JSP page
	 * 
	 * @return the name of the JSP page
	 */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(Model model) {
    	
    	logger.debug("Received request to get users information");
    	
    	// Retrieve all users by delegating the call to LoginService
    	String appName = appTypeService.showAppName(1);
    	    	
    	// Attach users to the Model
    	model.addAttribute("user", appName);
    	
    	// This will resolve to /WEB-INF/jsp/login.jsp
    	return "login";
	}  
}
