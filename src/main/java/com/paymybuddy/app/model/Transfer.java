package com.paymybuddy.app.model;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

@Entity
@Table(name="transfer")
@DynamicUpdate
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "amount")
    private double amount;

    @Column(name = "objet")
    private String objet;

    @Column(name = "user_cred_id", nullable = false)
    private Integer cred_id;

    @Column(name = "user_deb_id", nullable = false)
    private Integer deb_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Integer getCred_id() {
        return cred_id;
    }

    public void setCred_id(Integer cred_id) {
        this.cred_id = cred_id;
    }

    public Integer getDeb_id() {
        return deb_id;
    }

    public void setDeb_id(Integer deb_id) {
        this.deb_id = deb_id;
    }
}
