package com.hk.hkappdeployserver.repository;

import com.hk.hkappdeployserver.data.entity.AndroidApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AndroidAppRepository extends JpaRepository<AndroidApp, Long> {
}
