package MainClass.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import MainClass.model.user;

	@Component
	public class zipcodeService {

	    private static List<user> list = new ArrayList<user>();

	    // zipcode Zip = new zipcode(99501, "AK", "ANCHORAGE", "US");
	    static {
	        list.add(new user (99501, "AK", "ANCHORAGE", "US"));
	    }

	    public user getzipcodeByzipcode(int zipcode) {

	        return list.stream().filter(z -> z.getZipcode() == zipcode).findFirst().get();
	    }

	    public List<user> getAll() {
	        return list;
	    }

	

}
