package com.paymybuddy.app;

import com.paymybuddy.app.model.Contact;
import com.paymybuddy.app.model.Transfer;
import com.paymybuddy.app.model.User;
import com.paymybuddy.app.service.ContactService;
import com.paymybuddy.app.service.TransferService;
import com.paymybuddy.app.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class PayMyBuddyApplication implements CommandLineRunner {

	private UserService userService;

	private TransferService transferService;

	private ContactService contactService;

	public PayMyBuddyApplication(UserService userService, TransferService transferService, ContactService contactService){
		this.userService = userService;
		this.transferService = transferService;
		this.contactService = contactService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PayMyBuddyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

/*		Transfer newTransfer2 = new Transfer();
		newTransfer2.setDate(LocalDate.now().minusDays(1));
		newTransfer2.setAmount(300.0);
		newTransfer2.setObjet("newYesterday");
		newTransfer2.setCred_id(8);
		newTransfer2.setDeb_id(5);

		transferService.addTransfer(newTransfer2);*/


/*		System.out.println("before");
		Iterable<User> usersBefore = userService.getUsers();
		usersBefore.forEach(user -> System.out.println(user.getLastname()));
		Iterable<Transfer> transfersBefore = transferService.getTransfers();
		transfersBefore.forEach(transfer-> System.out.println(transfer.getAmount() + " deb : " + transfer.getDeb_id() + " cred : " + transfer.getCred_id()));

		userService.deleteUserById(1);*/

//		System.out.println("after");
//		Iterable<User> usersAfter = userService.getUsers();
//		usersAfter.forEach(user -> System.out.println(user.getLastname()));
//		Iterable<Transfer> transfersAfter = transferService.getTransfers();
//		transfersAfter.forEach(transfer-> System.out.println(transfer.getAmount() + " deb :" + transfer.getDeb_id() + ", cred : " + transfer.getCred_id()));

//		Iterable<User> usersBefore = userService.getUsers();
//		usersBefore.forEach(user -> System.out.println(user.getLastname()));

/*		User newUser2 = new User();
		newUser2.setFirstname("firstnameNew2");
		newUser2.setLastname("lastnameNew2");
		newUser2.setEmail("emailNew2");
		userService.addUser(newUser2);*/

/*		Contact newContact = new Contact();
		newContact.setIdA(13);
		newContact.setIdB(8);
		contactService.addContact(newContact);*/

//		transferService.deleteTransferById(1);

//		userService.deleteUserById(6);
//
//		Iterable<User> usersAfter = userService.getUsers();
//		usersAfter.forEach(user -> System.out.println(user.getLastname()));
//
//		userService.deleteUserById(7);
//
//		Iterable<User> usersAfterAfter = userService.getUsers();
//		usersAfterAfter.forEach(user -> System.out.println(user.getLastname()));
	}
}
