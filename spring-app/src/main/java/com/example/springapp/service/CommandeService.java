package com.example.springapp.service;

import com.example.springapp.bean.Commande;

import java.util.List;

public interface CommandeService {

    int save(Commande commande);

    List<Commande> findAll();
}
