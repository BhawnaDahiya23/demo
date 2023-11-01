package com.example.app.service;

import com.example.app.model.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServices implements AccountService{

    List<Account> list;

    public AccountServices() {
        list = new ArrayList<>();
        list.add(new Account(1, "1234567890", 1000.00));
        list.add(new Account(2, "9876543210", 500.00));

    }

    @Override
    public List<Account> getAccounts(){
        return list;
    }

    @Override
    public Account getAccount(long accountId) {
        Account a = null;
        for(Account account:list) {
            if(account.getId()==accountId) {
                a=account;
                break;
            }
        }
        return a;
    }

    @Override
    public Account updateAccount(Account account) {
        list.forEach(e ->{
            if (e.getId() == account.getId()) {
                e.setAccountNumber(account.getAccountNumber());
                e.setBalance(account.getBalance());
            }
        });
        return account;
    }

    @Override
    public Account addAccount(Account account) {
        list.add(account);
        return account;
    }


}
