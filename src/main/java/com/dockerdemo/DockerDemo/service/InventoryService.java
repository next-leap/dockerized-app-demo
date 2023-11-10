package com.dockerdemo.DockerDemo.service;

import com.dockerdemo.DockerDemo.repository.Inventory;
import com.dockerdemo.DockerDemo.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    @Autowired
    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory addInventory() {
        Inventory inventory = new Inventory();
        return inventoryRepository.save(inventory);
    }

    public Iterable<Inventory> getAll() {
        return inventoryRepository.findAll();
    }
}
