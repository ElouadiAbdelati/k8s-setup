package com.example.springapp.serviceImpl;

import com.example.springapp.bean.Commande;
import com.example.springapp.repository.CommandeRepository;
import com.example.springapp.service.CommandeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandeServiceImpl implements CommandeService {
    private final CommandeRepository commandeRepository;

    @Override
    public int save(Commande commande) {
        commandeRepository.save(commande);
        return 0;
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }


}
