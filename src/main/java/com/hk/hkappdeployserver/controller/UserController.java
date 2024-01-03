package com.hk.hkappdeployserver.controller;


import com.hk.hkappdeployserver.data.entity.QAUser;
import com.hk.hkappdeployserver.service.QAUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private QAUserSerivce qaUserService;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public ResponseEntity<List<QAUser>> getUsers() {
    List<QAUser> users = qaUserService.getUsers();
    return ResponseEntity.status(HttpStatus.OK).body(users);
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public ResponseEntity<QAUser> postUser(@RequestParam String email, String role) {

    QAUser newUser = qaUserService.createUser(email, role);
    return new ResponseEntity<QAUser>(newUser, HttpStatus.CREATED);
  }

}
