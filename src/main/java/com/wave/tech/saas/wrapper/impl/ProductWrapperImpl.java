package com.wave.tech.saas.wrapper.impl;

import com.wave.tech.saas.dto.EtisalatSassServiceObjectResponse;
import com.wave.tech.saas.dto.product.CreateProductRequest;
import com.wave.tech.saas.dto.product.CreateProductResponse;
import com.wave.tech.saas.dto.product.ReactivateProductRequest;
import com.wave.tech.saas.dto.product.ReactivateProductResponse;
import com.wave.tech.saas.dto.product.SuspendProductRequest;
import com.wave.tech.saas.dto.product.SuspendProductResponse;
import com.wave.tech.saas.wrapper.ProductWrapper;
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
public class ProductWrapperImpl extends SassCustomWrapper implements ProductWrapper {

    @Value("${etisalat.saas.product.create}")
    private String createProducr;
    @Value("${etisalat.saas.product.suspend}")
    private String suspendProduct;
    @Value("${etisalat.saas.product.reactivate}")
    private String reActivateProduct;

    @Override
    public EtisalatSassServiceObjectResponse<CreateProductResponse> createProduct(CreateProductRequest request) throws Exception {
        ResponseEntity<EtisalatSassServiceObjectResponse> responseEntity
                = this.getRestTemplate().exchange(this.getServiceUri(createProducr),
                        HttpMethod.POST, this.getRequestEntity(request), EtisalatSassServiceObjectResponse.class);
        if (this.isValidResponseEntity(responseEntity)) {
            return responseEntity.getBody();
        }
        return null;
    }

    @Override
    public EtisalatSassServiceObjectResponse<SuspendProductResponse> suspendProduct(SuspendProductRequest request) throws Exception {
        ResponseEntity<EtisalatSassServiceObjectResponse> responseEntity
                = this.getRestTemplate().exchange(this.getServiceUri(suspendProduct),
                        HttpMethod.POST, this.getRequestEntity(request), EtisalatSassServiceObjectResponse.class);
        if (this.isValidResponseEntity(responseEntity)) {
            return responseEntity.getBody();
        }
        return null;
    }

    @Override
    public EtisalatSassServiceObjectResponse<ReactivateProductResponse> reactivateProduct(ReactivateProductRequest request) throws Exception {
        ResponseEntity<EtisalatSassServiceObjectResponse> responseEntity
                = this.getRestTemplate().exchange(this.getServiceUri(reActivateProduct),
                        HttpMethod.POST, this.getRequestEntity(request), EtisalatSassServiceObjectResponse.class);
        if (this.isValidResponseEntity(responseEntity)) {
            return responseEntity.getBody();
        }
        return null;
    }

}
