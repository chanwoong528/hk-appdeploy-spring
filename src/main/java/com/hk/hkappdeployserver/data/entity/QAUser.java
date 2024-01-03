package com.hk.hkappdeployserver.data.entity;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.UUID;

@Table(name = "qa_user", uniqueConstraints = {
        @UniqueConstraint(
                name = "email_unique",
                columnNames = {"email"}
        )})
@NoArgsConstructor
@Getter
@Setter
@Entity
public class QAUser extends BaseTimeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @NotNull
  private String email;

  @NotNull
  private String role;

  public QAUser(String email, String role) {
    this.email = email;
    this.role = role;
  }
}
