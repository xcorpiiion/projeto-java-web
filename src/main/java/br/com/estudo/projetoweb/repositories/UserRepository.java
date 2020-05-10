package br.com.estudo.projetoweb.repositories;

import br.com.estudo.projetoweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
