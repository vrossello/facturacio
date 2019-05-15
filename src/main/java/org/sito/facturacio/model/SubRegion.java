package org.sito.facturacio.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class SubRegion extends TimeStamp{
	private Long id;
	private String name;
	private Region region;	
}
