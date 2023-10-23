package com.raquel.springt.service;

import com.raquel.springt.dao.CargoDao;
import com.raquel.springt.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @Transactional
public class CargoServiceImpl implements CargoService {
    @Autowired
    private CargoDao cargoDao;

    @Override
    public void save(Cargo cargo) {
        cargoDao.save(cargo);
    }

    @Override
    public void update(Cargo cargo) {
        cargoDao.update(cargo);
    }

    @Override
    public void delete(Long id) {
        cargoDao.delete(id);
    }

    @Override
    public Cargo findById(Long id) {
        return cargoDao.findById(id);
    }

    @Override
    public List<Cargo> findAll() {
        return cargoDao.findAll();
    }
}
