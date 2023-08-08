package com.raquel.springt.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

    @Column(length = 60, nullable = false, unique = true)
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;
}
