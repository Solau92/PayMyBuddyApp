package com.paymybuddy.app.model;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="contact")
@IdClass(ContactId.class)
@DynamicUpdate
public class Contact {

    @Id
    @Column(name="user_a_id", nullable = false)
    private Integer idA;

    @Id
    @Column(name="user_b_id", nullable = false)
    private Integer idB;

    public Integer getIdA() {
        return idA;
    }

    public void setIdA(Integer idA) {
        this.idA = idA;
    }

    public Integer getIdB() {
        return idB;
    }

    public void setIdB(Integer idB) {
        this.idB = idB;
    }
}
