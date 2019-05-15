package org.sito.facturacio.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Region extends TimeStamp{
	private Long id;
	private String name;
	private Country country;
	
}
