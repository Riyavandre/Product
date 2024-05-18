package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.product.entity.MasterTable;
import com.product.entity.Product;
import com.product.reposatory.MasterRepo;
import com.product.reposatory.ProductRepo;

@Component
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepo service;
	@Autowired
	private MasterRepo repo;
	
	
	public Product save(Product productTable,MasterTable table) {
		 // TODO Auto-generated method stub
		repo.save(table);
		return service.save(productTable);
	}

	
	public List<Product> findByCompanyNameAndLocationId(String companyName, int locationId) {
		// TODO Auto-generated method stub
		return service.findByProdLocationIdAndCompanyName(locationId,companyName);
	}


	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return service.findAll();
	}


	@Override
	public Product editProduct(Product product) {
		// TODO Auto-generated method stub
		Product product2=service.getById(product.getProdId());
		   product2.setProdName(product.getProdName());
		   product2.setProdPrize(product.getProdPrize());
		return service.save(product2);
	}

}
