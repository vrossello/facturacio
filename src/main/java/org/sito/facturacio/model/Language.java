package org.sito.facturacio.model;

import lombok.Data;

@Data
public class Language {
	private Long id;
	private String name;
	private String iso2;
	private String iso3;
	private String dateFormatLite;
	private String dateFormatFull;

}
