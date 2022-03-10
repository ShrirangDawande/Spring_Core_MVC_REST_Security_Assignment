package Main.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Main.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    public User findByUsername(String username);
}
