package MainClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import MainClass.entity.User;

@Controller
public class controller {

	User user=new User("shrirang","shri");
	
	@PostMapping("/login")
	@ResponseBody
	public String login(@RequestBody User user)
	{
		if(this.user.getName().equals(user.getName())&&this.user.getPass().equals(user.getPass())) {
			return "valid user";
		}
		return "invalid user";
	}
	
}
