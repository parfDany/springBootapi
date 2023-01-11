package com.parfendanila.PP_2_3_1_spring_mvc_hibernate.repository;

import com.parfendanila.PP_2_3_1_spring_mvc_hibernate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
