package com.NovaPay.NovaPay.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;

import com.NovaPay.NovaPay.UserEntity.Customers;
import com.NovaPay.NovaPay.UserRepository.UserRepository;

@Service
public class UserServiceClass implements UserService {

    Customers customer;
 
    private UserRepository userRepository;
    @Autowired
    public UserServiceClass(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserServiceClass() {
        
        customer = new Customers();
    }

    @Override
    public Customers getCustomerById(Long id) {
        // Implementation for fetching customer by ID
        return userRepository.findById(id).orElse(null);
    }
    public HttpStatus saveCustomer(Customers customer) {
        // Implementation for saving customer
     try{
            userRepository.save(customer);
            return HttpStatus.OK;
        } catch (Exception e) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
     }
        
    }

