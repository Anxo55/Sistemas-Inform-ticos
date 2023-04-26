package com.cebem.rickandmorty.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name="meme")
public class MemeModel {
    long id;
    String category;
    String url;
    String description;
    String author;
    Date createDate; 
}

// ORM (JPA)
// //todos los memes
// "select * from meme"

// ArrayList<MemeModel> listado = MemeModel.lisAll();

// //añadir un meme
// "insert into meme (descripcion, url) values ('disaster girl', 'xxxxxxx')"

// MemeModel memeNinna = new MemeModel();
// memeNinna.description="disaster gilt";
// memeNinna.url="xxxxxxx";
// memeNinna.save();