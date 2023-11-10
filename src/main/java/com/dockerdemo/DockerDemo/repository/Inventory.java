package com.dockerdemo.DockerDemo.repository;

import lombok.Data;

import javax.persistence.*;

/**
 * Put names in `` to avoid name clashing with mysql reserved keywords
 */
@Data
@Entity
@Table(name = "`inventory-demo`")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "`id`")
    private Long id;

    @Column(name = "`status`")
    private String status;

    public Inventory() {
        this.status = InventoryStatus.AVAILABLE.toString();
    }

    public enum InventoryStatus {
        AVAILABLE("AVAILABLE"),
        PURCHASED("PURCHASED");

        private final String name;

        InventoryStatus(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
