package com.raquel.springt.service;

import com.raquel.springt.dao.FuncionarioDao;
import com.raquel.springt.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao funcionarioDao;

    @Override
    public void save(Funcionario funcionario) {
        funcionarioDao.save(funcionario);
    }

    @Override
    public void update(Funcionario funcionario) {
        funcionarioDao.update(funcionario);
    }

    @Override
    public void delete(Long id) {
        funcionarioDao.delete(id);
    }

    @Override
    public Funcionario findById(Long id) {
        return funcionarioDao.findById(id);
    }

    @Override
    public List<Funcionario> findAll() {
        return funcionarioDao.findAll();
    }
}
