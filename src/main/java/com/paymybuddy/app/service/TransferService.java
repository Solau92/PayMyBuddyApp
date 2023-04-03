package com.paymybuddy.app.service;

import com.paymybuddy.app.model.Transfer;
import com.paymybuddy.app.repository.TransferRepository;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

    private TransferRepository transferRepository;

    public TransferService(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    public Iterable<Transfer> getTransfers() {
        return transferRepository.findAll();
    }

    public Transfer addTransfer(Transfer transfer){
        return transferRepository.save(transfer);
    }

    public void deleteTransferById(Integer id){
        transferRepository.deleteById(id);
    }
}
