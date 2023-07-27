package com.example.demo.upload;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;

@Component
public class ProductLoader implements  ApplicationListener<ContextRefreshedEvent>  {

	private ProductRepository productRepository;
	
	private Logger log = LogManager.getLogger(ProductLoader.class);
	
	@Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
	
	@Override
	public void onApplicationEvent (ContextRefreshedEvent event  ) {
		
		Product shirt = new Product();
		
		shirt.setDescription("Spring Polera");
		shirt.setPrice(new BigDecimal("12.56"));
		shirt.setProductId("20230001");
		productRepository.save(shirt);
		
		
		log.info("SAVED EXITO - id  " + shirt.getId());
		
		Product pantalon = new Product();
		
		pantalon.setDescription("Pantalon Corto de Verano");
		pantalon.setProductId("20230002");
		pantalon.setPrice(new BigDecimal ("22.99"));
		productRepository.save(pantalon);
		
		
		log.info("SAVED Exito - id" + pantalon.getId()); 
		
		
	}
	
	
	
}