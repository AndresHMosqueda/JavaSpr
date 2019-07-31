package com.exampleAndres1.app.ws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exampleAndres1.app.ws.io.entity1.UserEntity1;


@Repository
public interface UserRepository extends CrudRepository<UserEntity1, Long> {

}
