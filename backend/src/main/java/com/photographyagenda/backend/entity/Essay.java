package com.photographyagenda.backend.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "essay")
public class Essay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate date;
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "essay_type_id")
    private EssayType essayType;


    public Essay(){
    }

    public Essay(Integer id, LocalDate date, LocalTime time, Client client, EssayType essayType){
        this.date = date;
        this.time = time;
        this.client = client;
        this.essayType = essayType;
    }
}
