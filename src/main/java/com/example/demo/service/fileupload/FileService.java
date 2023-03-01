package com.example.demo.service.fileupload;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

public interface FileService {
    String uploadFile(MultipartFile file);

    InputStream getFile(String name);
}
