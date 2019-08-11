package com.wave.tech.saas.service.impl;

import com.wave.tech.saas.dto.EtisalatSassServiceObjectResponse;
import com.wave.tech.saas.dto.product.CreateProductRequest;
import com.wave.tech.saas.dto.product.CreateProductResponse;
import com.wave.tech.saas.dto.product.ReactivateProductRequest;
import com.wave.tech.saas.dto.product.ReactivateProductResponse;
import com.wave.tech.saas.dto.product.SuspendProductRequest;
import com.wave.tech.saas.dto.product.SuspendProductResponse;
import com.wave.tech.saas.service.ProductService;
import com.wave.tech.saas.wrapper.ProductWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohamed.abdelsalam
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductWrapper productWrapper;

    @Autowired
    public ProductServiceImpl(ProductWrapper productWrapper) {
        this.productWrapper = productWrapper;
    }

    @Override
    public EtisalatSassServiceObjectResponse<CreateProductResponse> createProduct(CreateProductRequest request) throws Exception {
        return productWrapper.createProduct(request);
    }

    @Override
    public EtisalatSassServiceObjectResponse<SuspendProductResponse> suspendProduct(SuspendProductRequest request) throws Exception {
        return productWrapper.suspendProduct(request);
    }

    @Override
    public EtisalatSassServiceObjectResponse<ReactivateProductResponse> reactivateProduct(ReactivateProductRequest request) throws Exception {
        return productWrapper.reactivateProduct(request);
    }

}
