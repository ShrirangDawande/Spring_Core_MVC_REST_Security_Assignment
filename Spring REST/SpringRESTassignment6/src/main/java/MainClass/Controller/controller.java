package MainClass.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import MainClass.Service.service;

@Controller
@ResponseBody                              // we are 
public class controller {
    
	@Autowired
	service ser;
	@GetMapping("/addition/{a}/{b}")
	public int add(@PathVariable("a") int a,@PathVariable("b") int b) {
		return ser.addMethod(a,b);
	}
	
	@GetMapping("/substraction/{a}/{b}")
	public int sub(@PathVariable("a") int a,@PathVariable("b") int b) {
		return ser.subMethod(a,b);
	}
	
	@GetMapping("/multiplication/{a}/{b}")
	public int mul(@PathVariable("a") int a,@PathVariable("b") int b) {
		return ser.mulMethod(a,b);
	}
	
	@GetMapping("/division/{a}/{b}")
	public int div(@PathVariable("a") int a,@PathVariable("b") int b) {
		return ser.divMethod(a,b);
	}
	
	@GetMapping("/square/{a}")
	public int sqr(@PathVariable int a) {
		return ser.sqrMethod(a);
	}
}
