package com.raquel.springt.service;

import com.raquel.springt.dao.DepartamentoDao;
import com.raquel.springt.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoDao departamentoDao;

    @Override
    public void save(Departamento departamento) {
        departamentoDao.save(departamento);
    }

    @Override
    public void update(Departamento departamento) {
        departamentoDao.update(departamento);
    }

    @Override
    public void delete(Long id) {
        departamentoDao.delete(id);
    }

    @Override
    public Departamento findById(Long id) {
        return departamentoDao.findById(id);
    }

    @Override
    public List<Departamento> findAll() {
        return departamentoDao.findAll();
    }
}
