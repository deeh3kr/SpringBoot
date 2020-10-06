package com.springproject.firstspringproject.controller;

import com.springproject.firstspringproject.helper.FileUploadHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadHelper fileUploadHelper;

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
    {
        try{
            if(file.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must conatin a file");
        }
        if(!file.getContentType().equals("image/jpeg"))
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEG is allowed");
        }

        if(fileUploadHelper.isUploaded(file))
        {
            String output = file.getOriginalFilename() + " " + file.getSize();
            System.out.println(output);
            //return ResponseEntity.ok("File Uploaded Successfully");
            return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
        }else{
            System.out.println("File not Uploaded");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File Not Uploaded Successfully");
    }
}
