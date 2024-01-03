package com.hk.hkappdeployserver.data.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "app_version", uniqueConstraints =
        {@UniqueConstraint(
                name = "app_version_unique",
                columnNames = {"version", "buildNumber"}
        )})
@NoArgsConstructor
@Getter
@Setter
@Entity
public class AppVersion extends BaseTimeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @NotNull
  private UUID appId;

  @NotNull
  private String version;

  @NotNull
  private int buildNumber;

  @NotNull
  private String deployCate;

  @NotNull
  private String filePath;

  public AppVersion(UUID appId, String version, int buildNumber, String deployCate, String filePath) {
    this.appId = appId;
    this.version = version;
    this.buildNumber = buildNumber;
    this.deployCate = deployCate;
    this.filePath = filePath;

  }

}
