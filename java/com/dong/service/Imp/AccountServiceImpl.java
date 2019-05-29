package com.dong.service.Imp;

import com.dong.dao.AccountDao;
import com.dong.domain.Account;
import com.dong.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("查询所有的业务层方法执行....");
        List<Account> all = accountDao.findAll();
        return all;
    }

    @Override
    public void add(Account account) {
        System.out.println("添加用户的业务层方法执行");
        accountDao.add(account);
    }
}
