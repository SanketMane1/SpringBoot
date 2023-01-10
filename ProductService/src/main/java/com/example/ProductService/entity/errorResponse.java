package com.example.ProductService.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class errorResponse {
	
	private String errorMessage;
	private String errorCode;
	
	

	

}
