package com.example.spring.SocialMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    void addAccount(Account account) {
        accountRepository.save(account);
    }

    void deleteAccount(String ID) {
        accountRepository.deleteById(ID);
    }
}
