package com.client.api.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {

	private Long id;

	@javax.validation.constraints.NotBlank(message = "campo name não pode ser nulo ou vazio")
	@javax.validation.constraints.Size(min = 5, max = 30, message = "campo name deve ter tamanho entre 5 e 30")
	private String name;

	@javax.validation.constraints.Max(value = 12, message = "campo acessMonth não pode ser maior que 12")
	private Long acessMonths;

	@javax.validation.constraints.NotNull(message = "campo price não pode ser nulo")
	private BigDecimal price;

	@javax.validation.constraints.NotBlank(message = "campo productKey não pode ser nulo ou vazio")
	@javax.validation.constraints.Size(min = 5, max = 15, message = "campo productKey deve ter tamanho entre 5 e 15")
	private String productKey;
}
