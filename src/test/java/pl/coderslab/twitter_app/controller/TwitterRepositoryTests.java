package pl.coderslab.twitter_app.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import pl.coderslab.twitter_app.entity.User;
import pl.coderslab.twitter_app.repository.TweetRepository;
import pl.coderslab.twitter_app.repository.UserRepository;


@DataJpaTest
class TwitterRepositoryTests {

    @Autowired
    TestEntityManager testEntityManager;

    @Autowired
    TweetRepository tweetRepository;

    @Autowired
    UserRepository userRepository;


    @Test
    public void whenFindByEmail_thenReturnUser() {
        // given
        User user = new User("przemek@przemek.pl", "PP");
        testEntityManager.persist(user);
        testEntityManager.flush();

        // when
        User found = userRepository.findByEmail(user.getEmail());

        // then
        Assertions.assertEquals(found.getEmail(), user.getEmail());
    }

    @Test
    public void whenFindByEmail_notReturnsUser() {
        // given
        User user = new User("przemek@przemek.pl", "PP");
        testEntityManager.persist(user);
        testEntityManager.flush();

        // when
        User found = userRepository.findByEmail("false@email.com");

        // then
        Assertions.assertNull(found);


    }
}