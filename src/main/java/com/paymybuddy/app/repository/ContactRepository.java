package com.paymybuddy.app.repository;

import com.paymybuddy.app.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

/*    public void deleteByIdA(Integer id);

    public void deleteByIdB(Integer id);*/

}
