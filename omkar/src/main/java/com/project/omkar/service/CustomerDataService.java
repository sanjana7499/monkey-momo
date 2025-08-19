package com.project.omkar.service;

import com.project.omkar.entity.CustomerData;
import com.project.omkar.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDataService
{
    @Autowired
    private CustomerRepository repository;

    public CustomerData save(CustomerData data)
    {
        return repository.save(data);
    }

}
