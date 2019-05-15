package org.sito.facturacio.model;

import java.util.Date;

import lombok.Data;

@Data
public class Taxes {
	private Long id;
	private String name;
	private Float value;
	private Date activationDate;
	private Date deactivationDate;
	private Boolean active;
}
