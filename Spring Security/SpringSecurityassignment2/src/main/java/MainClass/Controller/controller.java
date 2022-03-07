package MainClass.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller                                 // we use this as we want to return HTML file in "/login" , @RestController only return JSON not HTML or JSP
public class controller {

	// Handler for Custome Login
		@GetMapping("/login")
		public String customeLogin() {
			return "CustomeLoginForm";
			
		}
	@GetMapping("/msg")
	@ResponseBody
	public String msg() {
		System.out.println("hello world");
		return "Hello World";
	}
	
	
	
}
