package com.transfert.isi.transfert.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String login;
    private String password;
    private String nomComplet;
    private String email;
    private String photo;


    @ManyToMany
    @JoinTable(name = "utilisateur_role",
        joinColumns =@JoinColumn(name = "utilisateur_id"),
        inverseJoinColumns =@JoinColumn(name = "role_id")
    )
    private List<Authority> roles; // correspond au mapeBy de l autre cote

    @ManyToOne
    @JoinColumn(name = "partenaire_id")
    private Partenaire partenaire; // correspond au mapeBy de l autre cote

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte;

    @OneToMany(mappedBy = "userDestinateur")
    private List<Transaction> transactionsOfUserDestinateur;


    @OneToMany(mappedBy = "userExpediteur")
    private List<Transaction> transactionsOfUserExpediteur;

    @Override
    public String toString() {
        return "Utilisateur{" +
            "id=" + id +
            ", login='" + login + '\'' +
            ", password='" + password + '\'' +
            ", nomComplet='" + nomComplet + '\'' +
            ", email='" + email + '\'' +
            ", photo='" + photo + '\'' +
            ", partenaire=" + partenaire +
            ", compte=" + compte +
            ", transactionsOfUserDestinateur=" + transactionsOfUserDestinateur +
            ", transactionsOfUserExpediteur=" + transactionsOfUserExpediteur +
            '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



    public Partenaire getPartenaire() {
        return partenaire;
    }

    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public List<Transaction> getTransactionsOfUserDestinateur() {
        return transactionsOfUserDestinateur;
    }

    public void setTransactionsOfUserDestinateur(List<Transaction> transactionsOfUserDestinateur) {
        this.transactionsOfUserDestinateur = transactionsOfUserDestinateur;
    }

    public List<Transaction> getTransactionsOfUserExpediteur() {
        return transactionsOfUserExpediteur;
    }

    public void setTransactionsOfUserExpediteur(List<Transaction> transactionsOfUserExpediteur) {
        this.transactionsOfUserExpediteur = transactionsOfUserExpediteur;
    }

    public List<Authority> getRoles() {
        return roles;
    }

    public void setRoles(List<Authority> roles) {
        this.roles = roles;
    }
}
