package com.raquel.springt.service;

import com.raquel.springt.domain.Cargo;

import java.util.List;

public interface CargoService {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
