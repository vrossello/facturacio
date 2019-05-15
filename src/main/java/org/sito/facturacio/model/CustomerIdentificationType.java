package org.sito.facturacio.model;

public enum CustomerIdentificationType {
    DNI (1),
    NIF (2),
    PASSPORT (3);
    
    private final Integer code;
    
    CustomerIdentificationType(Integer code){
    	this.code=code;
    }
    
    public Integer getCode(){
    	return this.code;
    }
}
