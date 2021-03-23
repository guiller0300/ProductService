package com.example.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.productservice.dto.ProductDto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;
import reactor.core.publisher.Sinks.Many;

@Configuration
public class SinkConfig {
	
	@Bean
	public Many<ProductDto> sink() {
		return Sinks.many().replay().limit(0);//muchos 
	}
	
	@Bean
	public Flux<ProductDto> productBroadcast(Sinks.Many<ProductDto> sink){
		return sink.asFlux();
	}
}
