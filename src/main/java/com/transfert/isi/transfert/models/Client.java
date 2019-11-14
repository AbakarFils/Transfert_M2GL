package com.transfert.isi.transfert.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numPiece;
    private String nom;
    private String tel;

    @OneToMany(mappedBy = "expediteur")
    private List<Transaction> expediteurs;


    @OneToMany(mappedBy = "destinateur")
    private List<Transaction> destinateurs;
}
