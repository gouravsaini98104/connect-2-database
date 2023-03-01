package com.example.demo.entities.mydb;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "upload_type_master")
public class UploadTypeMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "code", nullable = false, length = 45)
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "created_on", nullable = false)
    private Date createdOn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

}