package com.paymybuddy.app.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;

import java.io.Serializable;
import java.util.Objects;

public class ContactId implements Serializable {

    private Integer idA;

    private Integer idB;

    public ContactId() {
    }

    public ContactId(Integer idA, Integer idB){
        this.idA = idA;
        this.idB = idB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactId contactId = (ContactId) o;
        return Objects.equals(idA, contactId.idA) && Objects.equals(idB, contactId.idB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idA, idB);
    }
}
