package com.example.md4_b5th_orm.service;

import com.example.md4_b5th_orm.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(int id);
    void remove(int id);
}
