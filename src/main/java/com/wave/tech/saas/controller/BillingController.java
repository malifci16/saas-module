package com.wave.tech.saas.controller;

import com.wave.tech.saas.defines.ApiEndPoints;
import com.wave.tech.saas.dto.EtisalatSassServiceListResponse;
import com.wave.tech.saas.dto.billing.GetBillingInfoRequest;
import com.wave.tech.saas.dto.billing.GetBillingInfoResponse;
import com.wave.tech.saas.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mohamed.abdelsalam
 */
@RestController
@RequestMapping(ApiEndPoints.BILLING_CONTROLLER.CONTROLLER_NAME)
public class BillingController {

    private final BillingService billingService;

    @Autowired
    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @GetMapping(ApiEndPoints.BILLING_CONTROLLER.GET_INFO)
    public EtisalatSassServiceListResponse<GetBillingInfoResponse>
            getBillingInformation() throws Exception {
        return this.billingService.getBillingInformation(new GetBillingInfoRequest(""));
    }

}
