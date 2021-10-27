package com.github.crassolini.citiesapi.countries.repositories;

import com.github.crassolini.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
