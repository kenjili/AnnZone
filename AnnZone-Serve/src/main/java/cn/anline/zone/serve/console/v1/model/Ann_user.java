package cn.anline.zone.serve.console.v1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ann_user {
  @Id
  private Long id;
  private Long role_id;
  @Column(unique = true)//为了系统全局操作的原子性，用户名保持唯一 不用ID+密码两者查询作为登录，用户名方便存储在框架context.login(username:)方便其它数据操作的原子性
  private String username;
  private String password;
  private String avatar;
  private String nickname;
  @Column(unique = true)//一个邮箱注册一个帐号时候 true 这样可以做邮箱号登录也可以
  private String email;
  private Long gender;
  private String profile;
  private Long status;
  private Long create_time;
  private Long update_time;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRole_id() {
    return role_id;
  }

  public void setRole_id(Long role_id) {
    this.role_id = role_id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getGender() {
    return gender;
  }

  public void setGender(Long gender) {
    this.gender = gender;
  }

  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public Long getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Long create_time) {
    this.create_time = create_time;
  }

  public Long getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(Long update_time) {
    this.update_time = update_time;
  }
}
