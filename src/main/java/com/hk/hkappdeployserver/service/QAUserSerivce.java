package com.hk.hkappdeployserver.service;


import com.hk.hkappdeployserver.data.entity.QAUser;
import com.hk.hkappdeployserver.repository.QAUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QAUserSerivce {

  @Autowired
  private QAUserRepository QAUserRepository;

  public List<QAUser> getUsers() {
    return QAUserRepository.findAll();
  }

  public QAUser createUser(String email, String role) {
    QAUser newUser = new QAUser(email, role);
    return QAUserRepository.save(newUser);
  }
}
