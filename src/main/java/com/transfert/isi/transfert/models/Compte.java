package com.transfert.isi.transfert.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Integer solde;
    @ManyToOne
    @JoinColumn(name = "partenaire_id" , nullable = false)
    private Partenaire partenaire;

    @OneToMany(mappedBy = "utilisteur")
    private List<Compte> comptes;



    public Compte() {
    }

    public Compte(String numero, Integer solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public Partenaire getPartenaire() {
        return partenaire;
    }

    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }
}
