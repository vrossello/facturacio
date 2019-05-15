package org.sito.facturacio.model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Enterprise extends TimeStamp{
	private Long id;
	private String name;
	private String tlf;
	
	public String getDataString(){
		return this.getName()+" - "+this.getTlf();
	}
}
