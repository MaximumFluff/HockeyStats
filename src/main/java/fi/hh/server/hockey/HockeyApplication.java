package fi.hh.server.hockey;

import fi.hh.server.hockey.domain.User;
import fi.hh.server.hockey.domain.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HockeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HockeyApplication.class, args);
	}

    @Bean
    public CommandLineRunner Hockey(UserRepository urepository) {
        return (args) -> {

            // Create new users
            User user1 = new User("user","$2a$04$zdGl8n9CPo7bKcURxZyBIeedqGpuR7b/B7051RZfotU5bFy00606i", "USER");
            User user2 = new User("admin","$2a$04$W1UHL2Hxfy88U/koDH3BquRgXC8aae4RUiM03JDguIfzsfnh6bFVi", "ADMIN");
            urepository.save(user1);
            urepository.save(user2);
        };
    }
}

