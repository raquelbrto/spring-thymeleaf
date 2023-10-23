package com.raquel.springt.service;

import com.raquel.springt.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {
    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
