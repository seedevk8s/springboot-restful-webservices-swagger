package co.kr.ideacube.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.kr.ideacube.springboot.entity.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Long> {
}
