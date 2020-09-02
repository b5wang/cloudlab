package com.b5wang.cloudlab.helloworld.controllers;

import com.b5wang.cloudlab.helloworld.models.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.time.Instant;

@RestController
@RequestMapping("/user")
@Log4j2
public class UserController {

    @PostMapping()
    ResponseEntity<?> createUser(@RequestBody User user){
        log.info(String.format("Create a user: %s",user.toString()));
        return null;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<User> getUser(@RequestParam(name="id") String id){
        User user = new User();
        user.setId("1");
        user.setUserId("wangboneo79");
        user.setPassword("123456789");
        user.setName("Wang Bo");
        user.setCreatedTime(Instant.now().toEpochMilli());
        return ResponseEntity.ok(user);
    }


}
