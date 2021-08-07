package com.DioFinalProjeto.citiesapi.countries.repository;

import com.DioFinalProjeto.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
