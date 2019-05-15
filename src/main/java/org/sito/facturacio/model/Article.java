package org.sito.facturacio.model;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Article extends TimeStamp {	
	private Long id;
	private Enterprise enterprise;
	private String code;
	private String description;
	private Currency currency;
	private Float price;
	private Date activationDate;
	private Date deactivationDate;
	private Category category;
}
