package com.dockerdemo.DockerDemo.controller;

import com.dockerdemo.DockerDemo.repository.Inventory;
import com.dockerdemo.DockerDemo.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping(value = "/add-inventory")
    public ResponseEntity addInventory() {
        Inventory inventory = inventoryService.addInventory();
        return ResponseEntity.ok(inventory);
    }

    @PostMapping(value = "/get-all-inventory")
    public ResponseEntity getAllInventory() {
        return ResponseEntity.ok(inventoryService.getAll());
    }
}
