package Main.services;

import java.util.List;

import Main.models.User;

public interface service {

	  public List<User> getAllUsers();

	    public User getUser(String username);

	    public User addUser(User user);
	}
