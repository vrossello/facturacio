package org.sito.facturacio.model;

import java.util.Date;

import lombok.Data;

@Data
public abstract class FinancialDocument extends TimeStamp{
	private Long id;
	private Enterprise enterprise;
	private Integer type; //Invoice,budget,delivery note,order
	
	private Customer customer;
	private Date date;
	private Date dueDate; //fecha de vencimiento
	
	private String customId; //Format especial de factures
	
	private String descriptionLite;
	private String descriptionFull;
	
	private Currency currency;
}
