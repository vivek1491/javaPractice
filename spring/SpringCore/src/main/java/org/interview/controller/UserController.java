package org.interview.controller;


import org.interview.apis.UserApi;
import org.interview.dto.UserDto;
import org.interview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<UserDto> createUser(UserDto userDto) {
        userDto = userService.createUser(userDto);
        return new ResponseEntity<UserDto>(userDto,HttpStatusCode.valueOf(200));
    }
}
