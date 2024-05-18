package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.entity.MasterTable;
import com.product.entity.Product;

@Service
public interface ProductService {
	 Product save(Product productTable,MasterTable table);
	  List<Product> findByCompanyNameAndLocationId(String companyName, int locationId);
	  List<Product> getAllProduct();
	Product editProduct(Product product);

}

