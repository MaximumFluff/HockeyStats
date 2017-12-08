package fi.hh.server.hockey.domain;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    // Find correct user when logging in
    User findByUsername(String username);
}


