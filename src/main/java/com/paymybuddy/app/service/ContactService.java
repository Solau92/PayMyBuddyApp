package com.paymybuddy.app.service;

import com.paymybuddy.app.model.Contact;
import com.paymybuddy.app.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Iterable<Contact> getContacts() {
        return contactRepository.findAll();
    }

    public Contact addContact(Contact ccontact) {
        return contactRepository.save(ccontact);
    }

/*    public void deleteContactByIdA(Integer id) {
        contactRepository.deleteByIdA(id);
    }

    public void deleteContactByIdB(Integer id) {
        contactRepository.deleteByIdB(id);
    }*/

}
