package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankAccountService {

    void add(BankAccount bankAccount);

    ArrayList<BankAccount> getAllAccount();

    void createAccount();

    void riseBalance(BankAccount selectedAccount);

}



