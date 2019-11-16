package com.transfert.isi.transfert.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer minCommission;
    private Integer maxCommission;
    private Integer commission;

    @OneToMany(mappedBy = "commission")
    private List<Transaction> transactions;

    public Commission() {
    }

    public Commission(Integer minCommission, Integer maxCommission, Integer commission) {
        this.minCommission = minCommission;
        this.maxCommission = maxCommission;
        this.commission = commission;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMinCommission() {
        return minCommission;
    }

    public void setMinCommission(Integer minCommission) {
        this.minCommission = minCommission;
    }

    public Integer getMaxCommission() {
        return maxCommission;
    }

    public void setMaxCommission(Integer maxCommission) {
        this.maxCommission = maxCommission;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Commission{" +
            "id=" + id +
            ", minCommission=" + minCommission +
            ", maxCommission=" + maxCommission +
            ", commission=" + commission +
            ", transactions=" + transactions +
            '}';
    }
}
