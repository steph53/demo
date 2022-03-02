package com.tuto.demo.phone.services;

import java.util.List;

import com.tuto.demo.phone.entities.Phone;
import com.tuto.demo.phone.repositories.PhoneRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
    @Autowired
    PhoneRepository phoneRepository;

    public List<Phone> getPhone(){
        return phoneRepository.findAll();
    }
}
