package org.sito.facturacio.model;

import lombok.Data;

@Data
public class Country{
	private Long id;
	private String isoCode;
	private Boolean active;
}
