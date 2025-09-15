package org.interview.apis;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.interview.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/user")
@Tag(name = "User API", description = "Operations related to user management")
public interface UserApi {
    @PostMapping(path = "/createUser")
    @Operation(summary = "create user", description = "API to create a new user")
    ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto);

}
