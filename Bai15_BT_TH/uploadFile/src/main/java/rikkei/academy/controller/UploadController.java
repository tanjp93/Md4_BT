package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping({"/upload", "/"})
public class UploadController {
    @GetMapping("/")
    public String toHello(){
        return "/hello";
    }
    @PostMapping("/upload")
    public  String upload(@RequestParam("image")MultipartFile image, Model model) throws IOException {
        //upload file
        String uploadPath="C:\\Users\\user\\Desktop\\Rikkei\\MD4\\BT\\JSP-servlet\\100-BT\\Bai15_BT_TH\\uploadFile\\src\\main\\webapp\\assets\\image\\";
        File file= new File(uploadPath);
        if (!file.exists()){
            file.mkdirs();
        }
        String fileName=image.getOriginalFilename();
        // coppy file upload den thu muc Upload anh
        FileCopyUtils.copy(image.getBytes(),new File(uploadPath+File.separator+fileName));
        model.addAttribute("fileName",fileName);
        return "/image";
    }
}
