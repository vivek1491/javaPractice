package org.interview.controller;


import org.interview.dto.User;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {


    @PostMapping(path = "createUser")
    ResponseEntity<User> createUser()
    {
         User user =new User();
         user.setMessage("hello vivek");
        return new ResponseEntity<User>(user,HttpStatusCode.valueOf(200));
    }
}
