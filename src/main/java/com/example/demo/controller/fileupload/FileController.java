package com.example.demo.controller.fileupload;

import com.example.demo.models.ImageResponse;
import com.example.demo.service.fileupload.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/file")
public class FileController {


    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<ImageResponse>  imageUpload(@RequestParam("image") MultipartFile file){
        String name = fileService.uploadFile(file);
        ImageResponse imageResponse = new ImageResponse();

        imageResponse.setMessage("Sucessfully uploaded");
        imageResponse.setName(name);

        return new ResponseEntity<>(imageResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/download/{name}", produces = MediaType.ALL_VALUE)
    public void downloadFile(@PathVariable("name") String fileName, HttpServletResponse response) throws IOException {

        InputStream inputStream = fileService.getFile(fileName);

        response.setContentType(MediaType.ALL_VALUE);

        StreamUtils.copy(inputStream, response.getOutputStream());

    }
}
