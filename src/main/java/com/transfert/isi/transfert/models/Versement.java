package com.transfert.isi.transfert.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Versement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer montant;
   private Date date;

    @ManyToOne
    @JoinColumn(name = "compte_id" , nullable = false)
    private Compte compte;

    public Versement() {
    }

    public Versement(Integer montant, Date date) {
        this.montant = montant;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
