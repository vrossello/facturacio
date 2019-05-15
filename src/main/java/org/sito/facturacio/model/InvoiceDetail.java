package org.sito.facturacio.model;

import lombok.Data;

@Data
public class InvoiceDetail {
	private Long id;
	private Invoice invoice;
	private Long index;
	private Long parentId;
	
	private Article article; //optional relation
	
	private String articleDescription;
	
	private Float quantity;
	private Float price;
	private Float discount;
	private Float total;
	
}
