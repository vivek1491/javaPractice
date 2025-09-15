package org.interview.controller;


import org.interview.apis.UserApi;
import org.interview.dto.UserDto;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {


    @Override
    public ResponseEntity<UserDto> createUser(UserDto userDto) {
        userDto.setMessage("hello vivek");
        return new ResponseEntity<UserDto>(userDto,HttpStatusCode.valueOf(200));
    }
}
