package com.example.demo.entities.mydb;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "upload_dislike")
public class UploadDislike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "upload_id", nullable = false)
    private Upload upload;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "disliked_by", nullable = false)
    private User dislikedBy;

    @Column(name = "created_on", nullable = false)
    private Date createdOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Upload getUpload() {
        return upload;
    }

    public void setUpload(Upload upload) {
        this.upload = upload;
    }

    public User getDislikedBy() {
        return dislikedBy;
    }

    public void setDislikedBy(User dislikedBy) {
        this.dislikedBy = dislikedBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

}