package com.star.repository;

import com.star.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by hp on 2017/3/10.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    User findByEmailAndPassword(String email,String password);
}
