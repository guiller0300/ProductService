package com.example.productservice.util;

import org.springframework.beans.BeanUtils;

import com.example.productservice.dto.ProductDto;
import com.example.productservice.entity.Products;

public class EntityDtoUtil {
	
	public static ProductDto toDto(Products product) {
		ProductDto dto =  new ProductDto();
		BeanUtils.copyProperties(product, dto);
		return dto;
	}
	
	public static Products toEntity(ProductDto productDto) {
		Products product = new Products();
		BeanUtils.copyProperties(productDto, product);
		return product;
	}
	public static ProductDto toDto(Products product, String subscribe) {
		ProductDto dto =  new ProductDto();
		product.setSubscriber(subscribe);
		BeanUtils.copyProperties(product, dto);
		return dto;
	}
	
	public static Products toEntity(ProductDto productDto, String susbcribe) {
		Products product = new Products();
		product.setSubscriber(susbcribe);
		BeanUtils.copyProperties(productDto, product);
		return product;
	}
}
