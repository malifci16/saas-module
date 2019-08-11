package com.wave.tech.saas.wrapper.impl;

import com.wave.tech.saas.dto.EtisalatSassServiceObjectResponse;
import com.wave.tech.saas.dto.account.CreateAccountRequest;
import com.wave.tech.saas.dto.account.CreateAccountResponse;
import com.wave.tech.saas.dto.account.SuspendAccountRequest;
import com.wave.tech.saas.dto.account.SuspendAccountResponse;
import com.wave.tech.saas.wrapper.AccountWrapper;
import com.wave.tech.saas.wrapper.SassCustomWrapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author mohamed.abdelsalam
 */
@Component
public class AccountWrapperImpl extends SassCustomWrapper implements AccountWrapper {

    @Value("${etisalat.saas.account.create}")
    private String createAccount;
    @Value("${etisalat.saas.account.suspend}")
    private String suspendAccount;

    @Override
    public EtisalatSassServiceObjectResponse<CreateAccountResponse> createAccount(CreateAccountRequest request) throws Exception {
        ResponseEntity<EtisalatSassServiceObjectResponse> responseEntity
                = this.getRestTemplate().exchange(this.getServiceUri(createAccount),
                        HttpMethod.POST, this.getRequestEntity(request), EtisalatSassServiceObjectResponse.class);
        if (this.isValidResponseEntity(responseEntity)) {
            return responseEntity.getBody();
        }
        return null;
    }

    @Override
    public EtisalatSassServiceObjectResponse<SuspendAccountResponse> suspendAccount(SuspendAccountRequest request) throws Exception {
        ResponseEntity<EtisalatSassServiceObjectResponse> responseEntity
                = this.getRestTemplate().exchange(this.getServiceUri(suspendAccount),
                        HttpMethod.POST, this.getRequestEntity(request), EtisalatSassServiceObjectResponse.class);
        if (this.isValidResponseEntity(responseEntity)) {
            return responseEntity.getBody();
        }
        return null;
    }

}
