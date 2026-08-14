package com.NovaPay.NovaPay.UserController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.NovaPay.NovaPay.UserEntity.Customers;
import com.NovaPay.NovaPay.UserService.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping()
public class UserController {
    
    private UserService userService;
    
   
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/{id:\\d+}")
    public Customers getUser(@PathVariable Long id)  {

        return userService.getCustomerById(id);

    }
   
   @PostMapping()
    public HttpStatus createCustomer(@RequestBody Customers customer) {
        return userService.saveCustomer(customer);
    }
    

}
