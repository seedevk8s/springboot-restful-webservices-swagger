package co.kr.ideacube.springboot.service;

import java.util.List;

import co.kr.ideacube.springboot.entity.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
    UserDto updateUser(UserDto user);
    void deleteUser(Long userId);
}
