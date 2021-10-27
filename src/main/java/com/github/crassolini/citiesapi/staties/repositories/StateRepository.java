package com.github.crassolini.citiesapi.staties.repositories;

import com.github.crassolini.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
