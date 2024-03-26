package com.supermercado.market.Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermercado.market.Domain.Client;
import com.supermercado.market.Repo.ClientRepository;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Transactional
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    // Otros métodos para actualizar y eliminar clientes si es necesario
}