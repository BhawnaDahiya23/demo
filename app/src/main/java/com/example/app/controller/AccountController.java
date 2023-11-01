package com.example.app.controller;

import com.example.app.model.Account;
import com.example.app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;


    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        return this.accountService.getAccounts();
    }


    @GetMapping("/accounts/{accountId}")
    public Account getAccount(@PathVariable String accountId ) {

        return this.accountService.getAccount(Long.parseLong(accountId));
    }
    @PostMapping("/accounts")
    public Account addAccount(@RequestBody Account account) {
        return this.accountService.addAccount(account);
    }

    @PutMapping("/accounts")
    public Account updateAccount(@RequestBody Account account) {
        return this.accountService.updateAccount(account);
    }



}
