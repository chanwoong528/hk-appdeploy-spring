package com.hk.hkappdeployserver.repository;

import com.hk.hkappdeployserver.data.entity.QAUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QAUserRepository extends JpaRepository<QAUser, Long> {

}
