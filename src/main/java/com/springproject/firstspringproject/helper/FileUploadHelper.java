package com.springproject.firstspringproject.helper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

    //public final String UPLOAD_DIR="C:\\Users\\deepanshu\\Desktop\\Learning\\firstspringproject\\firstspringproject\\src\\main\\resources\\static\\images";
    public final String UPLOAD_DIR=new ClassPathResource("static/images/").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException{
        
    }
    public boolean isUploaded(MultipartFile file)
    {
        boolean f = false;

        try{

            // InputStream is = file.getInputStream();
            // byte data[] = new byte[is.available()];
            // is.read(data);

            // FileOutputStream fs = new FileOutputStream(UPLOAD_DIR+"\\"+file.getOriginalFilename());
            // fs.write(data);

            // fs.flush();
            // fs.close();
            // f = true;

            Files.copy(file.getInputStream(), Paths.get(UPLOAD_DIR+"\\"+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            f = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
}
