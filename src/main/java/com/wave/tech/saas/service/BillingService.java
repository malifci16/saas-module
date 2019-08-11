package com.wave.tech.saas.service;

import com.wave.tech.saas.dto.EtisalatSassServiceListResponse;
import com.wave.tech.saas.dto.billing.GetBillingInfoRequest;
import com.wave.tech.saas.dto.billing.GetBillingInfoResponse;

/**
 *
 * @author mohamed.abdelsalam
 */
public interface BillingService {

    public EtisalatSassServiceListResponse<GetBillingInfoResponse>
            getBillingInformation(GetBillingInfoRequest request) throws Exception;

}
