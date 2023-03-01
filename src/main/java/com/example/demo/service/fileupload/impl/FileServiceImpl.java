package com.example.demo.service.fileupload.impl;

import com.example.demo.service.fileupload.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;


@Service
public class FileServiceImpl implements FileService {

    @Value("${file.upload-dir}")
    private String path;

    @Override
    public String uploadFile(MultipartFile file) {
        String name = file.getOriginalFilename();

        String ramdomId = UUID.randomUUID().toString();
        String fileName = ramdomId.concat(name.substring(name.lastIndexOf(".")));

        String filePath = path + File.separator + fileName;

        File f = new File(path);

        if(!f.exists()){
            f.mkdir();
        }

        try {
            Files.copy(file.getInputStream(), Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return filePath;
    }

    @Override
    public InputStream getFile(String name) {

        String filePath = path + File.separator + name;
        InputStream inputStream = null;
        try {
             inputStream = new FileInputStream(filePath);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        return inputStream;
    }
}
