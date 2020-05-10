package br.com.estudo.projetoweb.config;

import br.com.estudo.projetoweb.entities.Oder;
import br.com.estudo.projetoweb.entities.User;
import br.com.estudo.projetoweb.repositories.OderRepository;
import br.com.estudo.projetoweb.repositories.UserRepository;
import org.joda.time.DateTime;
import org.joda.time.Instant;
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

    @Autowired
    private OderRepository oderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Carlos", "marial@gmail.com", "933225599", "123456");
        User user2 = new User(null, "Carlos Mihael", "mihael@gmail.com", "933615588", "123456");

        Oder oder1 = new Oder(null, new Instant(), user1);
        Oder oder2 = new Oder(null, new Instant(), user2);

        userRepository.saveAll(Arrays.asList(user1, user2));
        oderRepository.saveAll(Arrays.asList(oder1, oder2));
    }
}
