package com.photographyagenda.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String number;

    public Client() {
    }

    public Client(Integer id, String name, String number){
        this.name =  name;
        this.number = number;
    }
}
