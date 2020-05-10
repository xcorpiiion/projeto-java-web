package br.com.estudo.projetoweb.config;

import br.com.estudo.projetoweb.entities.User;
import br.com.estudo.projetoweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Carlos", "marial@gmail.com", "933225599", "123456");
        User user2 = new User(null, "Carlos Mihael", "mihael@gmail.com", "933615588", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
