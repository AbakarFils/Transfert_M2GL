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

    public Client() {
    }

    public Client(String numPiece, String nom, String tel) {
        this.numPiece = numPiece;
        this.nom = nom;
        this.tel = tel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumPiece() {
        return numPiece;
    }

    public void setNumPiece(String numPiece) {
        this.numPiece = numPiece;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Transaction> getExpediteurs() {
        return expediteurs;
    }

    public void setExpediteurs(List<Transaction> expediteurs) {
        this.expediteurs = expediteurs;
    }

    public List<Transaction> getDestinateurs() {
        return destinateurs;
    }

    public void setDestinateurs(List<Transaction> destinateurs) {
        this.destinateurs = destinateurs;
    }

    @Override
    public String toString() {
        return "Client{" +
            "id=" + id +
            ", numPiece='" + numPiece + '\'' +
            ", nom='" + nom + '\'' +
            ", tel='" + tel + '\'' +
            ", expediteurs=" + expediteurs +
            ", destinateurs=" + destinateurs +
            '}';
    }
}
