package MainClass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import MainClass.repository.UserRepository;
import MainClass.user.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		 @Autowired 
		 UserRepository userRepository;
		 
		 

		    @Override
		    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		        User user = this.userRepo.findByUsername(username);

		        if (user == null) {
		            throw new UsernameNotFoundException("INVALID USERNAME!!");
		        }

		        return new CustomUserDetail(user);
		    }
	}

}
