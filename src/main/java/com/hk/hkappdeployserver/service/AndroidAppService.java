package com.hk.hkappdeployserver.service;

import com.hk.hkappdeployserver.data.entity.AndroidApp;
import com.hk.hkappdeployserver.repository.AndroidAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AndroidAppService {

  @Autowired
  private AndroidAppRepository androidAppRepository;

  public List<AndroidApp> getAndroidApps() {
    return androidAppRepository.findAll();
  }

  public AndroidApp createAndroidApp(String appName, String description) {
    AndroidApp newApp = new AndroidApp(appName, description);
    return androidAppRepository.save(newApp);
  }


}
