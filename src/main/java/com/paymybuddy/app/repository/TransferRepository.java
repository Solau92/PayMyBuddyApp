package com.paymybuddy.app.repository;

import com.paymybuddy.app.model.Transfer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends CrudRepository<Transfer, Integer> {
}
