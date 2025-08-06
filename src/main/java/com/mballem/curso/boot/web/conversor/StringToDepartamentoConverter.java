package com.mballem.curso.boot.web.conversor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.mballem.curso.boot.domain.Departamento;
import com.mballem.curso.boot.service.DepartamentoService;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {

    private DepartamentoService service;

    StringToDepartamentoConverter(DepartamentoService service) {
        this.service = service;
    }

    @Override
    public Departamento convert(String text) {
        if(text.isEmpty()) {
            return null;
        }

        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    }
    
}
