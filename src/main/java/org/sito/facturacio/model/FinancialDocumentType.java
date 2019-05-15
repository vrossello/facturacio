package org.sito.facturacio.model;

public enum FinancialDocumentType {
    INVOICE (0), //factura
    DELIVERYNOTE (1), //albarán
    BUDGET (2), //presupuesto
    PROFORMA (3), // fact proforma
    PAYMENT (4); //factura de abono
    
    private final Integer code;
    
    FinancialDocumentType(Integer code){
    	this.code=code;
    }
    
    public Integer getCode(){
    	return this.code;
    }
}
