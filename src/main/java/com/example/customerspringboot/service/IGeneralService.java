package com.example.customerspringboot.service;

import com.example.customerspringboot.model.Customer;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void remove(Long id);
}
