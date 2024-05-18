package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.entity.MasterTable;
import com.product.entity.Product;
import com.product.service.ProductService;

@Controller
public class ProductController {

	
	    @Autowired
	    private ProductService productTableService;

	    @GetMapping("/insert")
	    public String showInsertForm() {
	        return "home";
	    }

	    @PostMapping("/insert")
	    public String saveDetails(@ModelAttribute Product productTable,@ModelAttribute MasterTable table) {
	    System.out.println(productTable);
	    productTableService.save(productTable,table);
	        return "home";
	    }

	    @GetMapping("/search")
	    public String showSearchFormM(Model model) {
	    	List<Product>list= productTableService.getAllProduct();
	    	model.addAttribute("products",list);
	        return "searchProduct";
	    }

	    @PostMapping("/editProduct")
	    public String searchProducts(@ModelAttribute Product product, Model model) {
	    	System.out.println("production Id is  "+product.getProdId());
	    	   Product product2= productTableService.editProduct(product);
	    	List<Product>list= productTableService.findByCompanyNameAndLocationId(product2.getCompanyName(), product2.getProdLocationId());
	    	model.addAttribute("products",list);
	    	return "searchProduct";
	       
	    }
	    @PostMapping("/getsearch")
	    public String editProducts(@RequestParam String companyName, @RequestParam int locationId, Model model) {
	    	List<Product>list= productTableService.findByCompanyNameAndLocationId(companyName, locationId);
	    	model.addAttribute("products",list);
	    	return "searchProduct";
	       
	    }
	    
}
