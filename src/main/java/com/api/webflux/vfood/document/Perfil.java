package com.api.webflux.vfood.document;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Document
public class Perfil extends DTOBase {

	@Id
	private String id;
	
	@NotEmpty
	private String nome;
}