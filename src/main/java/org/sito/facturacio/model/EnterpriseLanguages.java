package org.sito.facturacio.model;

import lombok.Data;

@Data
public class EnterpriseLanguages {
	private Enterprise enterprise;
	private Language language;
	private Boolean active;
	private Boolean master;
	private Integer order;
}
