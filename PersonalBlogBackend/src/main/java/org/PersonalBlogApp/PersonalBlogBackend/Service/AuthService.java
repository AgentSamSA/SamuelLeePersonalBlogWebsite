package org.PersonalBlogApp.PersonalBlogBackend.Service;

import org.PersonalBlogApp.PersonalBlogBackend.DAO.UserDao;
import org.PersonalBlogApp.PersonalBlogBackend.DTO.LoginRequest;
import org.PersonalBlogApp.PersonalBlogBackend.DTO.RegisterRequest;
import org.PersonalBlogApp.PersonalBlogBackend.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserUsername(registerRequest.getUsername());
        user.setUserPassword(encodePassword(registerRequest.getPassword()));
        user.setUserEmail(registerRequest.getEmail());
        userDao.save(user);
    }

    public void login(LoginRequest loginRequest) {
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername()
                        , loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }
}
