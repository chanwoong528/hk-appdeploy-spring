package com.hk.hkappdeployserver.controller;


import com.hk.hkappdeployserver.data.entity.AndroidApp;
import com.hk.hkappdeployserver.service.AndroidAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/app")
public class AndroidAppController {

  @Autowired
  private AndroidAppService androidAppService;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public ResponseEntity<List<AndroidApp>> getApps() {
    List<AndroidApp> apps = androidAppService.getAndroidApps();
    return ResponseEntity.status(HttpStatus.OK).body(apps);
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public ResponseEntity<AndroidApp> postApps(@RequestParam String appName, String description) {
    AndroidApp newApp = androidAppService.createAndroidApp(appName, description);
    return new ResponseEntity<AndroidApp>(newApp, HttpStatus.CREATED);
  }

}
