package org.PersonalBlogApp.PersonalBlogBackend.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Entity
@Table(name = "tbl_posts")
public class Post {

    @Id
    @Column(name = "p_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(name = "p_title")
    @NotBlank
    private String postTitle;

    @Lob
    @Column(name = "p_content")
    @NotEmpty
    private String postContent;

    @Column(name = "p_created")
    private Instant postCreatedOn;

    @Column(name = "p_updated")
    private Instant postUpdatedAt;

    @Column(name = "p_username")
    @NotBlank
    private String postUsername;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Instant getPostCreatedOn() {
        return postCreatedOn;
    }

    public void setPostCreatedOn(Instant postCreatedOn) {
        this.postCreatedOn = postCreatedOn;
    }

    public Instant getPostUpdatedAt() {
        return postUpdatedAt;
    }

    public void setPostUpdatedAt(Instant postUpdatedAt) {
        this.postUpdatedAt = postUpdatedAt;
    }

    public String getPostUsername() {
        return postUsername;
    }

    public void setPostUsername(String postUsername) {
        this.postUsername = postUsername;
    }
}
