package com.wave.tech.saas.service.impl;

import com.wave.tech.saas.dto.EtisalatSassServiceObjectResponse;
import com.wave.tech.saas.dto.account.CreateAccountRequest;
import com.wave.tech.saas.dto.account.CreateAccountResponse;
import com.wave.tech.saas.dto.account.SuspendAccountRequest;
import com.wave.tech.saas.dto.account.SuspendAccountResponse;
import com.wave.tech.saas.service.AccountService;
import com.wave.tech.saas.wrapper.AccountWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohamed.abdelsalam
 */
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountWrapper accountWrapper;

    @Autowired
    public AccountServiceImpl(AccountWrapper accountWrapper) {
        this.accountWrapper = accountWrapper;
    }

    @Override
    public EtisalatSassServiceObjectResponse<CreateAccountResponse> createAccount(CreateAccountRequest request) throws Exception {
        return accountWrapper.createAccount(request);
    }

    @Override
    public EtisalatSassServiceObjectResponse<SuspendAccountResponse> suspendAccount(SuspendAccountRequest request) throws Exception {
        return accountWrapper.suspendAccount(request);
    }
}
