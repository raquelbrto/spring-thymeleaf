package com.raquel.springt.dao;

import com.raquel.springt.domain.Cargo;
import com.raquel.springt.domain.Departamento;
import org.springframework.stereotype.Repository;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
}
