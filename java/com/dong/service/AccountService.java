package com.dong.service;

import com.dong.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void add(Account account);
}
