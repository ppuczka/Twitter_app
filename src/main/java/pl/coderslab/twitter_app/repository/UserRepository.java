package pl.coderslab.twitter_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.twitter_app.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);
}
