package com.photographyagenda.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "essay_type")
public class EssayType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public EssayType(){
    }

    public EssayType(Integer id, String name){
        this.name = name;
    }
}
