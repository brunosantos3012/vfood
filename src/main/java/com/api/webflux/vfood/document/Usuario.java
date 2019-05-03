package com.api.webflux.vfood.document;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Document
public class Usuario extends DTOBase {
	
	@Id
	private String id;
	
	@NotEmpty
	private String nome;
	
	private boolean status;
	
	@NotEmpty
	@DBRef
	private Perfil perfil;
}
