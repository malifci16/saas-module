package com.wave.tech.saas.wrapper;

import com.wave.tech.saas.dto.EtisalatSassServiceObjectResponse;
import com.wave.tech.saas.dto.account.CreateAccountRequest;
import com.wave.tech.saas.dto.account.CreateAccountResponse;
import com.wave.tech.saas.dto.account.SuspendAccountRequest;
import com.wave.tech.saas.dto.account.SuspendAccountResponse;

/**
 *
 * @author mohamed.abdelsalam
 */
public interface AccountWrapper {

    public EtisalatSassServiceObjectResponse<CreateAccountResponse>
            createAccount(CreateAccountRequest request) throws Exception;

    public EtisalatSassServiceObjectResponse<SuspendAccountResponse>
            suspendAccount(SuspendAccountRequest request) throws Exception;

}
