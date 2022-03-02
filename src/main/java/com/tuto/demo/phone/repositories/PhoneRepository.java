package com.tuto.demo.phone.repositories;

import java.util.List;

import com.tuto.demo.phone.entities.Phone;

import org.springframework.data.repository.CrudRepository;

public interface PhoneRepository extends CrudRepository<Phone, Long> {
    @Override
    List<Phone> findAll();
}
