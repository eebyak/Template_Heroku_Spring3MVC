package com.example.service;


import java.util.List;

import com.example.model.Toy;

public interface ToyService {
    
    public void addToy(Toy toy);
    public List<Toy> listToys();
    public void removeToy(Integer id);
}
