package com.example.spring.SocialMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/account")
    List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @DeleteMapping("account/d/{Id}")
    public void deleteProduct(@PathVariable("Id") String id) {
        accountService.deleteAccount(id);
    }

    @PostMapping("/account")
    public void saveBook(@RequestBody Account account) {
        accountService.addAccount(account);
    }
}
