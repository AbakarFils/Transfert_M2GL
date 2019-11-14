package com.transfert.isi.transfert.models;

import javax.persistence.*;

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
}
