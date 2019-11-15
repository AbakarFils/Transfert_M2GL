package com.transfert.isi.transfert.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private Integer montant;
    private Integer commission_ex;
    private Integer commission_des;
    private Integer commission_sys;
    private Double taxe;
    private String type;
    private String code;

    @ManyToOne
    @JoinColumn(name = "expediteur_id" , nullable = false)
    private Client expediteur;

    @ManyToOne
    @JoinColumn(name = "commission_id" , nullable = false)
    private Commission commission;

    @ManyToOne
    @JoinColumn(name = "destinateur_id" , nullable = false)
    private Client destinateur;

    @ManyToOne
    @JoinColumn(name = "user_destinateur_id" , nullable = false)
    private Utilisateur userDestinateur;

    @ManyToOne
    @JoinColumn(name = "user_expediteur_id" , nullable = false)
    private Utilisateur userExpediteur;

    public Transaction() {
    }

    public Transaction(Date date, Integer montant, Integer commission_ex, Integer commission_des, Integer commission_sys, Double taxe, String type, String code) {
        this.date = date;
        this.montant = montant;
        this.commission_ex = commission_ex;
        this.commission_des = commission_des;
        this.commission_sys = commission_sys;
        this.taxe = taxe;
        this.type = type;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public Integer getCommission_ex() {
        return commission_ex;
    }

    public void setCommission_ex(Integer commission_ex) {
        this.commission_ex = commission_ex;
    }

    public Integer getCommission_des() {
        return commission_des;
    }

    public void setCommission_des(Integer commission_des) {
        this.commission_des = commission_des;
    }

    public Integer getCommission_sys() {
        return commission_sys;
    }

    public void setCommission_sys(Integer commission_sys) {
        this.commission_sys = commission_sys;
    }

    public Double getTaxe() {
        return taxe;
    }

    public void setTaxe(Double taxe) {
        this.taxe = taxe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Client getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(Client expediteur) {
        this.expediteur = expediteur;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    public Client getDestinateur() {
        return destinateur;
    }

    public void setDestinateur(Client destinateur) {
        this.destinateur = destinateur;
    }

    public Utilisateur getUserDestinateur() {
        return userDestinateur;
    }

    public void setUserDestinateur(Utilisateur userDestinateur) {
        this.userDestinateur = userDestinateur;
    }

    public Utilisateur getUserExpediteur() {
        return userExpediteur;
    }

    public void setUserExpediteur(Utilisateur userExpediteur) {
        this.userExpediteur = userExpediteur;
    }

    @Override
    public String toString() {
        return "Transaction{" +
            "id=" + id +
            ", date=" + date +
            ", montant=" + montant +
            ", commission_ex=" + commission_ex +
            ", commission_des=" + commission_des +
            ", commission_sys=" + commission_sys +
            ", taxe=" + taxe +
            ", type='" + type + '\'' +
            ", code='" + code + '\'' +
            ", expediteur=" + expediteur +
            ", commission=" + commission +
            ", destinateur=" + destinateur +
            ", userDestinateur=" + userDestinateur +
            ", userExpediteur=" + userExpediteur +
            '}';
    }
}
