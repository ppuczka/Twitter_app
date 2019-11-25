package pl.coderslab.twitter_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.twitter_app.entity.Tweet;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

  List<Tweet> getAllByOrderByCreatedDesc();
}
