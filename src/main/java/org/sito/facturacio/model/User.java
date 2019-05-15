package org.sito.facturacio.model;

import lombok.Data;

@Data
public class User {
	private Long id;
	private Enterprise enterprise;
	private String userName;	
	private String email;
	private String firstName;
	private String lastName;
	private String middleName;
	private String screenName;
	private String password;
	private String passwordModifiedDate;
	private String passwordReset;

}
