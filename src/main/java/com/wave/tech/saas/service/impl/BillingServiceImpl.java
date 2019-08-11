package com.wave.tech.saas.service.impl;

import com.wave.tech.saas.dto.EtisalatSassServiceListResponse;
import com.wave.tech.saas.dto.billing.GetBillingInfoRequest;
import com.wave.tech.saas.dto.billing.GetBillingInfoResponse;
import com.wave.tech.saas.service.BillingService;
import com.wave.tech.saas.wrapper.BillingWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohamed.abdelsalam
 */
@Service
public class BillingServiceImpl implements BillingService {

    private final BillingWrapper billingWrapper;

    @Autowired
    public BillingServiceImpl(BillingWrapper billingWrapper) {
        this.billingWrapper = billingWrapper;
    }

    @Override
    public EtisalatSassServiceListResponse<GetBillingInfoResponse> getBillingInformation(GetBillingInfoRequest request) throws Exception {
        return billingWrapper.getBillingInformation(request);
    }

}
