package org.PersonalBlogApp.PersonalBlogBackend.Service;

import org.PersonalBlogApp.PersonalBlogBackend.DAO.UserDao;
import org.PersonalBlogApp.PersonalBlogBackend.DTO.RegisterRequest;
import org.PersonalBlogApp.PersonalBlogBackend.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserUsername(registerRequest.getUsername());
        user.setUserPassword(encodePassword(registerRequest.getPassword()));
        user.setUserEmail(registerRequest.getEmail());
        userDao.save(user);
    }

    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }
}
