package co.kr.ideacube.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.kr.ideacube.springboot.entity.UserDto;
import co.kr.ideacube.springboot.repository.UserRepository;
import co.kr.ideacube.springboot.service.UserService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {
        return userRepository.save(user);
    }

    @Override
    public UserDto getUserById(Long userId) {
        Optional<UserDto> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDto updateUser(UserDto user) {
        UserDto existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        UserDto updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
