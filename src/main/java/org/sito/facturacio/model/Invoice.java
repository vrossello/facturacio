package org.sito.facturacio.model;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Invoice extends FinancialDocument{
	private Float comission;
	private Float discount;
	private Float tax;
	
	private Float totalDiscount;
	private Float totalTax;
	private Float total;
	
	
	private Date invalidationDate;
	private Boolean valid;
	
	static{
		
	}
}
