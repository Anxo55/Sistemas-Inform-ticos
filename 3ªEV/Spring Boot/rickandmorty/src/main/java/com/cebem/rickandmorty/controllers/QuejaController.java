package com.cebem.rickandmorty.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cebem.rickandmorty.Services.QuejaService;
import com.cebem.rickandmorty.models.QuejaModel;

@Controller
public class QuejaController {
    @Autowired
    QuejaService quejaService;

    @RequestMapping("/quejas") 
    public String quejas(Model model) {
            ArrayList<QuejaModel> quejas = quejaService.getAllQuejas();
            model.addAttribute("misQuejas", quejas);
            return "quejaList";
    }

    @PostMapping("/quejas")
    public String quejasAdd(@RequestParam Map<String, String> body){
        String description = body.get("description");
        String url = body.get("url");
        String category = body.get("category");
        String author = body.get("author");

        QuejaModel nuevaQueja = new QuejaModel();
        nuevaQueja.setDescription(description);
        nuevaQueja.setUrl(url);
        nuevaQueja.setCategory(category);
        nuevaQueja.setAuthor(author);

        quejaService.createQueja(nuevaQueja);
        return "quejaOK";
    }

    @RequestMapping("/quejas/addForm")
    public String quejaAddForm(){
        return "quejaAddForm";
    
}
}