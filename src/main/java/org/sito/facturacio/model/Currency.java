package org.sito.facturacio.model;

import lombok.Data;

@Data
public class Currency {
	private Long id;
	private Country country;
	private String name;
	private String sign; //€
	private String pattern; //dddddd,ddd
	private Integer decimal;//3 round
	private Boolean deleted;
	private Boolean active;
}
