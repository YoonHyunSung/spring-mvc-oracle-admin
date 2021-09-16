package shop.cofin.oracle.common.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;



@SessionAttributes("contextPath")
@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(
			HttpSession session, 
			HttpServletRequest request) {
		String contextPath = request.getContextPath();
    	session.setAttribute("contextPath", contextPath);
		return "index";
	}
	@RequestMapping("/move/{dir}/{jsp}")
	public String join(@PathVariable String dir, @PathVariable String jsp) {
		if(dir.equals("home")) {return "redirect:/";}
		return dir+"/"+jsp;
	}
	
//	@RequestMapping(value = "/userRegister", method = RequestMethod.GET)
//	public String userRegister() {
//		
//		return "/user/Register";
//	}
//	
//	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
//	public String login() {
//				
//		return "/user/Login";
//	}
//	@RequestMapping(value = "/userUpdate", method = RequestMethod.GET)
//	public String userUpdate() {
//		
//		return "/user/Update";
//	}
//	@RequestMapping(value = "/userDelete", method = RequestMethod.GET)
//	public String userDelete() {
//		
//		return "/user/Delete";
//	}
//	@RequestMapping(value = "/userDetail", method = RequestMethod.GET)
//	public String userDetail() {
//		
//		return "/user/Detail";
//	}
//	@RequestMapping(value = "/userList", method = RequestMethod.GET)
//	public String userList() {
//		
//		return "/user/List";
//	}
//	
//	
//	@RequestMapping(value = "/bookList", method = RequestMethod.GET)
//	public String bookList() {
//		
//		return "/book/List";
//	}
//	
//	@RequestMapping(value = "/bookRegister", method = RequestMethod.GET)
//	public String bookRegister() {
//		
//		return "/book/Register";
//	}
//	@RequestMapping(value = "/bookUpdate", method = RequestMethod.GET)
//	public String bookUpdate() {
//		
//		return "/book/Update";
//	}
//	@RequestMapping(value = "/bookDelete", method = RequestMethod.GET)
//	public String bookDelete() {
//		
//		return "/book/Delete";
//	}
//	@RequestMapping(value = "/bookDetail", method = RequestMethod.GET)
//	public String bookDetail() {
//		
//		return "/book/Detail";
//	}
//	
//	
//	
//	
}
