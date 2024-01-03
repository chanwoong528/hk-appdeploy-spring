package com.hk.hkappdeployserver.data.entity;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "android_app")
@NoArgsConstructor
@Getter
@Setter
@Entity
public class AndroidApp extends BaseTimeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @NotNull
  private String appName;

  private String description;


  public AndroidApp(String appName, String description) {
    this.appName = appName;
    this.description = description;
  }

}
