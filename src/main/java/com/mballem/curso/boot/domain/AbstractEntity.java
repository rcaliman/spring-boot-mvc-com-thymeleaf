package com.mballem.curso.boot.domain;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

}
