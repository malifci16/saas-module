package com.wave.tech.saas.wrapper.impl;

import com.wave.tech.saas.dto.EtisalatSassServiceListResponse;
import com.wave.tech.saas.dto.billing.GetBillingInfoRequest;
import com.wave.tech.saas.dto.billing.GetBillingInfoResponse;
import com.wave.tech.saas.wrapper.BillingWrapper;
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
public class BillingWrapperImpl extends SassCustomWrapper implements BillingWrapper {

    @Value("${etisalat.saas.billing.info}")
    private String billingInfo;

    @Override
    public EtisalatSassServiceListResponse<GetBillingInfoResponse>
            getBillingInformation(GetBillingInfoRequest request) throws Exception {
        ResponseEntity<EtisalatSassServiceListResponse> responseEntity
                = this.getRestTemplate().exchange(this.getServiceUri(billingInfo),
                        HttpMethod.GET, this.getRequestEntity(request), EtisalatSassServiceListResponse.class);
        if (this.isValidResponseEntity(responseEntity)) {
            return responseEntity.getBody();
        }
        return null;
    }

}
