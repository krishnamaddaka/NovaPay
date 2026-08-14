package com.NovaPay.NovaPay.UserRepository;
import com.NovaPay.NovaPay.UserEntity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<Customers, Long> {

}
