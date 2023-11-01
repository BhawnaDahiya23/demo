package com.example.app.service;

import com.example.app.model.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAccounts();

    public Account getAccount(long accountId);

    public Account updateAccount(Account account);

    Account addAccount(Account account);
}
