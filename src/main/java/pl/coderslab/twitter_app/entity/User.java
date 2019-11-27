package pl.coderslab.twitter_app.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
//
//  @NotEmpty
//  private String username;

  @NotEmpty
  @Email
  @Column(unique = true)
  @Size(max = 50)
  private String email;

  @NotEmpty
  private String password;

  private boolean enabled;

  public User() {
  }

  public User(@NotEmpty @Email @Size(max = 50) String email, @NotEmpty String password) {
    this.email = email;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
