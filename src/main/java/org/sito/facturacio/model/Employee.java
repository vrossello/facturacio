package org.sito.facturacio.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Employee extends TimeStamp{
	private Long id;
	public Enterprise enterprise;
	private String name;
	private String firstname;
	private String middlename;
	private String lastname;
	private String tlf;
	private String tlf2;
	private String fax;
	private String email;
	private String comments;
	private String identifier; //DNI-NIF	
	private CustomerIdentificationType typeIdentifier;
	private List<Address> addresses;
	private Boolean active;	
}
