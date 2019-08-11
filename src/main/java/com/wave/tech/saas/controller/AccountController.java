package com.wave.tech.saas.controller;

import com.wave.tech.saas.defines.ApiEndPoints;
import com.wave.tech.saas.dto.EtisalatSassServiceObjectResponse;
import com.wave.tech.saas.dto.account.CreateAccountRequest;
import com.wave.tech.saas.dto.account.CreateAccountResponse;
import com.wave.tech.saas.dto.account.SuspendAccountRequest;
import com.wave.tech.saas.dto.account.SuspendAccountResponse;
import com.wave.tech.saas.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mohamed.abdelsalam
 */
@RestController
@RequestMapping(ApiEndPoints.ACCOUNT_CONTROLLER.CONTROLLER_NAME)
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(ApiEndPoints.ACCOUNT_CONTROLLER.CREATE)
    public EtisalatSassServiceObjectResponse<CreateAccountResponse>
            createAccount(@RequestBody CreateAccountRequest createAccountRequest) throws Exception {
        return this.accountService.createAccount(createAccountRequest);
    }

    @PostMapping(ApiEndPoints.ACCOUNT_CONTROLLER.SUSPEND)
    public EtisalatSassServiceObjectResponse<SuspendAccountResponse>
            suspendAccount(@RequestBody SuspendAccountRequest suspendAccountRequest) throws Exception {
        return this.accountService.suspendAccount(suspendAccountRequest);
    }

}
