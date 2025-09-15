package org.interview.service;

import org.interview.dao.User;
import org.interview.dto.UserDto;
import org.interview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

     @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
         User user = new User();
         user.setFirstName(userDto.getFirstName());
         user.setLastName(userDto.getLastName());
         user.setEmail(userDto.getEmail());
         user.setRole(userDto.getRole());
         user = userRepository.save(user);
          UserDto result = new UserDto();
          result.setId(user.getId());
          result.setFirstName(user.getFirstName());
          result.setLastName(user.getLastName());
          result.setEmail(user.getEmail());
          result.setRole(user.getRole());
        return result;
    }
}
