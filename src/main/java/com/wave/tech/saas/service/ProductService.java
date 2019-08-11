package com.wave.tech.saas.service;

import com.wave.tech.saas.dto.EtisalatSassServiceObjectResponse;
import com.wave.tech.saas.dto.product.CreateProductRequest;
import com.wave.tech.saas.dto.product.CreateProductResponse;
import com.wave.tech.saas.dto.product.ReactivateProductRequest;
import com.wave.tech.saas.dto.product.ReactivateProductResponse;
import com.wave.tech.saas.dto.product.SuspendProductRequest;
import com.wave.tech.saas.dto.product.SuspendProductResponse;

/**
 *
 * @author mohamed.abdelsalam
 */
public interface ProductService {

    public EtisalatSassServiceObjectResponse<CreateProductResponse>
            createProduct(CreateProductRequest request) throws Exception;

    public EtisalatSassServiceObjectResponse<SuspendProductResponse>
            suspendProduct(SuspendProductRequest request) throws Exception;

    public EtisalatSassServiceObjectResponse<ReactivateProductResponse>
            reactivateProduct(ReactivateProductRequest request) throws Exception;

}
