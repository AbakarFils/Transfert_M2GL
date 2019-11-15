package com.transfert.isi.transfert.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Partenaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String adresse;
    private String email;
    private String tel;
    private String ninea;

    @OneToMany(mappedBy = "partenaire")
    private List<Compte> comptes;



    public Partenaire() {
    }

    public Partenaire(Integer id, String nom, String adresse, String email, String tel, String ninea) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.tel = tel;
        this.ninea = ninea;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        return "Partenaire{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", adresse='" + adresse + '\'' +
            ", email='" + email + '\'' +
            ", tel='" + tel + '\'' +
            ", ninea='" + ninea + '\'' +
            ", comptes=" + comptes +
            '}';
    }
}
