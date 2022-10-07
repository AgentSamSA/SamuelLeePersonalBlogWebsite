package org.PersonalBlogApp.PersonalBlogBackend.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_users")
public class User {

    @Id
    @Column(name="u_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name="u_username")
    private String userUsername;

    @Column(name="u_password")
    private String userPassword;

    @Column(name="u_email")
    private String userEmail;

    public User() {
    }

    public User(String userUsername, String userPassword, String userEmail) {
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
