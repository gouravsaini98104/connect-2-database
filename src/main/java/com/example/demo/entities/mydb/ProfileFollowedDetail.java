package com.example.demo.entities.mydb;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "profile_followed_details")
public class ProfileFollowedDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "followed_user")
    private User followedUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "followed_by")
    private User followedBy;

    @Column(name = "created_on", nullable = false)
    private Date createdOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getFollowedUser() {
        return followedUser;
    }

    public void setFollowedUser(User followedUser) {
        this.followedUser = followedUser;
    }

    public User getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(User followedBy) {
        this.followedBy = followedBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

}