package br.com.estudo.projetoweb.resources;

import br.com.estudo.projetoweb.entities.Oder;
import br.com.estudo.projetoweb.services.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/oders")
public class OderResource {

    @Autowired
    private OderService oderService;

    @GetMapping
    public ResponseEntity<List<Oder>> findAll(){
        List<Oder> oders = oderService.findAll();
        return ResponseEntity.ok().body(oders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Oder> findById(@PathVariable Long id){
        Oder oder = oderService.findById(id);
        return ResponseEntity.ok().body(oder);
    }

}
