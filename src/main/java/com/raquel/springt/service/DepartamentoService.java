package com.raquel.springt.service;

import com.raquel.springt.domain.Departamento;

import java.util.List;

public interface DepartamentoService {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
