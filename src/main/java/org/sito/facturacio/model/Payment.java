package org.sito.facturacio.model;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Payment extends TimeStamp {
	private Long id;
	private Date date;
	private Invoice invoice;
	private Float quantity;
	private Currency currency;
	private String comments;
}
