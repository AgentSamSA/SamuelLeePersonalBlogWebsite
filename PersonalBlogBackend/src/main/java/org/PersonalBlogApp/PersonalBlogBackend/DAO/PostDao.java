package org.PersonalBlogApp.PersonalBlogBackend.DAO;

import org.PersonalBlogApp.PersonalBlogBackend.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends JpaRepository<Post, Long> {
}
