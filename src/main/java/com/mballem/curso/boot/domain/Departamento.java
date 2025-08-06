package com.mballem.curso.boot.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

    @NotBlank(message = "Informe um nome")
    @Size(min = 3, max = 60, message = "O nome do departamento deve ser entre {min} e {max} caracteres.")
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;
    
    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;

}
