package com.transfert.isi.transfert.models;

import javax.persistence.*;
import java.util.Date;

public class Versement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer montant;
   private Date date;

    @ManyToOne
    @JoinColumn(name = "compte_id" , nullable = false)
    private Compte compte;
}
