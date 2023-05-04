package com.cebem.rickandmorty.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cebem.rickandmorty.Services.MemeService;
import com.cebem.rickandmorty.models.MemeModel;

@Controller
public class MemeController {
    @Autowired
    MemeService memeService;

    @RequestMapping("/memes")
    public String memes(Model model)  {
        ArrayList<MemeModel> memes = memeService.getAllMemes();
       model.addAttribute("misMemes", memes);
        return "memeList";
    }

    @PostMapping("/memes")
    public String memesAdd() {
        return "OK";
    }
    
    @RequestMapping("/memes/addForm")
    public String memeAddForm() {
        return "memeAddForm";
    }

}
