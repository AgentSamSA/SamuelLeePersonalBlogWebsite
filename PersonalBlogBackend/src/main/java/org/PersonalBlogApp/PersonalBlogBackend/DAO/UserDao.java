package org.PersonalBlogApp.PersonalBlogBackend.DAO;

import org.PersonalBlogApp.PersonalBlogBackend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    Optional<User> findByUserUsername(String username);
}
