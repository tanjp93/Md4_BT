package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@Controller
public class DictionaryServlet{
    @GetMapping("/dictionary")
    public void dictionary(Model model){
        model.addAttribute("s","nhập gì đó để tra cứu");

    }
    @PostMapping("/dictionary")
    public String search(Model model, @RequestParam("name") String name){
        if (name.equals("hello")){
            model.addAttribute("s","xin chào");
        } else if (name.equals("good")){
            model.addAttribute("s","rất tốt");
        }else if (name.equals("nhan")){
            model.addAttribute("s","Nhân hội chứng TIC");
        }
        return "dictionary";
    }
}