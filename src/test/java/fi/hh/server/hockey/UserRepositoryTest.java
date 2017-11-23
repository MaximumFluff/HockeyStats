package fi.hh.server.hockey;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import fi.hh.server.hockey.domain.User;
import fi.hh.server.hockey.domain.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    public void createNewUser() {
        User user = new User("dave", "$2a$04$57b/GDn0OFjLj7GnIGZNju260EJqkybDfJptaRHDydo9EiWOlYsvC", "USER"); // kittens
        repository.save(user);
        assertThat(repository.findByUsername("dave")).isNotNull();
    }

    @Test
    public void deleteNewUser() {
        User user = new User("Mickey", "$2a$04$VSMZmVoJJQ2eY821SzdNSuSBqjHvAcIBXczhUfgeRW6UxPBTOz4fi", "ADMIN"); // bacon
        repository.save(user);
        assertThat(repository.findByUsername("Mickey")).isNotNull();
        repository.delete(user);
        assertThat(repository.findByUsername("Mickey")).isNull();
    }
}
