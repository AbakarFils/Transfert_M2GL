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
    private String profil;

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
            ", profil='" + profil + '\'' +
            ", partenaire=" + partenaire +
            ", compte=" + compte +
            ", transactionsOfUserDestinateur=" + transactionsOfUserDestinateur +
            ", transactionsOfUserExpediteur=" + transactionsOfUserExpediteur +
            '}';
    }
}
