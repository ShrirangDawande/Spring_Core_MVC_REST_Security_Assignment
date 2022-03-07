package MainClass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MainClass.user.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByUsername(String username);

}
