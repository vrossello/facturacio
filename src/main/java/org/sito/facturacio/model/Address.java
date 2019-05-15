package org.sito.facturacio.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Address extends TimeStamp {
	private Long id;
	private Customer customer; 
	private String name;
	private String street1;
	private String street2;
	private String street3;
	private String city;
	private String zip;
	private Region region;
}
