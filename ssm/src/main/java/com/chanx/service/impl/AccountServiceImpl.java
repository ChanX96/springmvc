package com.chanx.service.impl;

import com.chanx.domain.Account;
import com.chanx.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public List<Account> findAll() {

        System.out.println("业务层查询所有账户...");
        return null;
    }

    @Override
    public void saveAccount(Account account) {

        System.out.println("业务层保存账户...");
    }
}
