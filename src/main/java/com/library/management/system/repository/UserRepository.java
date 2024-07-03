package com.library.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.management.system.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
