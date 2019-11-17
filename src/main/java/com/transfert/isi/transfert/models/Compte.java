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
    @JoinColumn(name = "partenaire_id", nullable = false)
    private Partenaire partenaire;

    @OneToMany(mappedBy = "compte")
    private List<Utilisateur> utilisateurs;

    @OneToMany(mappedBy = "compte")
    private List<Versement> versements;


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

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public List<Versement> getVersements() {
        return versements;
    }

    public void setVersements(List<Versement> versements) {
        this.versements = versements;
    }

    @Override
    public String toString() {
        return "Compte{" +
            "id=" + id +
            ", numero='" + numero + '\'' +
            ", solde=" + solde +
            ", partenaire=" + partenaire +
            ", utilisateurs=" + utilisateurs +
            ", versements=" + versements +
            '}';
    }
}
