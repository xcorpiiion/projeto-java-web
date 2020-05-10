package br.com.estudo.projetoweb.services;

import br.com.estudo.projetoweb.entities.Oder;
import br.com.estudo.projetoweb.entities.User;
import br.com.estudo.projetoweb.repositories.OderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OderService {

    @Autowired
    private OderRepository oderRepository;

    public List<Oder> findAll(){
        return oderRepository.findAll();
    }

    public Oder findById(Long id){
        Optional<Oder> optionalOder = oderRepository.findById(id);
        return optionalOder.get();
    }

}
