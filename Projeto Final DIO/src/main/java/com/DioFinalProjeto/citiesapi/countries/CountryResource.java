package com.DioFinalProjeto.citiesapi.countries;

import com.DioFinalProjeto.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource{

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll( (org.springframework.data.domain.Pageable) page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> pegarUmDado(@PathVariable Long id){
        Optional<Country> opcional = repository.findById(id);

        if(opcional.isPresent()) {
            return ResponseEntity.ok().body(opcional.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}
