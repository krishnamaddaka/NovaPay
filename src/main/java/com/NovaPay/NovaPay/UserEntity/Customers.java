package com.NovaPay.NovaPay.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customers {
    @Id
    private Long customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    // Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
