package com.abc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.abc.api.repository.ClientRepository;
import com.abc.api.model.Client;

import java.util.Optional;

public class ClientController
{
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/client")
    public Optional<Client> getClient(@RequestParam("clientId") Long clientId){
        return clientRepository.findById(clientId);
    }
}
