package com.NovaPay.NovaPay.UserService;

import org.springframework.http.HttpStatus;



import com.NovaPay.NovaPay.UserEntity.Customers;

public interface UserService {
    public Customers getCustomerById(Long id);
    public HttpStatus saveCustomer(Customers customer);
}
