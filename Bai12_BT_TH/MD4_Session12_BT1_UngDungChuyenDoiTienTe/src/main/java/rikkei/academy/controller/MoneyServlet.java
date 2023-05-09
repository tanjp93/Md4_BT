package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@Controller
public class MoneyServlet {
    @GetMapping("/test")
    public void convert(Model model){
        model.addAttribute("s","chờ tí nhá");
    }

    @PostMapping("/test")
    public String showResult(Model model,  @RequestParam("money") float money, @RequestParam("convert") String convert) {
        float rate = 23000;
        if (convert.equals("VND")){
            float vnd = rate * money;
            model.addAttribute("s",vnd);
        }else {
            float usd = rate / money;
            model.addAttribute("s",usd);
        }

        return "test";
    }
}