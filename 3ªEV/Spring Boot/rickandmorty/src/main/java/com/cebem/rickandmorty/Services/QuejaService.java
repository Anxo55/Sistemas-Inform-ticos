package com.cebem.rickandmorty.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cebem.rickandmorty.models.QuejaModel;
import com.cebem.rickandmorty.repositories.QuejaRepository;

@Service
public class QuejaService {
    @Autowired
    QuejaRepository quejaRepository;

    public ArrayList<QuejaModel> getAllQuejas() {

        return (ArrayList<QuejaModel>)quejaRepository.findAll();
    }

    public QuejaModel createQueja(QuejaModel queja) {
        return quejaRepository.save(queja);
    }

    public boolean deleteQueja(long id) {
try {
    quejaRepository.deleteById(id);
    return true;
} catch (IllegalArgumentException ex) {
        return false;
}
    }
    
}
