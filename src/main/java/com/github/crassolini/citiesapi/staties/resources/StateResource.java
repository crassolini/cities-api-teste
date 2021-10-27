package com.github.crassolini.citiesapi.staties.resources;

import java.util.List;
import java.util.Optional;

import com.github.crassolini.citiesapi.staties.entities.State;
import com.github.crassolini.citiesapi.staties.repositories.StateRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<State> getOne(@PathVariable Long id) {
        Optional<State> optional = repository.findById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}