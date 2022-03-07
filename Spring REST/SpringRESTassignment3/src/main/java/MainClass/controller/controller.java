package MainClass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import MainClass.model.user;
import MainClass.service.zipcodeService;

@Controller
public class controller {

	 @Autowired
	    private zipcodeService ZipcodeService;

	    @GetMapping("/country-details/{id}")
	    public user getByZipcode(@PathVariable("id") int id) {
	        System.out.println("Zipcode is: " + id);
	        return ZipcodeService.getzipcodeByzipcode(id);

	    }

	    @GetMapping("/country-details")
	    public List<user> getAll() {

	        for (user z : ZipcodeService.getAll()) {
	            System.out.println(z);
	        }
	        return ZipcodeService.getAll();
	    }
	
}
